package my_app.dao;

import my_app.models.Lesson;
import my_app.models.Student;
import my_app.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonDao extends JpaRepository<Lesson, Long> {

}
