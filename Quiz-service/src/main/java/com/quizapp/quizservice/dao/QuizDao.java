package main.java.com.quizapp.quizservice.dao;

import com.quizapp.quizservice.model.Quiz;
import org.springframework.data.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
    
} 
