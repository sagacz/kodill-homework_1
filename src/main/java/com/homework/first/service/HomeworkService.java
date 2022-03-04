package com.homework.first.service;

import com.homework.first.domain.Homework;

import java.util.List;

public interface HomeworkService {
    List<Homework> getHomeworks();
    void createHomework(Homework homework);
    void deleteHomework(int index);
}
