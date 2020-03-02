package com.test.entity;


import javax.persistence.*;

@Entity
@Table( name = "academictheme")
@NamedQuery(name = "AcademicTheme.getAll",query = "SELECT at FROM AcademicTheme at")
public class AcademicTheme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long counter;

    @Column(name = "theme_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long theme_id;

    @Column(name = "title")
    private String title;

    @Column(name = "academic_id")
    private long academic_id;

    @ManyToOne
    private AcademicPlan academicPlan;

    @Override
    public String toString() {
        return "AcademicTheme{" +
                "counter=" + counter +
                ", theme_id=" + theme_id +
                ", title='" + title + '\'' +
                ", academic_id=" + academic_id +
                '}';
    }

    public AcademicTheme() {
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public long getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(long theme_id) {
        this.theme_id = theme_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getAcademic_id() {
        return academic_id;
    }

    public void setAcademic_id(long academic_id) {
        this.academic_id = academic_id;
    }

    public AcademicPlan getAcademicPlan() {
        return academicPlan;
    }

    public void setAcademicPlan(AcademicPlan academicPlan) {
        this.academicPlan = academicPlan;
    }
}
