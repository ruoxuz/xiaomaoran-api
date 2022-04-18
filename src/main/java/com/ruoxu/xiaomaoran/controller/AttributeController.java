package com.ruoxu.xiaomaoran.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoxu.xiaomaoran.dto.AttributeDto;
import com.ruoxu.xiaomaoran.service.AttributeService;
import com.ruoxu.xiaomaoran.common.util.JsonConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ruoxu
 */
@RestController
public class AttributeController {
    @Autowired
    private AttributeService attributeService;

    /**
     * 获取所有标签
     * @return
     * @throws JsonProcessingException
     */
    @GetMapping("/getAllTags")
    public String getAllAttribute() throws JsonProcessingException {
        return JsonConverter.toString(attributeService.getAllAttribute());
    }

    /**
     * 添加标签
     * @param attributeDto
     */
    @PostMapping("/addTag")
    public void addTag(@RequestBody AttributeDto attributeDto) {
        attributeService.saveAttribute(attributeDto);
    }
}
