package my_app.services.serviceImp;

import my_app.dao.StudentDao;
import my_app.models.Student;
import my_app.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao studentDao;

//    private

    @Override
    public void save(Student student) {

        studentDao.save(student);
    }

    @Override
    public Student findByStudentName(String studentName) {

        return studentDao.findByStudentName(studentName);
    }
}
