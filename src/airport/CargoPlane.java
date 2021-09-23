package airport;

final class CargoPlane extends Airplane {
    private int capacity = 20;
    private double weight;

    public CargoPlane() {

    }

    public CargoPlane(String planeIdentification, boolean isFlying, double cruiseSpeed, double weight) {
        super(planeIdentification, isFlying, cruiseSpeed);
        this.weight = weight;
    }

    @Override
    public void load(int weight) {
        if (isFlying) {
            System.out.println("CargoPlane " + planeIdentification + " can not load, because we are already flying");
        } else if (weight > capacity) {
            System.out.println("Cargo Plane " + planeIdentification + " loads " + capacity + " tons of cargo, " + (weight - capacity) + " tons does not fit.");
        } else {
            System.out.println("CargoPlane " + planeIdentification + " is loading with " + weight + " tons.");
            setWeight(weight);
        }
    }

    @Override
    public void unload() {
        if (isFlying) {
            System.out.println("CargoPlane " + planeIdentification + " can not unload, because we are already flying");
        } else {
            System.out.println("CargoPlane " + planeIdentification + " unloads.");
        }
    }

    @Override
    public void requestStatusOfPlane() {
        if (!isFlying) {
            System.out.println("Cargo Plane " + planeIdentification + " requested. Is not flying, still room for " + weight + " tons of freight.");
        } else {
            System.out.println("Cargo Plane " + planeIdentification + " is flying.");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "planeIdentification='" + planeIdentification + '\'' +
                ", isFlying=" + isFlying +
                ", cruiseSpeed=" + cruiseSpeed +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }
}
