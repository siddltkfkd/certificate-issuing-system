package com.nhnacademy.springjpa.repository;


import com.nhnacademy.springjpa.domain.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident, Integer> {
}
