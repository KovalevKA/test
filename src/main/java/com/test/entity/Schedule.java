package com.test.entity;


import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*
@Entity
@Table(name = "schedule")
@NamedQuery(name = "Schedule.getAll",query = "SELECT sc FROM Schedule sc")
*/
public class Schedule {

    private long counter;

    private long group_id;

    private long teacher_id;



}
