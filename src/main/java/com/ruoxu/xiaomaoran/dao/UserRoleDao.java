package com.ruoxu.xiaomaoran.dao;

import com.ruoxu.xiaomaoran.model.UserDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleDao {
    UserDetail getUserDetailByUsername(String username);
}
