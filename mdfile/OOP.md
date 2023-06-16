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