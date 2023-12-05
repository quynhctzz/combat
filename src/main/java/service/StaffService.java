package service;

import domain.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> findAllStaff();
    Staff findById(Long id);
    Staff saveStaff(Staff staff);
    Staff updateStaff(Staff staff);
    void deleteStaff(Long id);
}
