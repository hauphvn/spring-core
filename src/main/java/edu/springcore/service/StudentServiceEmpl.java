package edu.springcore.service;


import edu.springcore.model.Student;
import edu.springcore.repository.StudentRepository;
import edu.springcore.repository.StudentRepositoryEmpl;

import java.util.List;

public class StudentServiceEmpl implements StudentService{

    private StudentRepository studentRepository = new StudentRepositoryEmpl();

    @Override
    public List<Student> getAll(){
        return studentRepository.getAll();
    }

}
