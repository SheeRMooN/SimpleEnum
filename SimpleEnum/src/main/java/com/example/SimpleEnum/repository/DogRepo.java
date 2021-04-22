package com.example.SimpleEnum.repository;

import com.example.SimpleEnum.model.Color;
import com.example.SimpleEnum.model.Dog;
import com.example.SimpleEnum.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogRepo extends JpaRepository<Dog, Long> {


    List<Dog> findByGenderAndColor(Gender gender, Color color);
    List<Dog> findByColor(Color color);
}
