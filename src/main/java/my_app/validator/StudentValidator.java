package my_app.validator;

import my_app.models.Student;
import my_app.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

    @Autowired
    private StudentService studentService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Student.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Student student = (Student) o;

        if (studentService.findByStudentEmail(student.getEmail()) != null){
            errors.rejectValue("email", "Dublicate.userForm.email");
        }

        if (student.getEmail().indexOf("@") != -1){
            errors.rejectValue("email", "Error.userForm.email");
        }
    }
}
