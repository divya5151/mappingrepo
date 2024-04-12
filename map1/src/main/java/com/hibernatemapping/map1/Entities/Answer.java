package com.hibernatemapping.map1.Entities;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data

public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String Answer;
    @OneToOne/*(mappedBy = "a")*/
    private Question q;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public Question getQ() {
        return q;
    }

    public void setQ(Question q) {
        this.q = q;
    }
}
