package com.example.mobilelele.services.userRole;

import com.example.mobilelele.domenin.dtos.view.UserRoleViewModel;
import com.example.mobilelele.services.init.DataBaseInitService;

import java.util.List;

public interface UserRoleService extends DataBaseInitService {
    List<UserRoleViewModel> getAll();
}
