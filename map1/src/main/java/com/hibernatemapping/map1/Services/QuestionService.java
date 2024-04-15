package com.hibernatemapping.map1.Services;

import com.hibernatemapping.map1.Entities.Question;

import java.util.List;

public interface QuestionService {
    public Question createQue(Question q);
    public Integer deleteQuestionById(Integer id);

    public List<Question> getAllQuestions();
}
