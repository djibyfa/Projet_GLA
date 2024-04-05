package com.uasz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uasz.demo.modele.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long>{
    
}
