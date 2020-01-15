package com.in28minutes.rest.webservices.restfulwebservices.agent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.in28minutes.rest.webservices.restfulwebservices.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Integer id;
    private String priority;   //low or high
    private String skills; //skill1,skill2,skill3
    private Date assignedDate;
    private String status; // open,assigned,complete

    protected Task(){}

    public Task(Integer id, String priority, String skills, Date assignedDate, String status) {
        this.id = id;
        this.priority = priority;
        this.skills = skills;
        this.assignedDate = assignedDate;
        this.status = status;
    }

    @ManyToOne(fetch= FetchType.LAZY)
    private Agent agent;
}
