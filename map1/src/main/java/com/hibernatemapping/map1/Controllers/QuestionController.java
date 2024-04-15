package com.hibernatemapping.map1.Controllers;

import com.hibernatemapping.map1.Entities.Question;
import com.hibernatemapping.map1.Services.Impl.QuestionServiceimpl;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Question")

public class QuestionController {
    @Autowired
    QuestionServiceimpl Queimpl;

    @PostMapping("/insertque")
    public Question insertque(@RequestBody Question q){

        return Queimpl.createQue(q);
    }
    @DeleteMapping("/deleteque/{id}")
   public Integer Delete(@PathVariable Integer id){

       return Queimpl.deleteQuestionById(id);
   }
   @GetMapping("/getquestion")
    public List<Question> getque(){

       return Queimpl.getAllQuestions();
   }
   @PostConstruct()
   public Question add( ){
    Question q1=new Question();
    q1.setQuestion("what is hibernate");
    Queimpl.createQue(q1);
    return q1;

   }

}
