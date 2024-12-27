package com.arpan.question.questionservice.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arpan.question.questionservice.entity.Question;
import com.arpan.question.questionservice.repository.QuestionRepository;
import com.arpan.question.questionservice.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> viewQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question viewQuestionById(Long questionId) {
        return questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> getQuestionsOftheQuiz(Long quizeId) {
        return questionRepository.findByQuizeId(quizeId);
    }

}
