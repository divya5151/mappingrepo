package com.hibernatemapping.map1.Controllers;

import com.hibernatemapping.map1.Entities.Question;
import com.hibernatemapping.map1.Services.Impl.QuestionServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Question")

public class QuestionController {
    @Autowired
    QuestionServiceimpl Queimpl;

    @PostMapping("/insertque")
    public Question insertque(@RequestBody Question q){

        return Queimpl.createQue(q);
    }


}
