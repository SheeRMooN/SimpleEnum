package com.example.SimpleEnum.controller;

import com.example.SimpleEnum.model.Cat;
import com.example.SimpleEnum.model.Color;
import com.example.SimpleEnum.model.Gender;
import com.example.SimpleEnum.service.CatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CatController {
    CatService service;

    @GetMapping("/get/{gender}/{color}")
    public List<Cat> findByGenderAndColor(@RequestBody Gender gender, @RequestBody Color color){
        return service.findByGenderAndColor(gender,color);
    }
    @GetMapping("/get/{color}")
    public List<Cat> findByColor(@PathVariable Color color){
        return service.findByColor(color);
    }

    @PostMapping("/post")
    public Cat creat(@RequestBody Cat cat){
        return service.create(cat);
    }
}
