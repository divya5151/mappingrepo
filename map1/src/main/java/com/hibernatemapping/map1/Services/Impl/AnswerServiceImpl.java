package com.hibernatemapping.map1.Services.Impl;

import com.hibernatemapping.map1.Entities.Answer;
import com.hibernatemapping.map1.Repositories.AnswerRepository;
import com.hibernatemapping.map1.Services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerRepository ans;

    @Override
    public Answer Create(Answer a) {
        return ans.save(a);
    }
}
