public class Main {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket("32WESSDS", 3);
        Rocket rocket2 = new Rocket("LDSFJA32", 6);
        printResult(rocket1, rocket2);

    }

    private static void printResult(Rocket rocket1, Rocket rocket2) {
        System.out.println("El primer coet es: " + rocket1.getCode() + "i te " + rocket1.getPropeller() + " propulsors");
        System.out.println("El segon coet es: " + rocket2.getCode() + "i te " + rocket2.getPropeller() + " propulsors");
    }

}
