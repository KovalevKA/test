package com.test.service;


import com.test.entity.MaterialSupport;

import java.util.List;
import java.util.Optional;

public interface MaterialSupportService {

    MaterialSupport addMaterialSupport(MaterialSupport materialSupport);
    void delete(long id);
    MaterialSupport editMaterialSupport (MaterialSupport materialSupport);
    List<MaterialSupport> getAll();
    Optional<MaterialSupport> getById(long id);

}
