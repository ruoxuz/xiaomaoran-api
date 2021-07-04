package com.ruoxu.nekonekoko.repository;

import com.ruoxu.nekonekoko.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ruoxu
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}
