
package Story.Trols;

import java.io.PrintStream;

public class Guest extends Trol implements Talk {
    public static int food;
    
    public Guest(String name, int age, double height) {
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

}
