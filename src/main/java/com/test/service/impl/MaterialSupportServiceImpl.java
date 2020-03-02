package com.test.service.impl;


import com.test.entity.MaterialSupport;
import com.test.repository.MaterialSupportRepository;
import com.test.service.MaterialSupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialSupportServiceImpl implements MaterialSupportService {

    @Autowired
    private MaterialSupportRepository materialSupportRepository;

    @Override
    public MaterialSupport addMaterialSupport(MaterialSupport materialSupport) {
         MaterialSupport saveMaterialSupport = materialSupportRepository.save(materialSupport);
        return saveMaterialSupport;
    }

    @Override
    public void delete(long id) {
        materialSupportRepository.deleteById(id);
    }

    @Override
    public MaterialSupport editMaterialSupport(MaterialSupport materialSupport) {
        return materialSupportRepository.saveAndFlush(materialSupport);
    }

    @Override
    public List<MaterialSupport> getAll() {
        return materialSupportRepository.findAll();
    }

    @Override
    public Optional<MaterialSupport> getById(long id) {
        return materialSupportRepository.findById(id);
    }
}
