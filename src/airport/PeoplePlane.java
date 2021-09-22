package airport;

public class PeoplePlane extends Airplane {
    private int maxNumberOfPassenger;
    private int currentNumberOfPassenger;

    public PeoplePlane() {

    }

    public PeoplePlane(String planeIdentification, boolean isFlying, double cruiseSpeed, int maxNumberOfPassenger, int currentNumberOfPassenger) {
        super(planeIdentification, isFlying, cruiseSpeed);
        this.maxNumberOfPassenger = maxNumberOfPassenger;
        this.currentNumberOfPassenger = currentNumberOfPassenger;
    }

    @Override
    public void load(int numberOfPassenger) {
        if (isFlying) {
            System.out.println("Airplane " + planeIdentification + " can not load, because we are already flying");
        } else if (numberOfPassenger > maxNumberOfPassenger) {
            System.out.println("Passenger Plane " + planeIdentification + " charges " + maxNumberOfPassenger + " passengers, " + (numberOfPassenger - maxNumberOfPassenger) + " does not fit.");
        } else {
            System.out.println("Airplane " + planeIdentification + " loads " + numberOfPassenger + " passengers.");
        }
    }

    @Override
    public void unload() {
        if (isFlying) {
            System.out.println("Airplane " + planeIdentification + " can not unload, because we are already flying");
        } else {
            System.out.println("Airplane " + planeIdentification + " unloads " + currentNumberOfPassenger + " passengers.");
            currentNumberOfPassenger = 0;
        }
    }

    @Override
    public void requestStatusOfPlane() {
        if (!isFlying) {
            System.out.println("Passenger Plane " + planeIdentification + " requested. Is not flying, still room for " + maxNumberOfPassenger + " passengers.");
        } else {
            System.out.println("Passenger Plane " + planeIdentification + " is flying.");
        }
    }

    public int getMaxNumberOfPassenger() {
        return maxNumberOfPassenger;
    }

    public void setMaxNumberOfPassenger(int maxNumberOfPassenger) {
        this.maxNumberOfPassenger = maxNumberOfPassenger;
    }

    public int getCurrentNumberOfPassenger() {
        return currentNumberOfPassenger;
    }

    public void setCurrentNumberOfPassenger(int currentNumberOfPassenger) {
        this.currentNumberOfPassenger = currentNumberOfPassenger;
    }

    @Override
    public String toString() {
        return "PeoplePlane{" +
                "planeIdentification='" + planeIdentification + '\'' +
                ", isFlying=" + isFlying +
                ", cruiseSpeed=" + cruiseSpeed +
                ", maxNumberOfPassenger=" + maxNumberOfPassenger +
                ", currentNumberOfPassenger=" + currentNumberOfPassenger +
                '}';
    }
}
