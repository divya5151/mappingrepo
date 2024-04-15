package com.hibernatemapping.map1.Services;

import com.hibernatemapping.map1.Entities.Answer;

import java.util.List;

public interface AnswerService {
    public Answer Create(Answer a);
    public Integer deleteAnswerById(Integer id);
    public List<Answer> getAllAnswers();
}
