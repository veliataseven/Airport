package airport;

abstract class Airplane {

    public String planeIdentification;
    public boolean isFlying;
    public double cruiseSpeed;

    public Airplane() {

    }

    public Airplane(String planeIdentification, boolean isFlying, double cruiseSpeed) {
        this.planeIdentification = planeIdentification;
        this.isFlying = isFlying;
        this.cruiseSpeed = cruiseSpeed;
    }

    public abstract void load(int load);

    public abstract void unload();

    public abstract void requestStatusOfPlane();

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

    @Override
    public String toString() {
        return "Airplane{" +
                "planeIdentification='" + planeIdentification + '\'' +
                ", isFlying=" + isFlying +
                ", cruiseSpeed=" + cruiseSpeed +
                '}';
    }
}
