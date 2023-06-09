## 조건문

---

조건문은 주어진 조건식의 결과에 따라서 별도의 명령을 수행하도록 제어하는 명령문으로, 조건문 중에서 가장 기본이 되는 명령문은 **if**문 이다.
자바에서 사용하는 대표적인 조건문은 다음과 같다.

1. **if문**
2. **if / else 문**
3. **if / else if / else 문**
4. **switch 문**

### if

```java
public class Conditional {
    public static void main(String[] args) {
        int check = 100;
        int num1 = 150;
        
        if ( num1 > check ) {
            System.out.println("100보다 큰 수 입니다.");
        }
    }
        }
```
위와 같은 예시 코드에서 괄호 안에 조건이 `true`가 나오면 `sout`이 실행이 되지만 논리형에 맞게 true 값이 나오지 않으면 `sout`은 실행
되지 읺는다.

if 문에 이어서 또 다른 조건을 주고 싶으면 **else if**를 사용할 수 있다.

### else if 

```java
public class Conditional {
    public static void main(String[] args) {
        int check = 100;
        int num1 = 150;
        
        if ( num1 > check ) {
            System.out.println("100보다 큰 수 입니다.");
        } else if ( num1 > 50 ) {
            System.out.println("50보다 큰 수 입니다. 또는 100보다 작거나 같습니다.");
        }
    }
        }
```

### switch

또 다른 조건문 중에 switch 문이 존재하는데, if / else 문과 마찬가디로 주어진 조건 값의 결과에 따라 프로그램이 다른 명령을 수행하도록하는
조건문이다. switch 문은 if / else 문보다 가독성이 좋고, 컴파일러가 최적황를 쉽게 할 수 있어서 속도도 빠른 편이다.

```java
public class Conditional {
    public static void main(String[] args) {
        char score = 'A';
        
        switch (score) {
            case 'A':
                System.out.println("A등급");
                break;
            case 'B':
                System.out.println("B등급");
                break;
            case 'C':
                System.out.println("C등급");
                break;
            default:
                System.out.println("C등급 아래 등급");
                break;
        }
    }
}
```

위 코드를 보면 `switch`에는 소괄호안에 조건 값을 넣어주고, 중괄호를 열어서 `case`에 값을 넣고 `:`을 이용하여 그 안에 실행하고자
하는 명령문을 넣어준다.

그리고 각 `case`의 명령문 다음에 `break`가 있는데, `break`는 조건 값에 해당하는 `case`절이나 `default`절이 실행된 후 전제
`switch`문을 빠져나가게 해준다.

`default`는 조건 값이 위에 있는 `case`절에도 해당되지 않을때만 실행한다. `default`는 꼭 필요한건 아니고, 필요할 때 선언해서
사용을 할 수 있다. 그리고, `default`절은 아무 값을 넣어주지 않는다. (`case`절에 해당되지 않을 때만 실행하기 때문)

### 삼항 연산자

일단 처음으로 배운 프로그래밍 언어 중 **Javascript**에서도 존재하는 조건문이다. 삼항 연산자는 간단한 if / else 문일 경우 삼항 연산자를 이용해서 간결하게 표현할 수 있다.

```java
public class Conditional {
    public static void main(String[] args) {
        int a = 5;
        String result = ( a < 10 ) ? "10보다 작습니다." : "10보다 큽니다.";

        System.out.println(result);
    }
}
```
위 예시 코드에서 변수 `result`를 살펴보면 `=` 기준으로 맨 앞에 `( a <10 )` 이 부분이 조건 값이 되며,`true`면 `?`뒤에 `10보다 작습니다.`가 나오고 `false`면 `:` 뒤에 `10보다 큽니다.`가 출력이 된다.