package com.test.repository;

import com.test.entity.AcademicPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AcademicPlanRepository extends JpaRepository<AcademicPlan, Long> {

    @Query("SELECT ap FROM AcademicPlan ap WHERE ap.title = :title")
    AcademicPlan findByTitle(@Param("title") String title);

}
