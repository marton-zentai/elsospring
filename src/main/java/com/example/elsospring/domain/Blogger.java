package com.example.elsospring.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Blogger {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private int age;

    @JsonBackReference
    @OneToMany(mappedBy = "blogger")
    private List<Story> stories;

    public Blogger() {

    }

    public Blogger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
}
