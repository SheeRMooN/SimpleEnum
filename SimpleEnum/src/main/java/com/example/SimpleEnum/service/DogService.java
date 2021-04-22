package com.example.SimpleEnum.service;

import com.example.SimpleEnum.model.*;
import com.example.SimpleEnum.repository.DogRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DogService {
    DogRepo repo;

    public List<Dog> findByColor(Color color){
        return repo.findByColor(color);
    }

    public List<Dog> findByGenderAndColor(Gender gender, Color color){
        return repo.findByGenderAndColor(gender, color);
    }

    public Dog create(Dog dog) {
        return repo.save(dog);
    }
}
