package com.example.ex01.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TaskVO {
    private Integer num;
    private Integer kor;
    private Integer eng;
    private Integer math;
    private Integer total;
    private Double average;

    public Integer getTotal(){
        total = math + kor + eng;
        return total;
    }

    public Double getAvg(){
        average = total / 3.0 ;
        return average;
    }



}


