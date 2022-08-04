package com.laptrinhspringboost.demo.repository;

import com.laptrinhspringboost.demo.entity.AppUser;
import com.laptrinhspringboost.demo.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
