package com.arpan.question.questionservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.arpan.question.questionservice.entity.Question;

@Repository
public interface QuestionRepository  extends JpaRepository<Question, Long>{

    List<Question> findByQuizeId(Long quizeId);

}
