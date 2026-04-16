package ra.edu.service;

import ra.edu.dto.request.DoctorRequest;
import ra.edu.dto.request.DoctorUpdateRequest;
import ra.edu.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAll();
    Doctor getById(Long id);
    Doctor create(DoctorRequest<?> doctorRequest);
    Doctor update(Long id, DoctorUpdateRequest doctorUpdateRequest);
    void delete(Long id);
}
