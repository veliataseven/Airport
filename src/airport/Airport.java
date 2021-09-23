package airport;

import java.util.List;

public class Airport {
    private String name;
    private List<Airplane> airplanes;

    public Airport() {

    }

    public Airport(String name, List<Airplane> airplanes) {

        Airplane peoplePlane1 = new PeoplePlane("BBB666", false, 500, 350, 300);
        Airplane peoplePlane2 = new PeoplePlane("BBB777", true, 500, 400, 360);

        Airplane cargoPlane1 = new CargoPlane("ABC111", false, 500, 10);
        Airplane cargoPlane2 = new CargoPlane("ABC222", true, 500, 15);

        airplanes.add(cargoPlane1);
        airplanes.add(cargoPlane2);

        airplanes.add(peoplePlane1);
        airplanes.add(peoplePlane2);

        this.name = name;
        this.airplanes = airplanes;
    }

    public void requestListOfAirplanes() {
        System.out.println();
        System.out.println("Airplanes from airport " + name + ":");
        System.out.println();
        for (Airplane airplane : airplanes) {
            if (airplane instanceof PeoplePlane) {
                airplane = (PeoplePlane) airplane;
                System.out.println("Passenger plane " + airplane.getPlaneIdentification());
                airplane.load(680);
                airplane.requestStatusOfPlane();
                System.out.println();
            } else if (airplane instanceof CargoPlane){
                airplane = (CargoPlane) airplane;
                System.out.println("Cargo plane " + airplane.getPlaneIdentification());
                airplane.load(23);
                airplane.requestStatusOfPlane();
                System.out.println();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", airplanes=" + airplanes +
                '}';
    }
}
