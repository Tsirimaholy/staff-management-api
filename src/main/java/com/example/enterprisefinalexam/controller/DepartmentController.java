package com.example.enterprisefinalexam.controller;

import com.example.enterprisefinalexam.model.Department;
import com.example.enterprisefinalexam.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping("")
    public List<Department> getAll(){
        return departmentService.getAll();
    }

    @PutMapping("")
    public List<Department> create(@RequestBody List<Department> departments){
        return departmentService.createsOrUpdates(departments);
    }


}
