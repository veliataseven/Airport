package airport;

public class Airplane {

    private String planeIdentification;
    private int maxNumberOfPassenger;
    private int currentNumberOfPassenger;
    private boolean isFlying;
    private double cruiseSpeed;

    public Airplane(String planeIdentification, int maxNumberOfPassenger, int currentNumberOfPassenger, boolean isFlying, double cruiseSpeed) {
        this.planeIdentification = planeIdentification;
        this.maxNumberOfPassenger = maxNumberOfPassenger;
        this.currentNumberOfPassenger = currentNumberOfPassenger;
        this.isFlying = isFlying;
        this.cruiseSpeed = cruiseSpeed;
    }

    public void loadPassengers(){
        System.out.println("Airplane " + planeIdentification + " loads " + currentNumberOfPassenger + " passengers.");
    }

    public void unloadPassengers() {
        System.out.println("Airplane " + planeIdentification + " unloads " + currentNumberOfPassenger + " passengers.");
    }

    public void takeOffPlane() {
        System.out.println("Airplane " + planeIdentification + " takes off.");
    }

    public void landPlane() {
        System.out.println("Plane " + planeIdentification + " lands.");
    }
}
