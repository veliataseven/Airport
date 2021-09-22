package airport;

public class Application {
    public static void main(String[] args) {
        System.out.println("Test");

        Airplane airplane1 = new Airplane("ABC123", 50, 43, false, 500);
        Airplane airplane2 = new Airplane("DDD888", 50, 23, false, 550);

        airplane1.loadPassengers();
        airplane1.takeOffPlane();
        airplane1.landPlane();
        airplane1.unloadPassengers();

        System.out.println();

        airplane2.loadPassengers();
        airplane2.takeOffPlane();
        airplane2.landPlane();
        airplane2.unloadPassengers();
    }
}
