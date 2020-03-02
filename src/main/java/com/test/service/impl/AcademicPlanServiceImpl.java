package com.test.service.impl;

import com.test.entity.AcademicPlan;
import com.test.repository.AcademicPlanRepository;
import com.test.service.AcademicPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicPlanServiceImpl implements AcademicPlanService {

    @Autowired
    private AcademicPlanRepository academicPlanRepository;

    @Override
    public AcademicPlan addAcademicPlan(AcademicPlan academicPlan) {
        AcademicPlan saveAcademicPlan = academicPlanRepository.save(academicPlan);
        return saveAcademicPlan;
    }

    @Override
    public void delete(long id) {
        academicPlanRepository.deleteById(id);
    }

    @Override
    public AcademicPlan getByTitle(String title) {
        return academicPlanRepository.findByTitle(title);
    }

    @Override
    public AcademicPlan editAcademicPlan(AcademicPlan academicPlan) {
        return academicPlanRepository.saveAndFlush(academicPlan);
    }

    @Override
    public List<AcademicPlan> getAll() {
        return academicPlanRepository.findAll();
    }
}
