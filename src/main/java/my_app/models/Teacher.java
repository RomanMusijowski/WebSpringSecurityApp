package my_app.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teacher_id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "sur_name")
    private String surName;

    @Column(name = "password")
    private String password;

    @Transient
    private String confirmPassword;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER,orphanRemoval = true)
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    private List<Lesson> lessons;

    public Teacher(Long teacher_id, String email, String name, String surName) {
        this.teacher_id = teacher_id;
        this.email = email;
        this.name = name;
        this.surName = surName;
    }



    public Teacher() {
    }


    public Long getId() {
        return teacher_id;
    }

    public void setId(Long teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + teacher_id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
