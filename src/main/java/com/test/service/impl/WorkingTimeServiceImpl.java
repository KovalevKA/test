package com.test.service.impl;

import com.test.entity.WorkingTime;
import com.test.repository.WorkingTimeRepository;
import com.test.service.WorkingTimeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WorkingTimeServiceImpl implements WorkingTimeService {

    @Autowired
    private WorkingTimeRepository workingTimeRepository;

    @Override
    public WorkingTime addWorkingTime(WorkingTime workingTime) {
        WorkingTime saveWorkingTime = workingTimeRepository.save(workingTime);
        return workingTime;
    }

    @Override
    public void delete(long counter, long teacher_id) {

    }

    @Override
    public WorkingTime editWorkingTime(WorkingTime workingTime) {
        return workingTimeRepository.saveAndFlush(workingTime);
    }

    @Override
    public List<WorkingTime> getByTeacher(String name) {
        return workingTimeRepository.findAll();
    }
}
