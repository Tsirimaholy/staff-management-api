package com.example.enterprisefinalexam.repository;

import com.example.enterprisefinalexam.model.Vacation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacationRepository extends JpaRepository<Vacation, Long> {
    List<Vacation> findVacationsById(Long id, Pageable pageable);

    @Query("select v from Vacation v where v.date=current_date")
    List<Vacation> findTodayRequest();
}