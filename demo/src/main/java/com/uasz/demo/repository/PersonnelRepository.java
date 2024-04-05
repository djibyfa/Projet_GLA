package com.uasz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uasz.demo.modele.Personnel;

public interface PersonnelRepository  extends JpaRepository<Personnel,Long>{
    
}
