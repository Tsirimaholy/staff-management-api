package com.example.enterprisefinalexam.service;

import com.example.enterprisefinalexam.model.Position;
import com.example.enterprisefinalexam.model.Staff;
import com.example.enterprisefinalexam.repository.PositionRepository;
import com.example.enterprisefinalexam.repository.StaffRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PositionService {
    private final PositionRepository positionRepository;
    private final StaffService staffService;
    private final StaffRepository staffRepository;

    public List<Position> createsOrUpdates(List<Position> positions){
        return positionRepository.saveAll(positions);
    }


    public List<Position> getAll(){
        return positionRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    public Staff updateStaffPosition(Long idStaff, Long idPosition){
        Staff staff = staffService.findById(idStaff);
        Position position = positionRepository.findById(idPosition).orElseThrow();
        staff.setPosition(position);

        return staffRepository.save(staff);
    }
}   
