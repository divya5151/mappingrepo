package com.hibernatemapping.map1.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;
@Entity
@Data

public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String Question;
    @OneToOne(mappedBy = "q")
    private  Answer a;

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

    public Answer getA() {
        return a;
    }

    public void setA(Answer a) {
        this.a = a;
    }
}
