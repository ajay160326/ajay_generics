import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (" + age + " years old)";
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Anil", 30));
        personList.add(new Person("cherry", 25));
        personList.add(new Person("Charlie", 22));

        // Sort by age using a lambda expression
        personList.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        // Print the sorted list
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
