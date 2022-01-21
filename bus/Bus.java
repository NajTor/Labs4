package Story.bus;

public class Bus {

    public Bus(String name, String model) {
        System.out.println("Created Bus" + name + model);
    }

    public void go() {
        System.out.println("Bus start moving");
    }

    public static class Driver {

        public void say() {
            System.out.println("I am dirver");
        }

        public void right() {
            System.out.println("Driver Turn right");
        }

        public void left() {
            System.out.println("Driver Turn left");
        }

    }

}