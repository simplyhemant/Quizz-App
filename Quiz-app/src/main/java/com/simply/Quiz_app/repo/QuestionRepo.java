package com.simply.Quiz_app.repo;

import com.simply.Quiz_app.entity.QuizQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<QuizQuestions, Long> {

}
