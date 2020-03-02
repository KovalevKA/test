package com.test.service.impl;

import com.test.entity.TeacherSkills;
import com.test.repository.TeacherSkillsRepository;
import com.test.service.TeacherSkillsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeacherSkillsServiceImpl implements TeacherSkillsService {

    @Autowired
    private TeacherSkillsRepository teacherSkillsRepository;

    @Override
    public TeacherSkills addTeacherSkills(TeacherSkills teacherSkills) {
        TeacherSkills saveTeacherSkills = teacherSkillsRepository.save(teacherSkills);
        return saveTeacherSkills;
    }

    @Override
    public void delete(long counter, long teacher_id) {

    }

    @Override
    public TeacherSkills ediTeacherSkills(TeacherSkills teacherSkills) {
        return teacherSkillsRepository.saveAndFlush(teacherSkills);
    }

    @Override
    public TeacherSkills findByTeacher(long id) {
        return  teacherSkillsRepository.findSkills(id);
    }

    @Override
    public List<TeacherSkills> findAll() {
        return teacherSkillsRepository.findAll();
    }


}
