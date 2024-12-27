package com.arpan.question.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arpan.question.questionservice.entity.Question;
import com.arpan.question.questionservice.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    

    @PostMapping
    public Question addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @GetMapping
    public List<Question> viewQuestions(){
        return questionService.viewQuestions();
    }

    @PostMapping("/{questionId}")
    public Question viewQuestionById(@PathVariable Long questionId){
        return questionService.viewQuestionById(questionId);
    }

    @PostMapping("/quiz/{quizeId}")
    public List<Question> getQuestionByQuizId(@PathVariable Long quizeId){
        return questionService.getQuestionsOftheQuiz(quizeId);
    }

}
