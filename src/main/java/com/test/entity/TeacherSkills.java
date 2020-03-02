package com.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacherskills")
@NamedQuery(name = "TeacherSkills.getAll",query = "SELECT ts  FROM TeacherSkills ts")
public class TeacherSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long counter;

    @Column(name = "nameSkill")
    private String nameSkill;

    @Column(name = "levelSkill")
    private String levelSkill;

    @Column(name = "teacher_id")
    private long teacher_id;

    @ManyToOne
    private Teacher teacher;

    @Override
    public String toString() {
        return "TeacherSkills{" +
                "counter=" + counter +
                ", nameSkill='" + nameSkill + '\'' +
                ", levelSkill='" + levelSkill + '\'' +
                '}';
    }

    public TeacherSkills() {
    }

    public long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(long teacher_id) {
        this.teacher_id = teacher_id;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public String getLevelSkill() {
        return levelSkill;
    }

    public void setLevelSkill(String levelSkill) {
        this.levelSkill = levelSkill;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
