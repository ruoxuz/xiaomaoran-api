package com.ruoxu.nekonekoko.repository;

import com.ruoxu.nekonekoko.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ruoxu
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
