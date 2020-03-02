package com.test.entity;


import javax.persistence.*;

@Entity
@Table(name = "workingtime")
@NamedQuery(name = "WorkingTime.getAll",query = "SELECT w FROM WorkingTime w")
public class WorkingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long counter;

    @Column(name = "dayWork")
    private String dayWork;

    @Column(name = "timeWork")
    private String timeWork;

    @ManyToOne
    private Teacher teacher;


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public WorkingTime() {
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public String getDayWork() {
        return dayWork;
    }

    public void setDayWork(String dayWork) {
        this.dayWork = dayWork;
    }

    public String getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(String timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public String toString() {
        return "WorkingTime{" +
                "counter=" + counter +
                ", dayWork='" + dayWork + '\'' +
                ", timeWork='" + timeWork + '\'' +
                '}';
    }
}
