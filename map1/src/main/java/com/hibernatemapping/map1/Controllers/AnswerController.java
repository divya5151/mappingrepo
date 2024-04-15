package com.hibernatemapping.map1.Controllers;

import com.hibernatemapping.map1.Entities.Answer;
import com.hibernatemapping.map1.Entities.Question;
import com.hibernatemapping.map1.Services.Impl.AnswerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Answer")
public class AnswerController {
    @Autowired
    AnswerServiceImpl ansimpl;
    @PostMapping("/insertans")
    public Answer insert(@RequestBody Answer a){

        return ansimpl.Create(a);
    }
    @DeleteMapping("/deleteans/{id}")
    public  Integer del(@PathVariable Integer id){

        return ansimpl.deleteAnswerById(id);
    }
    @GetMapping("/getanswer")
    public List<Answer> getans(){

        return ansimpl.getAllAnswers();
    }
}
