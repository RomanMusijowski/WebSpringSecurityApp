package my_app.dao;

import my_app.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LessonDao extends JpaRepository<Lesson, Long> {

}
