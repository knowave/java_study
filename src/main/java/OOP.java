class Phone {
    String model;
    String color;
    int price;

    public Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}

public class OOP {
    public static void main(String[] args) {
        Phone galaxy = new Phone("galaxy20", "Black", 100);

        Phone iphone =new Phone("iphone14", "Black", 200);

        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
    }
}