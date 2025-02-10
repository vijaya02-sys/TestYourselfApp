package com.quizapp.questionservice.controller;

import com.quizapp.questionservice.model.Question;
import com.quizapp.questionservice.model.QuestionWrapper;
import com.quizapp.questionservice.model.Response;
import com.quizapp.questionservice.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Enviroment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.list;


@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    main.java.com.quizapp.questionservice.service.QuestionService questionService;

    @Autowired
    Enviroment Enviroment;

    @GetMapping("allQuestions") 
    public ResponseEntity<List<Question>> getAllQuestions() {
        reutrn questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Integer>> getQuestionsByCategory(@PathVaribale String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName,
            @RequestParam Integer numQuestions) {
        return questionService.getQuestionsForQuiz(categoryName, numQuestions);
    }

    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(RequestBody List<Integer> questionIds) {
        System.out.println(enviroment.getProperty("local.server.port"));
        return questionService.getQuestionsFromId(questionIds);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses) {
        return questionService.getScore(responses);
    }

    // generate
    // getQuestions
    // getScore

}