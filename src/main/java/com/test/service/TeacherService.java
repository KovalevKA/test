package com.test.service;

import com.test.entity.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher addTeacher(Teacher teacher);
    void delete (long id);
    Teacher getByName(String name);
    Teacher editTeacher (Teacher teacher);
    List<Teacher> getAll();

}
