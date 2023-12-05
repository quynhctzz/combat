package domain;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;

@Component
@Entity
@Table(name = "n_staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "last_name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "position")
    private String position;

    private double salaryPercentage;

    public Staff(String position,Long id,String name,String email, double salaryPercentage, Role role){
        this.position = position;
        this.salaryPercentage = salaryPercentage;
        this.name = name;
        this.id = id;
        this.email = email;

    }

    public Staff() {

    }

    public double getSalaryPercentage(){
        return salaryPercentage;
    }



    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
