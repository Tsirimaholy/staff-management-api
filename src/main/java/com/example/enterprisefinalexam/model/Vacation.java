package com.example.enterprisefinalexam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // the date of the vacation
    private LocalDate date;
    private String motif;
    // number of day of duration
    private Short duration = 1;

    @ManyToOne()
    @JoinColumn(name = "staff_id")
    private Staff staff;
    @CreationTimestamp
    private LocalDateTime submissionDate;
    private boolean isApproved = false;
}
