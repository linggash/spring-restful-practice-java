package com.linggash.restful.service;

import com.linggash.restful.entity.User;
import com.linggash.restful.model.RegisterUserRequest;
import com.linggash.restful.model.UserResponse;

public interface UserService {

    void register (RegisterUserRequest request);

    UserResponse get(User user);
}
