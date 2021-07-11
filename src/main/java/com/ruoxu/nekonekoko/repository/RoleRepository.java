package com.ruoxu.nekonekoko.repository;

import com.ruoxu.nekonekoko.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ruoxu
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
