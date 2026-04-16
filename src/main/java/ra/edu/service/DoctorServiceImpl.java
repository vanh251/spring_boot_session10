package ra.edu.service;

import org.springframework.stereotype.Service;
import ra.edu.entity.Doctor;
import ra.edu.repository.DoctorRepository;
import ra.edu.dto.request.DoctorRequest;
import ra.edu.dto.request.DoctorUpdateRequest;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository repository;

    public DoctorServiceImpl(DoctorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Doctor> getAll() {
        return repository.findAll();
    }

    @Override
    public Doctor getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
    }

    @Override
    public Doctor create(DoctorRequest<?> doctorRequest) {
        Doctor doctor = new Doctor();
        doctor.setName(doctorRequest.name);
        doctor.setDateOfBirth(doctorRequest.dateOfBirth);
        doctor.setEmail(doctorRequest.email);
        doctor.setPhone(doctorRequest.phone);
        doctor.setAddress(doctorRequest.address);
        doctor.setSpecialization(doctorRequest.specialization);
        doctor.setExperienceYears(doctorRequest.experienceYears);
        doctor.setSalary(doctorRequest.salary);
        // Không xử lý imageUrl ở đây
        return repository.save(doctor);
    }

    @Override
    public Doctor update(Long id, DoctorUpdateRequest doctorUpdateRequest) {
        Doctor existing = getById(id);
        existing.setName(doctorUpdateRequest.getName());
        existing.setDateOfBirth(doctorUpdateRequest.getDateOfBirth());
        existing.setEmail(doctorUpdateRequest.getEmail());
        existing.setPhone(doctorUpdateRequest.getPhone());
        existing.setAddress(doctorUpdateRequest.getAddress());
        existing.setSpecialization(doctorUpdateRequest.getSpecialization());
        existing.setExperienceYears(doctorUpdateRequest.getExperienceYears());
        existing.setSalary(doctorUpdateRequest.getSalary());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
