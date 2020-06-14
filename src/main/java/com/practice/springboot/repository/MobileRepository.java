package com.practice.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.springboot.model.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer>{

}
