package com.hibernatemapping.map1.Services.Impl;

import com.hibernatemapping.map1.Entities.Question;
import com.hibernatemapping.map1.Repositories.QuestionRepository;
import com.hibernatemapping.map1.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QuestionServiceimpl implements QuestionService {
    @Autowired
    QuestionRepository que;

    @Override
    public Question createQue(Question q) {
        return que.save(q);
    }

    @Override
    public Integer deleteQuestionById(Integer id) {

        Integer i= que.deleteQuestionById(id);
        System.out.println(i);
        if(i==1){
            return  1;
        }else{
            return 0;
        }
    }

    @Override
    public List<Question> getAllQuestions() {
        return que.getAllQuestions();
//        return que.findAll();
    }
}
