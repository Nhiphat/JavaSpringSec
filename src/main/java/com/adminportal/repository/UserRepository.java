package com.adminportal.repository;

import com.adminportal.domain.User;
import com.adminportal.domain.security.UserRole;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    User findByEmail(String email);

    Set<UserRole> findByUserRoles(String username);
}
