package airport;

public class Airplane {

    private String planeIdentification;
    private int maxNumberOfPassenger;
    private int currentNumberOfPassenger;
    private boolean isFlying;
    private double cruiseSpeed;
    private boolean hasRoom;

    public Airplane(String planeIdentification, int maxNumberOfPassenger, int currentNumberOfPassenger, boolean isFlying, double cruiseSpeed, boolean hasRoom) {
        this.planeIdentification = planeIdentification;
        this.maxNumberOfPassenger = maxNumberOfPassenger;
        this.currentNumberOfPassenger = currentNumberOfPassenger;
        this.isFlying = isFlying;
        this.cruiseSpeed = cruiseSpeed;
        this.hasRoom = hasRoom;
    }

    public void loadPassengers(int numberOfPassenger) {
        if (isFlying) {
            System.out.println("Airplane " + planeIdentification + " can not load, because we are already flying");
        } else if (numberOfPassenger > maxNumberOfPassenger) {
            System.out.println("Airplane " + planeIdentification + " loads " + maxNumberOfPassenger + " passengers, " + (numberOfPassenger - maxNumberOfPassenger) + " does not fit.");
        } else {
            System.out.println("Airplane " + planeIdentification + " loads " + numberOfPassenger + " passengers.");
        }
    }

    public void unloadPassengers() {
        if (isFlying) {
            System.out.println("Airplane " + planeIdentification + " can not unload, because we are already flying");
        } else {
            System.out.println("Airplane " + planeIdentification + " unloads " + currentNumberOfPassenger + " passengers.");
            currentNumberOfPassenger = 0;
        }
    }

    public void takeOffPlane() {
        if (isFlying) {
            System.out.println("Airplane " + planeIdentification + " can not take off, because we are already flying.");
        } else {
            System.out.println("Airplane " + planeIdentification + " takes off.");
            isFlying = true;
        }
    }

    public void landPlane() {
        if (isFlying) {
            System.out.println("Airplane " + planeIdentification + " lands.");
            isFlying = false;
        } else {
            System.out.println("Airplane " + planeIdentification + " can not land, because we are still on the ground.");
        }
    }

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public void setPlaneIdentification(String planeIdentification) {
        this.planeIdentification = planeIdentification;
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

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(double cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public boolean isHasRoom() {
        return hasRoom;
    }

    public void setHasRoom(boolean hasRoom) {
        this.hasRoom = hasRoom;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "planeIdentification='" + planeIdentification + '\'' +
                ", maxNumberOfPassenger=" + maxNumberOfPassenger +
                ", currentNumberOfPassenger=" + currentNumberOfPassenger +
                ", isFlying=" + isFlying +
                ", cruiseSpeed=" + cruiseSpeed +
                ", hasRoom=" + hasRoom +
                '}';
    }
}
