## 연산자

---

연산자란 더하기, 빼기, 곱셉, 나누기 이런 것처럼 수식을 계산하거나 비교하는 행위를 도와주는 기호들이다.

### 산술 연산자

- 더하기: +
- 빼기: -
- 곱하기: *
- 나누기: /
- 나머지: %

```java
public class operator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        System.out.println(num1 + num2);    // 15
        System.out.println(num1 - num2);    // 5
        System.out.println(num1 * num2);    // 50
        System.out.println(num1 / num2);    // 2
        System.out.println(num1 % num2);    // 0
    }
}
```

### 대입 연산자

대입 연산자란 계산을 한 결과를 대입하겠다는 것이다.

```java
public class Operator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1);
        
        num1 += num2;   // num1에 num2랑 더한 값의 결과를 넣겠다.
        System.out.println(num1);
        
        num1 -= num2;   // num1에 num2랑 뺀 값의 결과를 넣겠다.
        System.out.println(num1);   // 10 (윗줄에서 num1은 15로 할당되어 있음.)
        
        num1 *= num2;   // num1에 num2랑 더한 값의 결과를 넣겠다.
        System.out.println(num1);   // 50

        num1 /= num2;   // num1에 num2랑 나눈 값의 결과를 넣겠다.
        System.out.println(num1);   // 10

        num1 %= num2;   // num1에 num2와의 나머지 값의 결과를 넣겠다.
        System.out.println(num1);   // 0
    }
}
```

### 관계 연산자

두 값을 비교하는 연산자다. 관계 연산자는 자료형에 있는 논리형의 true or false를 반환하는 **Boolean** 타입의 결과가 나타난다.

```java
public class Operator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 10;

        System.out.println(num1 > num2);    // true
        System.out.println(num >= num3);    // true (같거나 크면 이라는 전제에 같기 때문에 true를 반환)
        System.out.println(num1 < num2);    // false
        System.out.println(num1 <= num3);   // true
        System.out.println(num1 == num3);   // true (=가 두개면 완전 일치한지 체크. JS에서는 type까지 완전 일치한지 체크하려면 ===)
        System.out.println(num1 != num2);   // true
    }
}
```

### 논리 연산자

자료형 타입 중 논리형인 `boolean`의 연산자로 `&&`를 쓰면 왼쪽도 참이고 오른쪽도 참으로, **AND** 조건을 의미한다. 또한 `||`를 사용하면 **OR**
조건을 의미하며 왼쪽의 값과 오른쪽의 값 중에 둘 중에 하나가 참이면 `true`가 반환된다.

마지막으로 **NOT** 연산자는 반대조건을 해주는 것으로 `boolean` 타입의 `b`라는 변수에 `false`를 넣고, `!b`라고 해주면 `true`를 반환을 해준다.

```java
public class Operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // false - 둘 중 하나라도 참이 아니면 false (b는 false이므로 참이 아님.)
        System.out.println(a && true);  // true - 둘다 참이므로 true
        System.out.println(a || b); // true
        System.out.println(false || b); // false - 둘 중에 하나가 참이면 true인데 둘다 false이기 때문에 false
        System.out.println(!b); // true
        System.out.println(!a); // false
    }
}
```

### 비트 연산자