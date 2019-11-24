package com.cko.sampleSpringProject.model;

import javax.persistence.*;

@Entity
public class film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private int rating;

    @Column
    private int age;

    public film() {
    }

    public film(String title, int raiting, int age) {
        this.title = title;
        this.rating = raiting;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public int getAge() {
        return age;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
