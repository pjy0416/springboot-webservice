package com.zin0.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) // 이 어노테이션이 생성될 수 있는 위치를 지정, 이에 따라 파라미터 객체에서만 사용 가능
@Retention(RetentionPolicy.RUNTIME) // 컴파일 이후에도 JVM에 의해서 참조가 가능
//@Retention(RetentionPolicy.CLASS) // 컴파일러가 클래스를 참조할 때 까지 유효
//@Retention(RetentionPolicy.SOURCE) // 컴파일 이후 어노테이션 정보 사라짐
public @interface LoginUser {
}
