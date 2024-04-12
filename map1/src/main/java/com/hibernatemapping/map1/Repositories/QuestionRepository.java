package com.hibernatemapping.map1.Repositories;

import com.hibernatemapping.map1.Entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
}
