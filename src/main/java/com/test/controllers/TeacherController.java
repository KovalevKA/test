package com.test.controllers;

import com.test.entity.Teacher;
import com.test.entity.TeacherSkills;
import com.test.entity.WorkingTime;
import com.test.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @GetMapping("{name}")
    public Teacher teacherByName(@PathVariable String name){
        return teacherService.getByName(name);
    }

   @GetMapping("{name}/skills")
    public List<TeacherSkills> skillList(@PathVariable String name){
        return teacherService.getByName(name).getTeacherSkills();
    }

    @GetMapping("{name}/worktime")
    public List<WorkingTime> workingTimesList (@PathVariable String name){
        return teacherService.getByName(name).getWorkingTimes();
    }

}
