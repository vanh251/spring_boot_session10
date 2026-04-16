package ra.edu.dto.request;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class DoctorUpdateRequest {
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String phone;
    private String address;
    private String specialization;
    private int experienceYears;
    private BigDecimal salary;
}

