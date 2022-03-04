package com.homework.first.repository;

import com.homework.first.domain.Homework;

import java.util.ArrayList;
import java.util.List;

class InMemoryHomeworkImpl implements HomeworkRepository{

    private List<Homework> homeworks = new ArrayList<>();

    @Override
    public List<Homework> findAll() {
        return homeworks;
    }

    @Override
    public void save(Homework homework) {
        homeworks.add(homework);
    }

    @Override
    public void deleteByIndex(int index) {
        homeworks.remove(index);
    }
}
