package com.sendsecure.application.service;

import com.sendsecure.application.domain.Role;
import com.sendsecure.application.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Role Service
 * @copyright Danilo Jakob
 */
@Service
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    public List<Role> findAll() {
        return this.roleRepository.findAll();
    }
}
