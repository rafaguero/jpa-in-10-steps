package com.in28minutes.rest.webservices.restfulwebservices.agent;

import com.in28minutes.rest.webservices.restfulwebservices.user.Post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Agent {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(mappedBy="agent")
    private List<Task> tasks;

    protected Agent(){}
    public Agent(Integer id,String name){
        super();
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
