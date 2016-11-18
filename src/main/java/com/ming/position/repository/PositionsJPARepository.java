package com.ming.position.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ming.position.domain.TestJPA;

public interface TestJPARepository extends JpaRepository<TestJPA, Long> {

}
