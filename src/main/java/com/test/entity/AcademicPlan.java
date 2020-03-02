package com.test.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "academicplan")
@NamedQuery(name = "AcademicPlan.getAll",query = "SELECT ac FROM AcademicPlan ac")
public class AcademicPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long counter;

    @Column(name = "academic_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long academic_id;

    @Column(name = "title")
    private String title;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "academic_id")
    private List<AcademicTheme> academicThemes;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "academic_id")
    private List<Group> groups;


    @Override
    public String toString() {
        return "AcademicPlan{" +
                "counter=" + counter +
                ", academic_id=" + academic_id +
                ", title='" + title + '\'' +
                ", academicThemes=" + academicThemes +
                ", groups=" + groups +
                '}';
    }

    public AcademicPlan() {
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public long getAcademic_id() {
        return academic_id;
    }

    public void setAcademic_id(long academic_id) {
        this.academic_id = academic_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<AcademicTheme> getAcademicThemes() {
        return academicThemes;
    }

    public void setAcademicThemes(List<AcademicTheme> academicThemes) {
        this.academicThemes = academicThemes;
    }
}
