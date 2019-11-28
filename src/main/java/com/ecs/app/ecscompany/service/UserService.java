package com.ecs.app.ecscompany.service;

import com.ecs.app.ecscompany.model.UserInfo;
import com.ecs.app.ecscompany.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserInfo findByEmail(String email);

    UserInfo save(UserRegistrationDto registration);
}
