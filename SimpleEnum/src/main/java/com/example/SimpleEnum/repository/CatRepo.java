package com.example.SimpleEnum.repository;

import com.example.SimpleEnum.model.Cat;
import com.example.SimpleEnum.model.Color;
import com.example.SimpleEnum.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepo extends JpaRepository<Cat, Long> {
    List<Cat> findByGenderAndColor(Gender gender, Color color);
    List<Cat> findByColor(Color color);
}
