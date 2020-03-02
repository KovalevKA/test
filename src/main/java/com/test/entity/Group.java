package com.test.entity;


import javax.persistence.*;

@Entity
@Table(name = "groupp")
@NamedQuery(name = "Group.getAll",query = "SELECT g  FROM Group g")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long counter;

    @Column(name = "group_id")
    private long group_id;

    @Column(name = "groupName")
    private String groupName;

    @Column(name = "academic_id")
    private long academic_id;

    @ManyToOne
    private AcademicPlan academicPlan;

    @Override
    public String toString() {
        return "Group{" +
                "counter=" + counter +
                ", group_id=" + group_id +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    //связи плана и группы

    public Group() {
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
