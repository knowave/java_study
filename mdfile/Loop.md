## 반복문

---

반복문은 프로그램 내에서 똑같은 명령을 일정 횟수만큼 반복해서 수행하도록 제어하는 명령문으로, 프로그램이 처리하는 대부분의 코드는 반복적인 형태가 많으므로, 가장 맣이 사용하는 제어문 중 하나다.

### for 문

```java
public class Loop {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);    
        }

        System.out.println(sum);    // 55
    }
}
```

위 코드에서 소괄호 안에 맨 왼쪽인 `int i = 0;` 이 부분은 초기화 블럭이다. for 문에 진입할 때, 한 번 실행하는 구문을 이 부분에 써준다. 그래서 `i = 0;`을 `int i` 변수를 선언하고 0을 할당해준다.

`i < 10;`이 부분은 조건문인데 이 반복문을 소괄한 안이 참일 때 수행을 하게된다. 맨 오른쪽에 있는 것은 한 번 실행이 되고, 그 다음 번에 조건에 체크하러 들어오기 전에 그 구문을 입력해주면 된다.

### for-each 문

for-each 문은 배열이나 collection같은 것들을 반복문을 쉽게 짤 수 있는 형태다. 즉, 어떤 것의 나열들이 있는 변수가 있을 때 반복문을 간결하게 짤 수 있는 형태를 말한다.

```java
public class Loop {
    public static void main(String[] args) {}
}
```