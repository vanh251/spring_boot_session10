package ra.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.edu.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
