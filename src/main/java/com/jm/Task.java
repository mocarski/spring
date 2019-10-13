package com.jm;

import javax.persistence.*;

@Entity
public class Task {
//    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    @Id
    private Integer id;

    @Column
    private String name;


    //Gettery, Settery itp.
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


    public Task withId(final Integer id) {
        this.id = id;
        return this;
    }

    public Task withName(final String name) {
        this.name = name;
        return this;
    }


    @Override
    public String toString() {
        return "TaskEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}