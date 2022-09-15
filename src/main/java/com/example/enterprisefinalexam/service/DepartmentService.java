package com.example.enterprisefinalexam.service;

import com.example.enterprisefinalexam.model.Department;
import com.example.enterprisefinalexam.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public List<Department> getAll(){
        return departmentRepository.findAll();
    }

    public List<Department> createsOrUpdates(List<Department> departments){
        return departmentRepository.saveAll(departments);
    }
}
