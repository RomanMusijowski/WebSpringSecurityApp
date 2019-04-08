package my_app.dao;

import my_app.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Long> {

    Student findByStudentName(String studentName);
}
