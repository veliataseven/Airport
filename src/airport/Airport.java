package airport;

import java.util.List;

public class Airport {
    private String name;
    private List<CargoPlane> cargoPlanes;
    private List<PeoplePlane> peoplePlanes;

    public Airport() {

    }

    public Airport(String name, List<CargoPlane> cargoPlanes, List<PeoplePlane> peoplePlanes) {

        PeoplePlane peoplePlane1 = new PeoplePlane("BBB666", false, 500, 350, 300);
        PeoplePlane peoplePlane2 = new PeoplePlane("BBB777", true, 500, 400, 360);

        CargoPlane cargoPlane1 = new CargoPlane("ABC111", false, 500, 10);
        CargoPlane cargoPlane2 = new CargoPlane("ABC222", true, 500, 15);

        cargoPlanes.add(cargoPlane1);
        cargoPlanes.add(cargoPlane2);

        peoplePlanes.add(peoplePlane1);
        peoplePlanes.add(peoplePlane2);

        this.name = name;
        this.cargoPlanes = cargoPlanes;
        this.peoplePlanes = peoplePlanes;
    }

    public void requestListOfPassengerPlanes() {
        System.out.println("Passenger planes from airport " + name + ":");
        for (PeoplePlane peoplePlane : peoplePlanes) {
            System.out.println("Passenger plane " + peoplePlane.getPlaneIdentification());
        }
    }

    public void requestListOfCargoPlanes() {
        System.out.println("Cargo planes from airport " + name + ":");
        for (CargoPlane cargoPlane : cargoPlanes) {
            System.out.println("Cargo plane " + cargoPlane.getPlaneIdentification());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CargoPlane> getCargoPlanes() {
        return cargoPlanes;
    }

    public void setCargoPlanes(List<CargoPlane> cargoPlanes) {
        this.cargoPlanes = cargoPlanes;
    }

    public List<PeoplePlane> getPeoplePlanes() {
        return peoplePlanes;
    }

    public void setPeoplePlanes(List<PeoplePlane> peoplePlanes) {
        this.peoplePlanes = peoplePlanes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", cargoPlanes=" + cargoPlanes +
                ", peoplePlanes=" + peoplePlanes +
                '}';
    }
}
