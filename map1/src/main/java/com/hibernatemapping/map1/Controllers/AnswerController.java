package com.hibernatemapping.map1.Controllers;

import com.hibernatemapping.map1.Entities.Answer;
import com.hibernatemapping.map1.Services.Impl.AnswerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Answer")
public class AnswerController {
    @Autowired
    AnswerServiceImpl ansimpl;
    @PostMapping("/insertans")
    public Answer insert(@RequestBody Answer a){

        return ansimpl.Create(a);
    }

}
