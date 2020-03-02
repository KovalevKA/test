package com.test.service;



import com.test.entity.AcademicPlan;

import java.util.List;

public interface AcademicPlanService {

    AcademicPlan addAcademicPlan (AcademicPlan academicPlan);
    void delete (long id);
    AcademicPlan getByTitle (String title);
    AcademicPlan editAcademicPlan (AcademicPlan academicPlan);
    List<AcademicPlan> getAll();

}
