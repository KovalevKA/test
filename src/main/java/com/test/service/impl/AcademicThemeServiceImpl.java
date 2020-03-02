package com.test.service.impl;

import com.test.entity.AcademicTheme;
import com.test.repository.AcademicThemeRepository;
import com.test.service.AcademicThemeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AcademicThemeServiceImpl implements AcademicThemeService {

    @Autowired
     private AcademicThemeRepository academicThemeRepository;

    @Override
    public AcademicTheme addAcademicTheme(AcademicTheme academicTheme) {
         AcademicTheme saveAcademicTheme = academicThemeRepository.save(academicTheme);
        return saveAcademicTheme;
    }

    @Override
    public void delete(long counter, long teacher_id) {

    }

    @Override
    public AcademicTheme editAcademicTheme(AcademicTheme academicTheme) {
        return academicThemeRepository.saveAndFlush(academicTheme);
    }

    @Override
    public List<AcademicTheme> findAll() {
        return academicThemeRepository.findAll();
    }
}
