package com.hibernatemapping.map1.Repositories;

import com.hibernatemapping.map1.Entities.Question;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
    @Transactional
    public Integer deleteQuestionById(Integer id);
    @Query(nativeQuery = true,value = "select * from question")
    public List<Question> getAllQuestions();
}
