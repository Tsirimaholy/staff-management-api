package com.example.enterprisefinalexam.controller;

import com.example.enterprisefinalexam.model.Vacation;
import com.example.enterprisefinalexam.service.VacationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vacations")
public class VacationController {
    private final VacationService vacationService;
    @GetMapping("/today")
    public List<Vacation> getTodayRequest(){
        return vacationService.getTodayVacationsRequest();
    }
}
