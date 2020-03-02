package com.test.repository;

import com.test.entity.TeacherSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TeacherSkillsRepository extends JpaRepository<TeacherSkills, Long> {

    @Query("SELECT ts FROM TeacherSkills ts WHERE ts.teacher_id = :id")
    TeacherSkills findSkills(@Param("id") long id);

}
