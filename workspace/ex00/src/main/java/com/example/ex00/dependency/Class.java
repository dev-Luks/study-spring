package com.example.ex00.dependency;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class Class {
    private List<Student> students;  //list는 Spring에 요청할수/ 주입할 수 없다.
}
