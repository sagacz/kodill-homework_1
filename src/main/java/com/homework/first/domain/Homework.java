package com.homework.first.domain;

import lombok.Value;

import java.time.LocalDate;

@Value(staticConstructor = "of")
public class Homework {
    String name;
    String description;
    LocalDate dueDate;
    HomeworkStatus status;
}
