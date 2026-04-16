package ra.edu.controller;

import org.springframework.web.bind.annotation.*;
import ra.edu.dto.request.DoctorRequest;
import ra.edu.dto.request.DoctorUpdateRequest;
import ra.edu.dto.response.DoctorResponse;
import ra.edu.entity.Doctor;
import ra.edu.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService service;

    public DoctorController(DoctorService service) {
        this.service = service;
    }

    @GetMapping
    public DoctorResponse<List<Doctor>> getAll() {
        return new DoctorResponse<>("success", 200, service.getAll(), null);
    }

    @GetMapping("/{id}")
    public DoctorResponse<Doctor> getById(@PathVariable Long id) {
        return new DoctorResponse<>("success", 200, service.getById(id), null);
    }

    @PostMapping
    public DoctorResponse<Doctor> create(@RequestBody DoctorRequest<?> doctorRequest) {
        return new DoctorResponse<>("success", 201, service.create(doctorRequest), null);
    }

    @PutMapping("/{id}")
    public DoctorResponse<Doctor> update(@PathVariable Long id, @RequestBody DoctorUpdateRequest doctorUpdateRequest) {
        return new DoctorResponse<>("success", 200, service.update(id, doctorUpdateRequest), null);
    }

    @DeleteMapping("/{id}")
    public DoctorResponse<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return new DoctorResponse<>("success", 204, null, null);
    }
}
