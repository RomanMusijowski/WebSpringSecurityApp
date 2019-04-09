package my_app.validator;

import my_app.models.Teacher;
import my_app.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class TeacherValidator implements Validator {

    @Autowired
    private TeacherService teacherService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Teacher.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Teacher teacher = (Teacher) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Required");
        if (teacher.getName().length() < 8 || teacher.getName().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }

        if (teacherService.findByTeacherName(teacher.getName()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        if (teacherService.findByTeacherEmail(teacher.getEmail()) != null){
            errors.rejectValue("email", "Dublicate.userForm.email");
        }

        if (teacher.getEmail().indexOf("@") != -1){
            errors.rejectValue("email", "Error.userForm.email");
        }


        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required");
        if (teacher.getPassword().length() < 8 || teacher.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!teacher.getConfirmPassword().equals(teacher.getPassword())) {
            errors.rejectValue("confirmPassword", "Different.userForm.password");
        }
    }
}
