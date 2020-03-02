package com.test.service.impl;

import com.test.entity.Group;
import com.test.repository.GroupRepository;
import com.test.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;


    @Override
    public List<Group> getAll() {
        return groupRepository.findAll();
    }

    @Override
    public Group addGroup(Group group) {
        Group saveGroup = groupRepository.save(group);
        return saveGroup;
    }

    @Override
    public void delete(long counter, long group_id) {
    }

    @Override
    public Group editGroup(Group group) {
        return groupRepository.saveAndFlush(group);
    }

    @Override
    public List<Group> getByTitle(String title) {
        return null;
    }
}
