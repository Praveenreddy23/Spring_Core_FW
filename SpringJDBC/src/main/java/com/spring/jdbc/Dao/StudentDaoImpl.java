package com.spring.jdbc.Dao;

import com.spring.jdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate template;
    
    public int insert(Student student) {
//        insert query
        String query = "insert into student values(?,?,?)";
        int r = this.template.update(query, student.getId(), student.getName(), student.getCity());
        return r;
    }

    public int change(Student student) {
//        updating data
        String query= "update student set name=? ,city=? where id=?";
        int update = this.template.update(query, student.getName(), student.getCity(), student.getId());
        return update;
    }

    public int delete(int studentId) {
//        delete operation
        String query= "delete from student where id=?";
        int delete = this.template.update(query, studentId);
        return delete;
    }

   
    public Student getStudent(int studentId) {
//        selecting single student data
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
      Student student = this.template.queryForObject(query, rowMapper ,studentId);
        return student;
    }

   
    public List<Student> getAllStudents() {
//        selecting multiple student data
        String query = "select * from student";
        List<Student> res = this.template.query(query,new RowMapperImpl());
        return res;
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
