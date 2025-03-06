package com.example.Attendance2.service;


import com.example.Attendance2.entity.Student;
import com.example.Attendance2.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAbsentStudents(List<Integer> presentRollNumbers) {
        List<Student> allStudents = studentRepository.findAll();
        return allStudents.stream()
                .filter(student -> !presentRollNumbers.contains(student.getRollNumber()))
                .collect(Collectors.toList());
    }
}
