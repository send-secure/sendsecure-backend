package com.sendsecure.application.repository;

import com.sendsecure.application.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Role Repository
 * @copyright Danilo Jakob
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
