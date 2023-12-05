package repository;

import domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepository extends JpaRepository <Staff,Long>{
    List<Staff> findByName(String name);
}
