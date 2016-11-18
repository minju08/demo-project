package com.ming.position.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ming.position.domain.BasicJPA;

public interface BasicJPARepository extends JpaRepository<BasicJPA, Long> {

}
