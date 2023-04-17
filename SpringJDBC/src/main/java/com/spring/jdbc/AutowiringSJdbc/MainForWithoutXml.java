package com.spring.jdbc.AutowiringSJdbc;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.WithoutXML.JdbcConfig;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.Dao")
public class MainForWithoutXml {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
////           INSERT
//        Student student = new Student();
//        student.setId(21);
//        student.setName("Virat");
//        student.setCity("Delhi");
//        int insert = studentDao.insert(student);
//        System.out.println("Student added" + insert);

//        RowMapper multiple data
        List<Student> allStudents = studentDao.getAllStudents();
        for(Student student1 : allStudents) {
            System.out.println(student1);
        }
    }
}
