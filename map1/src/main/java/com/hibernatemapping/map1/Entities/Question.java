package com.hibernatemapping.map1.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@Entity
@Data

public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String Question;
   /* @OneToOne(mappedBy = "q",cascade = CascadeType.REMOVE)
    private  Answer a;*/
    @OneToMany(mappedBy = "q",cascade = CascadeType.REMOVE)
    @JsonBackReference

    private List<Answer> a;

    public List<Answer> getA() {
        return a;
    }

    public void setA(List<Answer> a) {
        this.a = a;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

  /*  public Answer getA() {
        return a;
    }

    public void setA(Answer a) {
        this.a = a;
    }*/
}
