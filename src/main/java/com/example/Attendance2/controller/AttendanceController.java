package com.example.Attendance2.controller;


import com.example.Attendance2.entity.Student;
import com.example.Attendance2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
@CrossOrigin("*") // Allow frontend requests
public class AttendanceController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/absentees")
    public List<Student> getAbsentStudents(@RequestBody List<Integer> presentRollNumbers) {
        return studentService.getAbsentStudents(presentRollNumbers);
    }
}