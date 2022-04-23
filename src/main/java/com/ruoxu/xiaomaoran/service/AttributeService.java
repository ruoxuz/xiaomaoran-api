package com.ruoxu.xiaomaoran.service;

import com.ruoxu.xiaomaoran.dto.AttributeDto;

import java.util.List;

public interface AttributeService {

    public List<AttributeDto> getAllAttribute();

    public int saveAttribute(AttributeDto attributeDto);
}
