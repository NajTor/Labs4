package Story.Kids;

import java.util.Objects;

public abstract class Troliki {
    private final String name;
    private final int age;
    private final double number;


    Troliki(String name, int age, double number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getNumber() {
        return this.number;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            Troliki entity = (Troliki) obj;
            return Objects.equals(this.name, entity.name) && Objects.equals(this.age, entity.age) && Objects.equals(this.number, entity.number);
        } else {
            return false;
        }
    }

    public abstract String toString();

    public int hashCode() {
        return Objects.hash(this.name, this.age, this.number);

    }
}
