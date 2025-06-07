package com.cibil.cibil.repository;

import com.cibil.cibil.model.CibilScore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CibilScoreRepository extends JpaRepository<CibilScore, Long> {
    Optional<CibilScore> findByUserId(String userId);
}