public class OOPQuiz {
    public static void main(String[] args) {
        Person grandParent = new GrandParent("할아버지", 80);
        Person parent = new Parent("아빠", 50);
        Person child = new Child("잼민이", 13);

        Person[] people = { grandParent, parent, child };

        for (Person person: people) {
            System.out.println(person.name + ", 나이: " + person.age + ", 속도: " + person.speed + ", 현재위치: " + person.getLocation());
        }

        System.out.println("활동 시작!");

        for (Person person: people) {
            if(person instanceof Walkable) {
                ((Walkable) person).walk(1,1); // Walkable 이란 타입으로 캐스팅해서 괄호로 감싸짐.
                System.out.println(" - - - - - -");
            }

            if(person instanceof Runnable) {
                ((Runnable) person).run(2, 2);
                System.out.println(" - - - - - -");
            }

            if(person instanceof Swimmable) {
                ((Swimmable) person).swim(3, -1);
                System.out.println(" - - - - - -");
            }
        }
    }
}
