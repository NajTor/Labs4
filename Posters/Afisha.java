package Story.Posters;

import java.io.PrintStream;

public class Afisha extends Story.Posters.Poster implements Story.Posters.Stick, Story.Posters.Circled {
    public Afisha(String name, int number) {
        super(name, number);
        System.out.println("Pers created " + this.getName());
    }

    public String toString() {
        String name = this.getName();
        return "Name: " + name + ", Number: " + this.getNumber() ;
    }

    public void stick(int place){
        String i = switch (place) {
            case 0 -> "Roof";
            case 1 -> "Wall";
            default -> "Road";
        };
        PrintStream text = System.out;
        String name = this.getName();
        text.println(name + " Stick to "+ i);
    }

    public void circled(int place) {
        String i = switch (place) {
            case 0 -> "Forest";
            case 1 -> "Town";
            default -> "Lake";
        };
        PrintStream text = System.out;
        String name = this.getName();
        text.println(name + " Circled over " + i);
    }

    public void torn(int pices){
        PrintStream text = System.out;
        String name = this.getName();
        text.println(name + " torn to "+ pices + " pices");
    }

}