package com.infsis.example.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;



    @OneToMany(fetch = FetchType.LAZY,mappedBy = "blog")
    private List<Article> articles;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;




    public Blog(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Blog() {
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


}
