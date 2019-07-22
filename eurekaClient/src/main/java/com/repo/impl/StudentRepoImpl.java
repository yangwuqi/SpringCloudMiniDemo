package com.repo.impl;

import com.entity.Student;
import com.repo.StudentRepo;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepoImpl implements StudentRepo {
    private  static Map<Long,Student> studentMap;

    static{
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"hey1",21));
        studentMap.put(2L,new Student(2L,"hey2",22));
        studentMap.put(3L,new Student(3L,"hey3",23));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
