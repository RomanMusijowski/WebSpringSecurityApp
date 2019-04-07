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
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
            Date date= new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);


            Teacher teacher = new Teacher();
            Student student = new Student();
            Lesson lesson = new Lesson();



            teacher.setEmail("teacher@gmail.com");
            teacher.setName("Teacher");
            teacher.setSurName("Teacher");
            teacher.setPassword("1234");

            student.setName("Student Student");
            student.setEmail("student@gmail.com");

            lesson.setDescription("Lesson start");
            lesson.setLocalization("Rzeszow");
            lesson.setDate(cal);





            Configuration configuration = new Configuration()
                    .configure("hibernate.cfg.xml");

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                    configuration.getProperties()).build();

            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(Lesson.class);
            configuration.addAnnotatedClass(Teacher.class);


            SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);


            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();
//            session.save(student1);
//            session.save(student2);
//            session.save(telefon1);
//            session.save(telefon2);


            transaction.commit();
            System.out.println("Transaction Completed !");
            session.close();
            factory.close();

            StandardServiceRegistryBuilder.destroy(serviceRegistry);
    }
}
