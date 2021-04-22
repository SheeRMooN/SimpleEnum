package com.example.SimpleEnum.service;

import com.example.SimpleEnum.model.Cat;
import com.example.SimpleEnum.model.Color;
import com.example.SimpleEnum.model.Gender;
import com.example.SimpleEnum.repository.CatRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CatService {
    CatRepo repo;
    public List<Cat> findByColor(Color color){
        return repo.findByColor(color);
    }

    public List<Cat> findByGenderAndColor(Gender gender, Color color){
        return repo.findByGenderAndColor(gender, color);
    }

    public Cat create(Cat cat) {
        return repo.save(cat);
    }
}
