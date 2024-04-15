package com.hibernatemapping.map1.Services.Impl;

import com.hibernatemapping.map1.Entities.Answer;
import com.hibernatemapping.map1.Repositories.AnswerRepository;
import com.hibernatemapping.map1.Services.AnswerService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerRepository ans;

    @Override
    public Answer Create(Answer a) {
        return ans.save(a);
    }

    @Override
    public Integer deleteAnswerById(Integer id) {
        Integer i= ans.deleteAnswerById(id);
        System.out.println(i);
        if(i==1){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public List<Answer> getAllAnswers() {
        return ans.findAll();
    }
}
