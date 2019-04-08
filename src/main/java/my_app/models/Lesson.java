package my_app.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lesson_id;

    @Column(name = "description")
    private String description;
    @Column(name = "localization")
    private String localization;
    @Column(name = "date")
    private Calendar date;


    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    private Teacher teacher;


    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    private List<Student> students;

    public Lesson(String description, String localization, Calendar date, Teacher teacher, List<Student> students) {
        this.description = description;
        this.localization = localization;
        this.date = date;
        this.teacher = teacher;
        this.students = students;
    }

    public Lesson() {
    }

    public Long getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(Long lesson_id) {
        this.lesson_id = lesson_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lesson_id=" + lesson_id +
                ", description='" + description + '\'' +
                ", localization='" + localization + '\'' +
                ", date=" + date +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
