package com.spring.jdbc;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String... args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcconfig.xml");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//           INSERT
        Student student = new Student();
        student.setId(16);
        student.setName("Virat");
        student.setCity("Delhi");
        int insert = studentDao.insert(student);
        System.out.println("Student added" + insert);

//        UPDATE
//        Student student = new Student();
//        student.setId(45);
//        student.setName("sharma");
//        student.setCity("Bangaluru");
//       int res = studentDao.change(student);
//        System.out.println("Record change"+res);

//        DELETE
//        int res = studentDao.delete(101);
//        System.out.println("One row deleted"+res);

//        RowMapper single data
//        Student student = studentDao.getStudent(233);
//        System.out.println(student);

//        RowMapper multiple data
        List<Student> allStudents = studentDao.getAllStudents();
        for(Student student1 : allStudents) {
            System.out.println(student1);
        }
        



        //       JdbcTemplate
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

//        insert query
//        String query = "insert into student(id,name,city) values(?,?,?)";
//
//       fire query
//        int result = jdbcTemplate.update(query,123,"Reddy","bangaluru");
//        System.out.println("number of rows inserted"+ result);


    }
}
