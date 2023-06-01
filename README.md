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


## 자료형

---

앞서 배운 **변수와 상수**에서 type을 정의한 `int` `String` 이런 type 정보들을 자료형이라고 한다. (int = 숫자, String = 문자)

### Primitive Type (기본 자료형)

#### 숫자
1. **short**: 컴퓨터에서 2byte로 표현할 수 있는 정수형 자료형을 의미한다. (-32768 ~ 32768까지 표현할 수 있음)
2. **int**: 컴퓨터에서 4byte로 표현할 수 있는 자료이다. (-20억 ~ +20억까지 표현할 수 있다.) _ 가장 기본적으로 많이 사용.
3. **long**: 컴퓨터에서 8byte를 표현할 수 있는 자료이다. (int외에 더 많은 수를 표현해야 할 때 사용)
4. **float**: 소수점을 표현할 때 사용한다. java에서는 소수점 뒤에 F를 붙여야  float 타입 적용이 된다.
   5. **double**: 소수점을 표형할 때 사용한다. float보다 더 큰 소수점을 표현할 때 사용한다.

#### 문자
1. **char**: character의 약자로, 글자 하나만 표현하기 때문에 여러 글자를 표현할 수 없다.

#### 논리
1. **boolean**: 참과 거짓을 표현하는데 출력하는데 사용은 잘 하지 않고, 반복문이나 조건문 등 어떤 경우의 수를 판달할 때 사용한다.

#### 바이트
1. **byte** = 컴퓨터에서 표현되는 모든 데이터는 byte의 연속이며, 직접 쓰는 일은 별로 없다.. (예시로 `'d'`는 아스키코드에서 십진법으로 100이다.)

### Reference Type (참조 자료형)
