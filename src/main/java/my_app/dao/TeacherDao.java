package my_app.dao;

import my_app.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDao extends JpaRepository<Teacher, Long> {

    Teacher findByTeacherName(String teachername);
}
