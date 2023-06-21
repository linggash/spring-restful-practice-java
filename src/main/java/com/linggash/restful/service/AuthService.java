package com.linggash.restful.service;

import com.linggash.restful.entity.User;
import com.linggash.restful.model.LoginUserRequest;
import com.linggash.restful.model.TokenResponse;

public interface AuthService {

    TokenResponse login(LoginUserRequest request);

    void logout(User user);
}