package com.test.service;

import com.test.entity.TeacherSkills;

import java.util.List;

public interface TeacherSkillsService {

    TeacherSkills addTeacherSkills (TeacherSkills teacherSkills);
    void delete(long counter, long teacher_id);
    TeacherSkills ediTeacherSkills (TeacherSkills teacherSkills);
    TeacherSkills findByTeacher (long id);
    List<TeacherSkills> findAll();
}
