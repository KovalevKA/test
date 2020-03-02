package com.test.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.entity.MaterialSupport;
import com.test.service.MaterialSupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/materislsupport")
public class MaterialSupportController {

    @Autowired
    private MaterialSupportService materialSupportService;

    @GetMapping()
    public List<MaterialSupport> getAll(){
        return materialSupportService.getAll();
    }

    @PostMapping(value = "/", consumes = "application/json;charset=UTF-8")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMaterialsupport(@RequestBody String data) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<HashMap<String, String>> typeRef
                = new TypeReference<HashMap<String, String>>() {};
        Map<String, String> note = mapper.readValue(data, typeRef);

        MaterialSupport saveMaterialSupport = new MaterialSupport();
        saveMaterialSupport.setDescription(note.get("description"));
        saveMaterialSupport.setTitle(note.get("title"));
        saveMaterialSupport.setType(note.get("type"));

        materialSupportService.addMaterialSupport(saveMaterialSupport);
    }

    @PatchMapping(value = "/{id}", consumes = "application/json;charset=UTF-8")
    @ResponseStatus(HttpStatus.OK)
    public void editMaterialsupport(@PathVariable long id, @RequestBody String data) throws IOException{

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<HashMap<String, String>> typeRef
                = new TypeReference<HashMap<String, String>>() {};
        Map<String, String> note = mapper.readValue(data, typeRef);

        Optional<MaterialSupport> saveMaterialSupport = materialSupportService.getById(id);
        saveMaterialSupport.get().setDescription(note.get("description"));
        saveMaterialSupport.get().setTitle(note.get("title"));
        saveMaterialSupport.get().setType(note.get("type"));

        materialSupportService.addMaterialSupport(saveMaterialSupport.get());
    }

    @DeleteMapping("/{id}")
    public void deleteMaterialsupport (@PathVariable long id) throws IOException {
        materialSupportService.delete(id);
    }

}
