package com.nhnacademy.springjpa.repository;

import com.nhnacademy.springjpa.entity.CertificateIssue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateIssuRepository extends JpaRepository<CertificateIssue, Integer> {
}
