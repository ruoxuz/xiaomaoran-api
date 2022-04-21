package com.ruoxu.xiaomaoran.dto;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author ruoxu
 */
@Data
public class ArticleSummaryDto {
    private String uuid;

    private String title;

    private String content;

    private Boolean personal;

    private Set<AttributeDto> attributes;

    private Date createTime;

    private Date updateTime;
}
