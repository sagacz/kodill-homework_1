package com.homework.first.controller;

import com.homework.first.domain.HomeworkDto;
import com.homework.first.mapper.HomeworkMapper;
import com.homework.first.service.HomeworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/homework")
public class HomeworkController {

    private final HomeworkService service;

    @GetMapping
    public List<HomeworkDto> getHomeworks(){
        return HomeworkMapper.toHomeworkDtos(service.getHomeworks());
    }

    @PostMapping
    public void createHomework(@RequestBody HomeworkDto hdto){
        service.createHomework(HomeworkMapper.toHomework(hdto));
    }

    @DeleteMapping("/{index}")
    public void deleteHomework(@PathVariable("index") int index){
        service.deleteHomework(index);
    }

}
