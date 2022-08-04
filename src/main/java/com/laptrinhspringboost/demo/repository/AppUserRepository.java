package com.laptrinhspringboost.demo.repository;

import com.laptrinhspringboost.demo.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    AppUser findByUserName(String userName);
}
