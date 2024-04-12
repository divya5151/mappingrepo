package com.hibernatemapping.map1.Services.Impl;

import com.hibernatemapping.map1.Entities.Question;
import com.hibernatemapping.map1.Repositories.QuestionRepository;
import com.hibernatemapping.map1.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class QuestionServiceimpl implements QuestionService {
    @Autowired
    QuestionRepository que;

    @Override
    public Question createQue(Question q) {
        return que.save(q);
    }
}
