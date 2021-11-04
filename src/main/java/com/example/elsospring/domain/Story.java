package com.example.elsospring.domain;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "stories")
public class Story {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private Date posted;
    @ManyToOne
    private Blogger blogger;

    public Story() {

    }

    public Story(String title, String content, Date posted, Blogger blogger) {
        this.title = title;
        this.content = content;
        this.posted = posted;
        this.blogger = blogger;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setAuthor(Blogger blogger) {
        this.blogger = blogger;
    }
}
