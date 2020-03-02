package com.test.service.impl;

import com.test.entity.Teacher;
import com.test.repository.TeacherRepository;
import com.test.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher addTeacher(Teacher teacher) {
        Teacher saveTeacher = teacherRepository.save(teacher);
        return saveTeacher;
    }

    @Override
    public void delete(long id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Teacher getByName(String name) {
        return teacherRepository.findByName(name);
    }

    @Override
    public Teacher editTeacher(Teacher teacher) {
        return teacherRepository.saveAndFlush(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

}
