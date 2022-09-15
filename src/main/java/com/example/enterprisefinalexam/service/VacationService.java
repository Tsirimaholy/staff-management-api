package com.example.enterprisefinalexam.service;

import com.example.enterprisefinalexam.model.Vacation;
import com.example.enterprisefinalexam.repository.StaffRepository;
import com.example.enterprisefinalexam.repository.VacationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VacationService {
    private final VacationRepository vacationRepository;
    private final StaffRepository staffRepository;

    /*
    * Get vacations request for an identified staff
    * */
    public List<Vacation> getByStaffId(Long id, Optional<Integer> page, Optional<Integer> pageSize){
        Pageable pageable = PageRequest.of(page.orElse(0), pageSize.orElse(5), Sort.by(Sort.Direction.DESC, "date"));
        return vacationRepository.findVacationsById(id, pageable);
    }

    public List<Vacation> getTodayVacationsRequest(){
        return vacationRepository.findTodayRequest();
    }

    public Vacation createVacation(Long id, Vacation vacation) {
        if (staffRepository.findById(id).isPresent()){
            vacation.setStaff(staffRepository.findById(id).get());
        }
        return vacationRepository.save(vacation);
    }
}
