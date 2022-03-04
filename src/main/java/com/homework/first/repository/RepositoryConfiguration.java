package com.homework.first.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class RepositoryConfiguration {

    @Bean
    HomeworkRepository repository() {
        return new InMemoryHomeworkImpl();
    }
}
