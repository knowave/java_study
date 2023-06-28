## 예외, 에러 처리
---

### 예외 처리란?

코드를 완벽하게 짰다고 해서 항상 프로그램이 성공적으로 도는 것은 아니다. 다양한 예외 상황이 있을 발생할 수 있는데, 이것에 대응하기 위한 예외 처리 코드가 필요하다.

**예외 처리의 목적**
1. 예외의 발생으로 인한 실행 중인 프로그램의 비정상 종료를 막기 위함.
2. 개발자에게 알려서 코드를 보완할 수 있도록 하기 위함.

Java에서는 상속을 이용해서 모든 예외를 표현한다. 모든 예외 클래스는 `Throwable`의 자식 클래스다. `Throwable`에는 크게 두 종류의 자식 클래스가 존재한다.
- `Error`는 프로그램이 종료되어야 하는 심각한 문제를 표현한다. 대부분 컴퓨터나 JVM이 시스템적으로 동작할 수 없는 상황을 표현한다.
- `Exception`은 프로그램이 종료되지는 않지만 예외나 문제 상황을 표현하기 위해서 사용된다.
> **Java**는 **JVM**내의 **Heap**이라는 메모리 공간을 OS로부터 할당 받아 사용한다. 할당 받을 수 있는 최대 메모리 이상을 사용하면, **JVM**이 다운될 수 밖에 없다. 이 경우 `OutOfMemoryError`가 나면서 프로그램이 종료된다. **Java**의 대표적인 에러 상황을 줄여서 `OOM`이라고 한다.

대부분 표현하려는 예외 상황은 대부분 `Exception`종류일 것이다. 실행도중 발생하는 **Exception**은 `RunTimeException`을 상속받아서 정의를 한다.

파일을 읽고 쓰거나, 원격에 있는 저장소로부터 데이터를 읽고 쓸 때 나는 에러를 표현하려면 `IOException`을 상속받아서 정의한다.

```java
public class Exception {
    public static void main(String[] args) {
        int number = 10;
        int result;

        for(int i = 10; i >= 0; i--) {
            try {
                result = number / i;
                System.out.println(result);
            } catch (java.lang.Exception e) {
                System.out.println("Exception 발생: " + e.getMessage());
            } finally {
                System.out.println("항상 실행되는 finally 구문");
            }
        }
    }
}
```

`try-catch(-finally)` 형식을 이용하여 예외 처리를 진행했다. `finally`구문은 필수는 아니며, 예외 발생여부에 관계 없이 **항상 수행되어야하는 코드를 구현한다.**

만약에 예외가 발생하지 않는다면 `try -> finally` 순으로 실행이된다. 또한, 예외는 중복 `catch` 블럭을 사용하여 다양한 예외 처리를 수행할 수 있다.

중복 `catch` 블럭을 사용할 때는 먼저 선언된 `catch` 블럭부터 확인한다. 앞의 `catch`블럭에서 잡혔다면, 뒤에 `catch`블럭으로는 전파되지 않는다.

좁은 범위의 예외부터 앞에서 선언하는 것이 좋다. 여기서 좁은 범위는 상속관계에서 자식 클래스에 위치 할수록 좁은 법위다.

예를 들어 `IOException`이 발생할 것 같아 예외 처리를 하고, 그 외의 예외 처리를 하고 싶다면 `IOException`을 `catch`하는 구문을 먼저, `Exception`을 `catch`하는 구문을 그 뒤에 작성한다.