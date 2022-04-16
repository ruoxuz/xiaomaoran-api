package com.ruoxu.xiaomaoran.dao;

import com.ruoxu.xiaomaoran.model.UserDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleDao {
    UserDetail getUserDetailByUsername(String username);
}
