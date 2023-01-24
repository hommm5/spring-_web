package com.example.mobilelele.services.userRole;

import com.example.mobilelele.domenin.dtos.model.UserRoleDto;
import com.example.mobilelele.domenin.dtos.view.UserRoleViewModel;
import com.example.mobilelele.domenin.entities.UserRole;
import com.example.mobilelele.domenin.enums.Role;
import com.example.mobilelele.repositories.UserRoleRepository;
import com.example.mobilelele.services.init.DataBaseInitService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRoleServiceImpl implements UserRoleService, DataBaseInitService {
    private final UserRoleRepository userRoleRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserRoleServiceImpl(UserRoleRepository userRoleRepository, ModelMapper modelMapper) {
        this.userRoleRepository = userRoleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void dbInit() {
        List<UserRole> roles = new ArrayList<>();

        roles.add(new UserRole().setRole(Role.USER));
        roles.add(new UserRole().setRole(Role.ADMIN));

        this.userRoleRepository.saveAllAndFlush(roles);
    }

    @Override
    public boolean isDbInit() {
        return this.userRoleRepository.count() > 0;
    }

    public List<UserRoleViewModel> getAll() {
        return this.userRoleRepository.findAll().stream()
                .map(r -> this.modelMapper.map(r, UserRoleViewModel.class))
                .collect(Collectors.toList());
    }
}
