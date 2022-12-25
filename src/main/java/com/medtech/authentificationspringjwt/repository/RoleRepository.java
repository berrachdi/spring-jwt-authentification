package com.medtech.authentificationspringjwt.repository;

import com.medtech.authentificationspringjwt.model.ERole;
import com.medtech.authentificationspringjwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
