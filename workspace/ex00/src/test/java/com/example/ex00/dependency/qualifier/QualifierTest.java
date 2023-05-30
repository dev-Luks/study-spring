package com.example.ex00.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;

@SpringBootTest
@Slf4j
public class QualifierTest {

    @Autowired
    Computer computer;

    @Test
    public void testComputer(){
        log.info(String.valueOf(computer));
    }

    @Autowired @Qualifier("vips")
   Restaurant restaurant; //primary를 설정해줘야함(하나만)

    @Test
    public  void testRestuarant(){
        log.info(String.valueOf(restaurant));
    }

