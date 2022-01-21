
package Story.Trols;

import java.io.PrintStream;
import java.util.Random;

public class Hemyliha extends Trol implements Talk {
    public Hemyliha(String name, int age, double height) {
        super(name, age, height);
        System.out.println("Pers created " + this.getName());
    }

    public String toString() {
        String name = this.getName();
        return "Name: " + name + ", Age: " + this.getAge() + ", Height: " + this.getHeight();
    }

    public void talk(boolean forself, String phrase) {
        if (forself) {
            System.out.println(phrase + " think " + this.getName());
        } else {
            PrintStream text = System.out;
            String name = this.getName();
            text.println(name + " say " + phrase);
        }

    }


    public void foodForGuest(Guest obj){
        Random random = new Random();
        Hemyliha.GuestCare currentFood =
                switch (random.nextInt(4)) {
                    case 0 -> GuestCare.FD1;
                    case 1 -> GuestCare.FD2;
                    case 2 -> GuestCare.FD3;
                    case 3 -> GuestCare.FD4;
                    default -> throw new IllegalStateException("Unexpected value");
                };

        ++Guest.food;
        PrintStream text = System.out;
        String name = this.getName();
        text.println(name + " treat " + obj.getName() + " " + currentFood.name);
    }

    public enum GuestCare {
        FD1("Cake"),
        FD2("Pie"),
        FD3("Cokie"),
        FD4("Tea");

        private final String name;

        GuestCare(String name) {
            this.name = name;
        }
    }

}
