package com.example.enterprisefinalexam.controller;

import com.example.enterprisefinalexam.model.Staff;
import com.example.enterprisefinalexam.model.Vacation;
import com.example.enterprisefinalexam.service.PositionService;
import com.example.enterprisefinalexam.service.StaffService;
import com.example.enterprisefinalexam.service.VacationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/staffs")
public class StaffController {
    private final StaffService staffService;
    private final VacationService vacationService;
    private final PositionService positionService;

    @GetMapping("")
    public List<Staff> getAll(@RequestParam Optional<Integer> page, @RequestParam Optional<Integer> pageSize) {
        return staffService.getAll(page.orElse(0), pageSize.orElse(10));
    }

    @PutMapping("")
    public List<Staff> saveAll(@RequestBody List<Staff> staffList) {
        return staffService.saveAll(staffList);
    }

    @DeleteMapping("/{id}")
    public String fire(@PathVariable Long id) {
        return staffService.delete(id);
    }

    @GetMapping("/{id}/vacations")
    public List<Vacation> findByStaffId(@PathVariable Long id, Optional<Integer> page, Optional<Integer> pageSize) {
        return vacationService.getByStaffId(id, page, pageSize).stream().toList();
    }

    @PostMapping("/{id}/vacations")
    public Vacation requestVacation(@PathVariable Long id, @RequestBody Vacation vacation) {
        return vacationService.createVacation(id, vacation);
    }

    @PatchMapping("/{idStaff}/positions/to/{idPosition}")
    public Staff updatePosition(@PathVariable Long idStaff, @PathVariable Long idPosition){
        return positionService.updateStaffPosition(idStaff, idPosition);
    }
}
