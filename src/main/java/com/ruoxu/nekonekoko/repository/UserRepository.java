package com.ruoxu.nekonekoko.repository;

import com.ruoxu.nekonekoko.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ruoxu
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * find user by name
     * @param name name
     * @return User
     */
    User findByName(String name);

    User findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
