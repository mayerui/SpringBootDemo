package com.mohuang.repository;

import com.mohuang.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(int id);
    void saveOrUpdate(Student student);
    void deleteById(int id);
}
