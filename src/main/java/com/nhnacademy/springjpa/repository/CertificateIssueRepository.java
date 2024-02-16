package com.nhnacademy.springjpa.repository;


import com.nhnacademy.springjpa.domain.entity.CertificateIssue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateIssueRepository extends JpaRepository<CertificateIssue, Long> {
}
