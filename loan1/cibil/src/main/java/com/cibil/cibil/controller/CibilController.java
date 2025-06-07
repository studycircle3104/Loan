package com.cibil.cibil.controller;

import com.cibil.cibil.model.CibilScore;
import com.cibil.cibil.service.CibilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cibil")
public class CibilController {

    @Autowired
    private CibilService cibilService;

    @GetMapping("/score/{userId}")
    public int getCibilScore(@PathVariable String userId) {
        return cibilService.getCibilScore(userId);
    }
    // POST method to insert data
    @PostMapping("/score")
    public CibilScore addCibilScore(@RequestBody CibilScore cibilScore) {
        return cibilService.saveCibilScore(cibilScore);
    }
}
