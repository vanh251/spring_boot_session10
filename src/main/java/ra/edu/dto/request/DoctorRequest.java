package ra.edu.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class DoctorRequest<T> {
    public String name;
    public LocalDate dateOfBirth;
    public String email;
    public String phone;
    public String address;
    public String specialization;
    public int experienceYears;
    public BigDecimal salary;
    public List<MultipartFile> imageUrl;
}
