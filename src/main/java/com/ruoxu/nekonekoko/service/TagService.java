package com.ruoxu.nekonekoko.service;

import com.ruoxu.nekonekoko.dto.TagDto;
import com.ruoxu.nekonekoko.model.Tag;
import com.ruoxu.nekonekoko.repository.TagRepository;
import com.ruoxu.nekonekoko.util.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruoxu
 */
@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public List<TagDto> getAllTags() {
        List<Tag> tags = tagRepository.findAll();
        List<TagDto> tagDtoList = new ArrayList<>();
        tags.forEach(tag -> {
            var tagDto = new TagDto();
            tagDto.setName(tag.getName());
            tagDtoList.add(tagDto);
        });
        return tagDtoList;
    }

    public Tag saveTag(TagDto tagDto) {
        var tag = tagRepository.findByName(tagDto.getName());
        if (tag == null) {
            var tagToSave = new Tag();
            tagToSave.setUuid(UUIDGenerator.getUUID());
            tagToSave.setName(tagDto.getName());
            return tagRepository.save(tagToSave);
        }
        return tag;
    }
}
