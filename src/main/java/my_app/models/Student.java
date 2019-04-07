package my_app.models;

import javax.persistence.*;

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

    @ManyToOne
    private Lesson lesson;

    public Student(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Student() {
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public boolean isPresent() {
        return present;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
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
