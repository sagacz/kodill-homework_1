package com.homework.first.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HomeworkDto {
    String name;
    String description;
    LocalDate dueDate;
    HomeworkStatus status;
}
