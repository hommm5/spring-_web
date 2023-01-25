package com.example.mobilelele.services.init;

import com.example.mobilelele.services.userRole.UserRoleService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class DataInitServiceImpl implements DataBaseInitService {
    private final UserRoleService userRoleService;

    @Autowired
    public DataInitServiceImpl(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    @PostConstruct
    public void postConstruct(){
        dbInit();
    }

    @Override
    public void dbInit() {
        if (isDbInit()) {
            this.userRoleService.dbInit();
        }
    }
    @Override
    public boolean isDbInit() {
        return this.userRoleService.isDbInit();
    }
}
