package com.homework.first.service;


import com.homework.first.repository.HomeworkRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class HomeworkServiceConfiguration {

    @Bean
    HomeworkService HomeworkService(HomeworkRepository repository){
        return new HomeworkServiceImpl(repository);
    }
}
