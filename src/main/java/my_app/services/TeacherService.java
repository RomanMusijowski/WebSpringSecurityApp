package my_app.services;

import my_app.models.Teacher;

public interface TeacherService {

    void save(Teacher teacher);
//    Teacher delete(Teacher teacher);
//    void update(Teacher teacher);
    Teacher findByTeacherName(String teachername);
    Teacher findByTeacherEmail(String teacherEmail);
}
