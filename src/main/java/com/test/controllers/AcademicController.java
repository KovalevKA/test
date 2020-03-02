package com.test.controllers;


import com.test.entity.AcademicPlan;
import com.test.entity.AcademicTheme;
import com.test.entity.Group;
import com.test.service.AcademicPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/academic")
public class AcademicController {

    @Autowired
    private AcademicPlanService academicPlanService;

    @GetMapping
    public List<AcademicPlan> getAll() {
        return  academicPlanService.getAll();
    }

    @GetMapping("{title}")
    public AcademicPlan planByTitle(@PathVariable String title){
        return academicPlanService.getByTitle(title);
    }

    @GetMapping("{title}/themes")
    public List<AcademicTheme> academicThemeList (@PathVariable String title){
        return academicPlanService.getByTitle(title).getAcademicThemes();
    }

    @GetMapping("{title}/groups")
    public List<Group> groupsList(@PathVariable String title){
        return academicPlanService.getByTitle(title).getGroups();
    }
}
