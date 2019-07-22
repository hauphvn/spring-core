package edu.springcore;

import edu.springcore.model.Student;
import edu.springcore.service.StudentService;
import edu.springcore.service.StudentServiceEmpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestRunMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        //Khong su dung bean
        /*StudentServiceEmpl studentServiceEmpl = new StudentServiceEmpl();
        List<Student> students = studentServiceEmpl.getAll();
        System.out.println(students);*/

        //Su dung bean
        StudentService studentService = context.getBean("studentService", StudentService.class);
        System.out.println(studentService.getAll());

    }
}
