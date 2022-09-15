package com.example.enterprisefinalexam.controller;


import com.example.enterprisefinalexam.model.Position;
import com.example.enterprisefinalexam.service.PositionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/positions")
public class PositionController {
    private final PositionService positionService;

    @GetMapping("")
    public List<Position> getAll(){
        return positionService.getAll();
    }

    @PostMapping("")
    public List<Position> saveAll(@RequestBody List<Position> positions){
        return positionService.createsOrUpdates(positions);
    }
}
