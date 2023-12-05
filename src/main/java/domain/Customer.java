package domain;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "n_customer")
public class Customer {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="last_name" )
    private String name;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "phone_number")
    private String Phone;

    @Column(name = "create_At")
    private Date createAt;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "updated_At")
    private Date updatedAt;

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString ();
    }

}
