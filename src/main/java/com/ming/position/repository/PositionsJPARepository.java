package com.ming.position.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ming.position.domain.PositionsJPA;

public interface PositionsJPARepository extends JpaRepository<PositionsJPA, Long> {

}
