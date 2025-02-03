package com.simply.Quiz_app.service;

import com.simply.Quiz_app.entity.QuizQuestions;
import com.simply.Quiz_app.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<QuizQuestions> getAllQuestions()
    {
        List<QuizQuestions> questionRepoAll = questionRepo.findAll();
        return questionRepoAll;
    }

        public QuizQuestions saveQuestions(QuizQuestions questions)
    {
        QuizQuestions save = questionRepo.save(questions);
        return save;
    }

}
