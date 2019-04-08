package my_app.services;

import my_app.models.Teacher;

public interface TeacherService {

    Teacher findByTeacherName(String teachername);
}
