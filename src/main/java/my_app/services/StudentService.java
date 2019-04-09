package my_app.services;

import my_app.models.Student;

public interface StudentService {

    void save(Student student);
    Student findByStudentName(String studentName);
    Student findByStudentEmail(String studentEmail);
}
