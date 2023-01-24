package com.example.mobilelele.services.userRole;

import com.example.mobilelele.services.init.DataBaseInitService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService, DataBaseInitService {
    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return false;
    }
}
