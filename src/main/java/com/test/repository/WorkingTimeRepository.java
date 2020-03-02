package com.test.repository;

import com.test.entity.WorkingTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkingTimeRepository extends JpaRepository<WorkingTime, Long> {
}
