package com.example.SimpleEnum.service;

import com.example.SimpleEnum.model.Beast;
import com.example.SimpleEnum.model.Color;
import com.example.SimpleEnum.model.Gender;
import com.example.SimpleEnum.repository.BeastRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BeastService {
    BeastRepo repo;

    public List<Beast> findByGenderAndColor(Gender gender, Color color){
        return repo.findByGenderAndColor(gender, color);
    }

    public Beast create(Beast beast) {
        return repo.save(beast);
    }
}
