package com.repo;

import com.entity.Student;

import java.util.Collection;

public interface StudentRepo {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
