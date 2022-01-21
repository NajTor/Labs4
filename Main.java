package Story;
import Story.Posters.Afisha;
import Story.bus.Bus;
import Story.Trols.*;
import Story.Kids.*;

public class Main {

    public static void main(String[] args) {
        Hemyliha hemyliha = new Hemyliha("Hemyliha", 57, 110.0D);
        Guest snif = new Guest("Snif", 45, 130.0D);
        Guest snorc = new Guest("Snorc", 49, 150.0D);
        hemyliha.talk(false, "Welcome");
        hemyliha.foodForGuest(snif);
        hemyliha.foodForGuest(snorc);
        hemyliha.foodForGuest(snif);
        hemyliha.foodForGuest(snorc);
        snif.talk(false, "Thank you");
        hemyliha.talk(true, "They eat all food!!!");
        snorc.talk(true, "Yummi <3");
        Afisha afishas = new Afisha("Theatrical Afishas", 78);
        Afisha afisha = new Afisha("Lonely Afisha", 1);
        afishas.circled(1);
        afisha.stick(0);
        afisha.stick(1);
        afisha.stick(2);
        System.out.println("Meanwhile...");
        Bus bus = new Bus("Bus", "Volvo");
        Bus.Driver driver = new Bus.Driver();
        bus.go();
        driver.say();
        driver.right();
        driver.left();
        Kids kids = new Kids("Kids", 12, 24.0D);
        kids.climbup();
        kids.talk(true, "I want to be the first to hand over a afisha to Snysmumrik");
        kids.pick();
        afisha.torn(24);
        kids.talk(false, "-There is a letter for you!! , while");
    }
}
