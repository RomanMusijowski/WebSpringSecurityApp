package my_app.services.serviceImp;

import my_app.dao.LessonDao;
import my_app.dao.TeacherDao;
import my_app.models.Lesson;
import my_app.models.Teacher;
import my_app.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServicesImp implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private LessonDao lessonDao;



    @Override
    public void save(Teacher teacher) {
        teacher.setPassword(bCryptPasswordEncoder.encode(teacher.getPassword()));
//        List<Lesson> lessons = new ArrayList<>();
//        lessons.add(teacher);
//        teacher.setLessons(lessons);
        teacherDao.save(teacher);
    }

    @Override
    public Teacher findByTeacherName(String teacherName) {
        return teacherDao.findByTeacherName(teacherName);
    }


    public Teacher delete(Teacher teacher){
        Teacher temp = teacherDao.findOne(teacher.getId());
        teacherDao.delete(teacher);
        return teacher;
    }


}
