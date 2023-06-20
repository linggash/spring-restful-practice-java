package com.linggash.restful.service;

import com.linggash.restful.model.LoginUserRequest;
import com.linggash.restful.model.TokenResponse;

public interface AuthService {

    public TokenResponse login(LoginUserRequest request);
}