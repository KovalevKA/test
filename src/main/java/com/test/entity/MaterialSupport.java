package com.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "materialsupport")
@NamedQuery(name = "MaterialSupport.getAll", query = "SELECT ms FROM MaterialSupport ms")
public class MaterialSupport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long counter;

    @Column(name = "materialsupport_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long materialsupport_id;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;


    public MaterialSupport() {
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public long getMaterialsupport_id() {
        return materialsupport_id;
    }

    public void setMaterialsupport_id(long materialsupport_id) {
        this.materialsupport_id = materialsupport_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
