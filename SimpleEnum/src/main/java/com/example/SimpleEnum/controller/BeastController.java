package com.example.SimpleEnum.controller;

import com.example.SimpleEnum.model.Beast;
import com.example.SimpleEnum.model.Color;
import com.example.SimpleEnum.model.Gender;
import com.example.SimpleEnum.service.BeastService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/beast")
public class BeastController {
    BeastService beastService;

//    @GetMapping("/get/{gender}/{color}")
//    public List<Beast> findByGenderAndColor(@RequestBody Gender gender,@RequestBody Color color){
//        return beastService.findByGenderAndColor(gender,color);
//    }
//
//    @PostMapping("/post")
//    public Beast creat(@RequestBody Beast beast){
//        return beastService.create(beast);
//    }
}
