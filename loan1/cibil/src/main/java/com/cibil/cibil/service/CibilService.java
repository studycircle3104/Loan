package com.cibil.cibil.service;


import com.cibil.cibil.model.CibilScore;
import com.cibil.cibil.repository.CibilScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CibilService {

    private final Map<String, Integer> mockCibilScores;
    @Autowired
    private CibilScoreRepository cibilScoreRepository;
    public CibilService() {
        mockCibilScores = new HashMap<>();
        mockCibilScores.put("user1", 750);
        mockCibilScores.put("user2", 680);
        mockCibilScores.put("user3", 720);
    }

    public int getCibilScore(String userId) {
        return mockCibilScores.getOrDefault(userId, 650);  // Default score if not found
    }

    // Save CibilScore to the database

    public CibilScore saveCibilScore(CibilScore cibilScore) {
        return cibilScoreRepository.save(cibilScore); // Save the score to the database
    }
}
