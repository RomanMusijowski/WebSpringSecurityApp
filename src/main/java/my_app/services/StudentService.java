package my_app.services;

import my_app.models.Student;

public interface StudentService {

    Student findByStudentName(String studentName);
}
