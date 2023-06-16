## OOP

---

### Class

어떤 속성을 갖는지와 어떤 모양을 갖는지는 미리 틀을 만들어서 정해져있는 것이다. 예를 들어 붕아빵 틀로 표현하자면 밀가루 반죽을 붓고 팥을 붓고 불을 그을리면 붕어빵이 나오듯이 이 틀을 통해서 만들어진 붕어빵을 **Instance**라고 생각하면 된다.

Instance는 만들어지면서 각 다르지만 모습은 동일하게 가지고 있다. 한 번 생성되고 나면 그 자체의 상태를 가지고 그 자체로 변화를 하게된다.

```java
class Phone {
    String model;
    String color;
    int price;
}

public class OOP1 {
    public static void main(String[] args) {
        Phone galaxy = new Phone();
        galaxy.model = "Galaxy10";
        galaxy.color = "Black";
        galaxy.price = 100;

        Phone iphone =new Phone();
        iphone.model = "iPhoneX";
        iphone.color = "Black";
        iphone.price = 200;


        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
    }
}
```

class 내부에 있는 method를 사용하기 위해서는 인스턴스화가 필요하다.
```java
class Calculation {
    int add(int x, int y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }
}

public class OOP1 {
    public static void main(String[] args) {
        // write your code here
        Calculation calculation = new Calculation(); // 인스턴스화를 시켜준다.
        int addResult = calculation.add(1, 2); // 인스턴스화를 시킨 변수를 이용하여 method를 호출한다.
        int subtractResult = calculation.subtract(2, 1); // 인스턴스화를 시킨 변수를 이용하여 method를 호출한다.

        System.out.println(addResult); // 3
        System.out.println(subtractResult); // 1
    }
}
```

#### 생성자 (constructor)

생성자는 **Instance**가 생성될 때 즉, `new`라는 키워드를 통해서 class의 instance를 생성했을 때 그때 불리는 초기화 method이다. (new를 통해서 불러와짐.)

생성자의 형식은 class의 이름이 있으면 class의 이름이랑 똑같은 이름으로 지어줘야 한다. (생성자의 규칙) 그리고 생성자는 리턴값이 없다. `new` 키워드를 사용하면 그 개체 결과가 return이 되지 특별히 다른 값이 return이 되지 않듯이 return값이 없다.

생성자를 만들어주지 않으면 Java compiler가 아무것도 없는 빈 생성자 하나를 자동으로 만들어줘서 `new class()`를 해서 괄호 안에 아무 값을 넣지않고 Instance를 생성할 수 있는 것이다.

```java
class Phone {
    String model;
    String color;
    int price;

    public Phone (String model, String color, int price) { // 생성자 이름은 class 이름과 같아야한다.
        this.model = model; // this. 뒤에 있는 model은 위에서 정의한 model이다.
        this.color = color;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Phone galaxy = new Phone();

        Phone iphone =new Phone();

        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
    }
}
```