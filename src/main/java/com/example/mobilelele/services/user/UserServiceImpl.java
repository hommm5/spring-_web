package com.example.mobilelele.services.user;

import com.example.mobilelele.repositories.UserRepository;
import com.example.mobilelele.services.init.DataBaseInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, DataBaseInitService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.userRepository.count() >= 0;
    }
}
