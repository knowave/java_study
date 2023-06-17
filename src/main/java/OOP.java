class Animal {
    String name;
    String color;

    public Animal(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println(name + " is crying.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println(name + " is barking.");
    }
}

public class OOP {
    public static void main(String[] args) {
        // write your code here
        Animal dog = new Dog("강아지");
        dog.cry();
    }
}