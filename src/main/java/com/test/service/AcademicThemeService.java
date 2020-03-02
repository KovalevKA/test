package com.test.service;


import com.test.entity.AcademicTheme;

import java.util.List;

public interface AcademicThemeService {

    AcademicTheme addAcademicTheme (AcademicTheme academicTheme);
    void delete(long counter, long teacher_id);
    AcademicTheme editAcademicTheme (AcademicTheme academicTheme);
    List<AcademicTheme> findAll();

}
