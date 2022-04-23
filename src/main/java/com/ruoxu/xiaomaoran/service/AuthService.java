package com.ruoxu.xiaomaoran.service;

import com.ruoxu.xiaomaoran.dto.SignUpDto;

public interface AuthService {

    public boolean existsByUsername(String username);

    public boolean existsByEmail(String email);

    public void insertByDto (SignUpDto signUpDto);
}
