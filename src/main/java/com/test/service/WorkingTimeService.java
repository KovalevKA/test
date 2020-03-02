package com.test.service;

import com.test.entity.WorkingTime;

import java.util.List;

public interface WorkingTimeService {

    WorkingTime addWorkingTime (WorkingTime workingTime);
    void delete(long counter, long teacher_id);
    WorkingTime editWorkingTime (WorkingTime workingTime);
    List<WorkingTime> getByTeacher(String name);

}
