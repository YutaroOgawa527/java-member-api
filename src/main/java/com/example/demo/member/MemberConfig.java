package com.example.demo.member;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class MemberConfig {
  @Bean
  CommandLineRunner commandLineRunner(MemberRepository repository) {
    return args -> {
      Member test1 = new Member(
        "test1",
        "test1@gmail.com",
        LocalDate.of(1997, Month.MAY,27)
      );

      Member test2 = new Member(
        "test2",
        "test2@gmail.com",
        LocalDate.of(1999, Month.FEBRUARY,9)
      );

      repository.saveAll(
        List.of(test1, test2)
      );
    };
  }
}
