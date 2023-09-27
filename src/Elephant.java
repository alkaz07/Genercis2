import java.util.Objects;

public class Elephant extends Animal{
    String name;
    int age;

    public Elephant(String name, int age) {
        super(0);
        this.name = name;
        this.age = age;
    }

    public Elephant( String name, int age, double weight) {
        super(weight);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elephant elephant = (Elephant) o;
        return age == elephant.age && Objects.equals(name, elephant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
