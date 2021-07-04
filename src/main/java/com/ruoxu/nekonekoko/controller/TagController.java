package com.ruoxu.nekonekoko.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoxu.nekonekoko.dto.TagDto;
import com.ruoxu.nekonekoko.service.TagService;
import com.ruoxu.nekonekoko.util.JsonConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ruoxu
 */
@RestController
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping("/getAllTags")
    public String getAllTags() throws JsonProcessingException {
        return JsonConverter.toString(tagService.getAllTags());
    }

    @PostMapping("/addTag")
    public void addTag(@RequestBody TagDto tagDto) {
        tagService.saveTag(tagDto);
    }
}
