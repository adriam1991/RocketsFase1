public class Main {

    public static void main(String[] args) throws Exception {

        Rocket rocket1 = new Rocket("32WESSDS", 3);
        Rocket rocket2 = new Rocket("LDSFJA32", 6);
        printResult(rocket1);
        printResult(rocket2);
    }

    private static void printResult(Rocket rocket) {
        System.out.println("El coet : " + rocket.getCode() + " te " + rocket.getPropeller() + " propulsors");
    }
}
