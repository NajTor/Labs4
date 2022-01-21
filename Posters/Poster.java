package Story.Posters;

import java.util.Objects;

public abstract class Poster {
    private final String name;
    private final int number;


    Poster(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            Poster entity = (Poster)obj;
            return Objects.equals(this.name, entity.name) && Objects.equals(this.number, entity.number);
        } else {
            return false;
        }
    }

    public abstract String toString();

    public int hashCode() {
        return Objects.hash(this.name, this.number);

    }
}
