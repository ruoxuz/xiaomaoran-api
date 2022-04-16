package com.ruoxu.xiaomaoran.service;

import com.ruoxu.xiaomaoran.dao.UserRoleDao;
import com.ruoxu.xiaomaoran.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author ruoxu
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetail userDetail = userRoleDao.getUserDetailByUsername(username);
        return UserPrinciple.build(userDetail);
    }
}
