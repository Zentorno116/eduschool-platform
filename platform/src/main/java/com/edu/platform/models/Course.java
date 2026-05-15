package com.edu.platform.models;

import jakarta.persistence.*;

@Entity
@Table(name = "courses") 
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(nullable = false, length = 50)
    private String format; 

    @Column(name = "duration_months", nullable = false)
    private Integer durationMonths;

    @Column(nullable = false)
    private Integer price; 

    public Course() {}

    public Course(String title, String format, Integer durationMonths, Integer price) {
        this.title = title;
        this.format = format;
        this.durationMonths = durationMonths;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }

    public Integer getDurationMonths() { return durationMonths; }
    public void setDurationMonths(Integer durationMonths) { this.durationMonths = durationMonths; }

    public Integer getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }
}