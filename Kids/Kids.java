
package Story.Kids;

import Story.Trols.Talk;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;


public class Kids extends Story.Kids.Troliki implements Talk, Story.Kids.Pick {
    public Kids(String name, int age, double number) {
        super(name, age, number);
        System.out.println("Pers created " + this.getName());
    }

    public String toString() {
        String name = this.getName();
        return "Name: " + name + ", Age: " + this.getAge() + ", Number: " + this.getNumber();
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


    public void climbup() {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        try {
            if (s.equals("True") || s.equals("False")) {
                if (s.equals("True")) {
                    System.out.println("Kids climbed to roof succsessfulli");
                }
                if (s.equals("False")) {
                    System.out.println("Kids climbed up unsuccsessfulli, they fall and die R.I.P. :(");
                    System.exit(1);
                }
            } else {
                throw new NotEqualsValue();
            }
        } catch (NotEqualsValue e) {
            System.out.println("Exception: " + e);
            System.exit(1);
        }
    }

    public void pick() {
        Random random = new Random();
        Kids.PickUp currentOb =
                switch (random.nextInt(4)) {
                    case 0 -> PickUp.FD1;
                    case 1 -> PickUp.FD2;
                    default -> throw new IllegalStateException("Unexpected value: " + random.nextInt(4));
                };

        PrintStream var9999 = System.out;
        String var10001 = this.getName();
        var9999.println(var10001 + " pick up " + currentOb.name);

    }

    public enum PickUp {
        FD1("Lonely Afisha"),
        FD2("Theatrical Afishas");

        private final String name;

        PickUp(String name) {
            this.name = name;
        }
    }

     static class NotEqualsValue extends Exception {
        public String toString() {
            return "Not Equales Value - True or False";
        }
    }


}
