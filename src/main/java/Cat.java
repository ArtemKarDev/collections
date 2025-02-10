import java.util.ArrayList;
import java.util.List;

public class Cat {
    private static String breed = "Persian"; // порода
    public String name;
    private int age;
    private double weight;
    private List friendsName = new ArrayList<>();

    public Cat(String name, int age, double weight, List friendsName) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.friendsName = friendsName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", friendsName=" + friendsName +
                '}';
    }
}