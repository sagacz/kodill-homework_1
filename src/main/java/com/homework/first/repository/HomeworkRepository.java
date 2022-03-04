package com.homework.first.repository;


import com.homework.first.domain.Homework;
import com.homework.first.domain.HomeworkDto;

import java.util.List;

public interface HomeworkRepository {
    List<Homework> findAll();
    void save(Homework homework);
    void deleteByIndex(int index);
}
