package com.prodapt.cmsprojectmain.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.prodapt.cmsprojectmain.entities.ERole;
import com.prodapt.cmsprojectmain.entities.Role;
import com.prodapt.cmsprojectmain.repositories.RoleRepository;

class RoleServiceImplTest {

    private RoleServiceImpl roleService;
    private RoleRepository roleRepository;

    @BeforeEach
    void setUp() {
        roleRepository = mock(RoleRepository.class);
        roleService = new RoleServiceImpl();
        roleService.setRepo(roleRepository);
    }

    @Test
    void testFindRoleByName() {
        ERole roleName = ERole.ROLE_CUSTOMER;
        Role role = new Role();
        role.setName(roleName);
        Optional<Role> roleOptional = Optional.of(role);
        when(roleRepository.findByName(roleName)).thenReturn(roleOptional);
        Optional<Role> retrievedRoleOptional = roleService.findRoleByName(roleName);
        assertTrue(retrievedRoleOptional.isPresent());
        assertEquals(roleName, retrievedRoleOptional.get().getName());
    }

    @Test
    void testFindRoleById() {
        int roleId = 1;
        Role role = new Role();
        role.setId(roleId);
        Optional<Role> roleOptional = Optional.of(role);
        when(roleRepository.findById(roleId)).thenReturn(roleOptional);
        Optional<Role> retrievedRoleOptional = roleService.findRoleById(roleId);
        assertTrue(retrievedRoleOptional.isPresent());
        assertEquals(roleId, retrievedRoleOptional.get().getId());
    }
}

