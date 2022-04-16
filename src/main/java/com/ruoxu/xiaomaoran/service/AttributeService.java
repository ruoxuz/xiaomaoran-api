package com.ruoxu.xiaomaoran.service;

import com.ruoxu.xiaomaoran.dto.AttributeDto;
import com.ruoxu.xiaomaoran.mapper.AttributeMapper;
import com.ruoxu.xiaomaoran.model.Attribute;
import com.ruoxu.xiaomaoran.model.Tag;
import com.ruoxu.xiaomaoran.util.UUIDGenerator;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.ruoxu.xiaomaoran.mapper.AttributeDynamicSqlSupport.attribute;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author ruoxu
 */
@Service
public class AttributeService {
    @Autowired
    private AttributeMapper attributeMapper;

    public List<AttributeDto> getAllAttribute() {
        List<Attribute> attributeList = attributeMapper.select(QueryExpressionDSL::where);
        List<AttributeDto> attributeDtoList = new ArrayList<>();
        attributeList.forEach(attr -> {
            var tagDto = new AttributeDto();
            tagDto.setName(attr.getName());
            attributeDtoList.add(tagDto);
        });
        return attributeDtoList;
    }

    public int saveAttribute(AttributeDto attributeDto) {
        List<Attribute> attributeList = attributeMapper.select(c -> c.where(attribute.name, isEqualTo(attributeDto.getName())));
        if (attributeList == null) {
            var tagToSave = new Attribute();
            tagToSave.setUuid(UUIDGenerator.getUUID());
            tagToSave.setName(attributeDto.getName());
            return attributeMapper.insert(tagToSave);
        }
        return 0;
    }
}
