package com.test.java.ch20;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Autowired {
    String value();
}

// 2. 클래스에 @Autowired 어노테이션 적용
public class Ex01AnnotationTest {

    // 필드에 어노테이션 적용 (필드 초기화할 값 설정)
    @Autowired("Hello, World!")
    private String autowiredField;

    public static void main(String[] args) {
        Ex01AnnotationTest example = new Ex01AnnotationTest();
        example.initializeAutowiredFields(); // 어노테이션 값으로 필드 초기화 메서드 호출

        // 초기화 결과 확인
        System.out.println("autowiredField: " + example.autowiredField);
    }

    // 3. 필드를 초기화하는 메서드 작성
    public void initializeAutowiredFields() {
        // Ex01Annotation 클래스의 모든 필드를 반복
        for (Field field : this.getClass().getDeclaredFields()) {
            // 필드에 @Autowired 어노테이션이 있는지 확인
            Autowired autowired = field.getAnnotation(Autowired.class);
            if (autowired != null) {
                field.setAccessible(true); // 비공개 필드에 접근 허용
                try {
                    // 필드에 @Autowired 어노테이션의 value 값을 할당
                    field.set(this, autowired.value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
