package com.example.SimpleEnum.controller;

import com.example.SimpleEnum.model.Cat;
import com.example.SimpleEnum.model.Color;
import com.example.SimpleEnum.model.Dog;
import com.example.SimpleEnum.model.Gender;
import com.example.SimpleEnum.service.DogService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dog")
@AllArgsConstructor
public class DogController {
    DogService service;

    @GetMapping("/get_path/{gender}/{color}")
    public List<Dog> findByGenderAndColor(@PathVariable Gender gender, @PathVariable Color color){
        return service.findByGenderAndColor(gender,color);
    }
    @GetMapping("/get_path/{color}")
    public List<Dog> findByColor(@PathVariable Color color){
        return service.findByColor(color);
    }
    @GetMapping("/get_body/gender/color")
    public List<Dog> findByGenderAndColorBody(@RequestBody Gender gender, @RequestBody Color color){
        return service.findByGenderAndColor(gender,color);
    }
    @GetMapping("/get_body/color")
    public List<Dog> findByColorBody(@RequestBody Color color){
        return service.findByColor(color);
    }

    @PostMapping("/post")
    public Dog creat(@RequestBody Dog dog){
        return service.create(dog);
    }
}
