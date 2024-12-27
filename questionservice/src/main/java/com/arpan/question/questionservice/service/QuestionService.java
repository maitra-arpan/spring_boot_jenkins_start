package com.arpan.question.questionservice.service;

import java.util.List;


import com.arpan.question.questionservice.entity.Question;

public interface QuestionService {

    Question addQuestion(Question question);
    List<Question> viewQuestions();
    Question viewQuestionById(Long questionId);
    List<Question> getQuestionsOftheQuiz(Long quizeId);

}
