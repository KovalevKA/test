package com.test.service;


import com.test.entity.Group;

import java.util.List;

public interface GroupService {

    List<Group> getAll();
    Group addGroup (Group group);
    void delete(long counter, long group_id);
    Group editGroup (Group group);
    List<Group> getByTitle(String title);

}
