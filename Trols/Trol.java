package Story.Trols;

import java.util.Objects;

public abstract class Trol {
    private final String name;
    private final int age;
    private final double height;


    Trol(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            Trol entity = (Trol) obj;
            return Objects.equals(this.name, entity.name) && Objects.equals(this.age, entity.age) && Objects.equals(this.height, entity.height);
        } else {
            return false;
        }
    }

    public abstract String toString();

    public int hashCode() {
        return Objects.hash(this.name, this.age, this.height);

    }
}
