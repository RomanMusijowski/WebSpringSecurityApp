package my_app.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long student_id;

    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "present")
    private boolean present;

    @ManyToMany(mappedBy = "students",fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    private List<Lesson> lessons;

    public Student(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Student() {
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
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

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
