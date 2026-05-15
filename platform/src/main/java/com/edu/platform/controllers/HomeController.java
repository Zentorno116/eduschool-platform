package com.edu.platform.controllers;
import com.edu.platform.models.Course;
import com.edu.platform.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final CourseRepository courseRepository;

    @Autowired
    public HomeController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Course> courses = courseRepository.findAll();
        
        model.addAttribute("coursesList", courses);
        
        return "index";
    }
}