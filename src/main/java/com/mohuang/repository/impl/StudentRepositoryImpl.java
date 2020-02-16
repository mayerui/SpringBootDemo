package com.mohuang.repository.impl;

import com.mohuang.entity.Student;
import com.mohuang.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Integer, Student> studentMap;

    static{
        studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, "me", 17));
        studentMap.put(2, new Student(2, "you", 18));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(int id) {
        studentMap.remove(id);
    }
}
