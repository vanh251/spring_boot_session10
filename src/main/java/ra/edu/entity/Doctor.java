package ra.edu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String phone;
    private String address;
    private String specialization;
    private int experienceYears;
    private BigDecimal salary;
    private String imageUrl;

    @Enumerated(EnumType.STRING)
    private Position position;

    @Enumerated(EnumType.STRING)
    private DoctorStatus status;
}
