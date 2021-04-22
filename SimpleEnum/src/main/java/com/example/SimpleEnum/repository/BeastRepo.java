package com.example.SimpleEnum.repository;

import com.example.SimpleEnum.model.Beast;
import com.example.SimpleEnum.model.Color;
import com.example.SimpleEnum.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeastRepo extends JpaRepository<Beast, Long> {
    @Override
    List<Beast> findAll();

    @Override
    Beast getOne(Long aLong);

    List<Beast> findByGenderAndColor(Gender gender, Color color);
}
