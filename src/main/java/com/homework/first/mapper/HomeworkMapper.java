package com.homework.first.mapper;

import com.homework.first.domain.Homework;
import com.homework.first.domain.HomeworkDto;

import java.util.List;
import java.util.stream.Collectors;

public class HomeworkMapper {

    public static HomeworkDto toHomeworkDto(Homework h){
        return new HomeworkDto(h.getName(), h.getDescription(), h.getDueDate(),
                h.getStatus());
    }

    public static Homework toHomework(HomeworkDto hdto){
        return Homework.of(hdto.getName(), hdto.getDescription(), hdto.getDueDate(),
                hdto.getStatus());
    }

    public static List<HomeworkDto> toHomeworkDtos(List<Homework> homeworkList){
        return homeworkList
                .stream()
                .map(h -> new HomeworkDto(h.getName(), h.getDescription(),
                        h.getDueDate(), h.getStatus()))
                .collect(Collectors.toList());
    }

    public static List<Homework> toHomeworks(List<HomeworkDto> hdtos){
        return hdtos
                .stream()
                .map(h -> Homework.of(h.getName(), h.getDescription(),
                        h.getDueDate(), h.getStatus()))
                .collect(Collectors.toList());
    }

}
