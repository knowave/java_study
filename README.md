# Java Study

## 변수와 상수

---

### 변수 선언
변수 선언 시 변수 이름 앞에 `type`을 넣어준다. 그리고 `=`을 이용해서 변수에 값을 할당해준다.

**예시**
```java
public class Main {
    public static void main(String[] args) {
        int number = 3;
        String str = "Hello World!";
        
        System.out.println(number); // 3
        System.out.println(str);    // Hello World!
    }
}
```

### 상수 선언
상수 선언 시 `final` 이라는 키워드를 이용해서 선언을 한다.

**예시**
```java
public class Main {
    public static void main(String[] args) {
        final int finalNumber = 10;
        System.out.println(finalNumber);    // 10
    }
}
```
**❗️주의 사항: 상수 선언 후 값을 재할당 할 시 컴파일 에러가 발생한다. (`final`은 접근 제어자 역할을 한다.)**

앞서 설명한 변수에는 `type`이 붙고, 변수의 이름은 아무거나 써도 상관이 없지만, 맨 첫 글자에는 숫자나 특수문자는 오지 못한다는 규칙이 존재한다.

또한, Java에는 코드의 가독성(?)을 생각하는 **de facto standard**가 존재하는데, 주로 카멜케이스로 변수의 이름을 설정하는 **Convention**이 존재한다. (Javascript와 바슷하다 느낌.) 
