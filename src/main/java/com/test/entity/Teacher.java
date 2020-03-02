package com.test.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teacher")
@NamedQuery(name = "Teacher.getAll",query = "SELECT t FROM Teacher t")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long teacher_id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;


    //@OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher")
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private List<WorkingTime> workingTimes;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private List<TeacherSkills> teacherSkills;


    public List<WorkingTime> getWorkingTimes() {
        return workingTimes;
    }

    public void setWorkingTimes(List<WorkingTime> workingTimes) {
        this.workingTimes = workingTimes;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", workingTimes=" + workingTimes +
                ", teacherSkills=" + teacherSkills +
                '}';
    }

    public Teacher() {
    }

    public long getTeacher_id() {
        return teacher_id;
    }

    public List<TeacherSkills> getTeacherSkills() {
        return teacherSkills;
    }

    public void setTeacherSkills(List<TeacherSkills> teacherSkills) {
        this.teacherSkills = teacherSkills;
    }

    public long getTeacher_id_id() {
        return teacher_id;
    }

    public void setTeacher_id(long teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
