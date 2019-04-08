package my_app;

import my_app.models.Lesson;
import my_app.models.Student;
import my_app.models.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//            Date date= new Date();
//            Calendar cal = Calendar.getInstance();
//            cal.setTime(date);
//
//
//            Teacher teacher = new Teacher();
//            Lesson lesson = new Lesson();
//            Student student = new Student();
//            List<Student> students = new ArrayList<>();
//
//
//
//
//
//
//            teacher.setEmail("teacher@gmail.com");
//            teacher.setName("Teacher");
//            teacher.setSurName("Teacher");
//            teacher.setPassword("1234");
//
//            student.setName("Student Student");
//            student.setEmail("student@gmail.com");
//            students.add(student);
//
//            lesson.setDescription("Lesson start");
//            lesson.setLocalization("Rzeszow");
//            lesson.setDate(cal);
//
//            lesson.setStudents(students);
//            lesson.setTeacher(teacher);
//
//
//
//
//
//
//            Configuration configuration = new Configuration()
//                    .configure("hibernate.cfg.xml");
//
//            configuration.addAnnotatedClass(Student.class);
//            configuration.addAnnotatedClass(Lesson.class);
//            configuration.addAnnotatedClass(Teacher.class);
//
//
//            SessionFactory factory = configuration.buildSessionFactory();
//
//
//            Session session = factory.openSession();
//
//            Transaction transaction = session.beginTransaction();
//            session.persist(lesson);
//            session.persist(teacher);
//            session.persist(student);
////            session.save(student1);
////            session.save(student2);
////            session.save(telefon1);
////            session.save(telefon2);
//
//
//            transaction.commit();
//            System.out.println("Transaction Completed !");
//            session.close();
//            factory.close();
    }
}
