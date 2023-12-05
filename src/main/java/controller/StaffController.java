package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import domain.Staff;
import service.StaffServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/staffs")
public class StaffController {

    @Autowired
    private Staff staff;

    @GetMapping("/search")
    public ResponseEntity<List<Staff>>searchStaff(
            @RequestParam("name") String name) {
        List<Staff> result = StaffServiceImpl.findByName (name);
        return ResponseEntity.ok (result);

    }



    @PostMapping
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff){
        Staff savedStaff = StaffServiceImpl.createStaff(staff);
        return new ResponseEntity<> (savedStaff, HttpStatus.CREATED);

    }
}
