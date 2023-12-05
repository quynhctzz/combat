package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.Staff;
import repository.StaffRepository;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private static StaffRepository userStaffRepository;
    
    public static List<Staff> findByName(String name) {
        return userStaffRepository.findByName (name);
    }

    public static Staff createStaff(Staff staff) {
        return null;
    }

    public List<Staff> getAllStaff(){
        return staffRepository.findAll();
    }


    private static void validateStaff(Staff staff) {
        if (staff.getName () == null || staff.getName ().isEmpty ()) {
            throw new IllegalArgumentException ("staff name is required");

        }
        if (staff.getEmail () == null || staff.getEmail ().isEmpty ()){
            throw new IllegalArgumentException ("Staff email is required");
        }
        if (staff.getPhone () == null || staff.getPhone ().isEmpty ()){
            throw  new IllegalArgumentException ("staff phone is require");

        }
    }

    @Override
    public List<Staff> findAllStaff() {
        return null;
    }

    @Override
    public Staff findById(Long id) {
        return null;
    }

    @Override
    public Staff saveStaff(Staff staff) {
        return null;
    }

    @Override
    public Staff updateStaff(Staff staff) {
        return null;
    }

    @Override
    public void deleteStaff(Long id) {

    }
}
