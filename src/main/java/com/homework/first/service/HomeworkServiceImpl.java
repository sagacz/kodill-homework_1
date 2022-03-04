package com.homework.first.service;

import com.homework.first.domain.Homework;
import com.homework.first.repository.HomeworkRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class HomeworkServiceImpl implements HomeworkService{

    private final HomeworkRepository repository;

    @Override
    public List<Homework> getHomeworks() {
        return repository.findAll();
    }

    @Override
    public void createHomework(Homework homework) {
        repository.save(homework);
    }

    @Override
    public void deleteHomework(int index) {
        repository.deleteByIndex(index);
    }
}
