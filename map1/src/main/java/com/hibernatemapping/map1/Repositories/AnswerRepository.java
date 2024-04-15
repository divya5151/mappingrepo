package com.hibernatemapping.map1.Repositories;

import com.hibernatemapping.map1.Entities.Answer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {
    @Transactional
    public Integer deleteAnswerById(Integer id);
}
