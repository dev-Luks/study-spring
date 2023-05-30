package com.example.ex00.dependency;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor  //final 붙거나 @ No nun 있는 애들만 생성자 주입이 된다.
/*@NoArgsConstructor <<<<<기본생성자 있으면 final 못씀 */
public class Coding {
//  필드 주입
//  사용 방법이 매우 편하다는 장점이 있다.
//   ----단점----
//  1. 주입된 객체를 불면(immutable)상태로 만들 수 없기 때문에 외부에서 수정될 위험이 있다.
//  2. 순환 참조 발생 시 Application 동작 시점과, Runtime 시점 중 필드주입은 Runtime 시점에 해당하기 때문에
//  메모리에 계속 할당되고 StackOverFlow가 발생했다. 하지만 2.6버전 이상부터는 Application 동작 시점에서 잡힌다.
//  생성 후 주입, 객체를 생성한 시점에서는 순환 참조 발생 여부를 알 수 없다.

/*    @Autowired*/
    /*private Computer computer;*/  //final을 붙여 (불변성)을 준다

//  setter 주입
//  주입받는 객체가 변경될 가능성이 있는 경우에 사용한다.
//  OCP(open-Closed Principle, 개방-폐쇄 원칙)을 위반하기 때문에 변경 가능성을 배제하고 불변성을 보장하는 것이 좋다.
//    생성후 주입
//  private Computer computer;

//  >>>>>>>>>>>>>>>>>>>>>>>> 생성자 주입 <<<<<<<<<<<<<<<<<<<<<<< 결국 이걸써라!
//  불변성이 생기기 때문에 해당 필드에 final 키워드를 작성할 수 있다.
//  컴파일 시점에서 주입 문제 발생을 확인할 수 있으며,
//  객체를 생성하는 시점에서 Bean객체를 필수로 초기화하기 때문에 NPE를 방어할 수 있다.
//  순환 참조 발생시 필드를 올리기 전에 감지가 되기 떄문에 안전하다.
//  주입 후 생성, 생성 시 순환참조 발생 여부를 알 수 있기 때문에 Application 실행 시점에서 순환참조 오류를 발견할 수 있다.


    private final Computer computer;



   /* @Autowired
    public Coding(Computer computer){
        this.computer = computer;
    }*/



}
