package com.simply.Quiz_app.controller;

import com.simply.Quiz_app.entity.QuizQuestions;
import com.simply.Quiz_app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://localhost:8080")
@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/questions")
    public List<QuizQuestions> getQuestions()
    {
        return questionService.getAllQuestions();
    }

    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public QuizQuestions saveQuestions(@RequestBody QuizQuestions questions)
    {
        return questionService.saveQuestions(questions);
    }


}
