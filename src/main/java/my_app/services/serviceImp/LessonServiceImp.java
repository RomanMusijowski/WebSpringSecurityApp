package my_app.services.serviceImp;

import my_app.dao.LessonDao;
import my_app.dao.StudentDao;
import my_app.dao.TeacherDao;
import my_app.models.Lesson;
import my_app.models.Student;
import my_app.models.Teacher;
import my_app.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImp implements LessonService {

    @Autowired
    private LessonDao lessonDao;

    @Autowired
    private TeacherDao teacherDao;

    @Autowired
    private StudentDao studentDao;
    //here must be other models...

    @Override
    public void save(Lesson lesson) {

    }

    @Override
    public List<Student> findStudents(Long lesson_id) {
        return null;
    }

    @Override
    public Teacher findTeacher(Long teacher_id) {
        return null;
    }
}
