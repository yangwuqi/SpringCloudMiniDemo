package com.controller;

import com.entity.Student;
import com.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepo studentRepo;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepo.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepo.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepo.saveOrUpdate(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepo.saveOrUpdate(student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRepo.deleteById(id);
    }
}
