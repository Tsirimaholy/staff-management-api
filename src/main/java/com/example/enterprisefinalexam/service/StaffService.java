package com.example.enterprisefinalexam.service;

import com.example.enterprisefinalexam.model.Position;
import com.example.enterprisefinalexam.model.Staff;
import com.example.enterprisefinalexam.repository.StaffRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StaffService {
    private final StaffRepository staffRepository;

    public List<Staff> getAll(int page, int pageSize) {
        PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by(Sort.Direction.ASC, "firstName", "lastName"));
        return staffRepository.findAll(pageRequest).toList();
    }

    public Staff findById(Long id){
        return staffRepository.findById(id).orElseThrow();
    }

    public List<Staff> saveAll(List<Staff> staffs) {
        return staffRepository.saveAll(staffs);
    }

    public String delete(Long id) {
        if (staffRepository.findById(id).isPresent()) {
            staffRepository.delete(staffRepository.findById(id).get());
            return "Staff successfully deleted";
        }
        return "Staff with id= " + id + " Not Found";
    }
}
