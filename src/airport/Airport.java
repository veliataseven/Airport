package airport;

import java.util.List;

public class Airport {
    private String name;
    private List<Airplane> airplanes;

    public Airport(String name, List<Airplane> airplanes) {

        Airplane airplane1 = new Airplane("ABC111", 340, 343, false, 500, true);
        Airplane airplane2 = new Airplane("DDD222", 400, 230, false, 550, true);
        Airplane airplane3 = new Airplane("BBB666", 0, 0, true, 500, false);

        airplanes.add(airplane1);
        airplanes.add(airplane2);
        airplanes.add(airplane3);

        this.name = name;
        this.airplanes = airplanes;
    }

    public void printAllAirplanes() {
        System.out.println("Aircraft from airport " + name + ":");
        for (Airplane airplane : airplanes) {
            System.out.println("Airplane " + airplane.getPlaneIdentification());
        }
    }

    public void requestPlane() {
        for (Airplane airplane : airplanes) {
            if (!airplane.isFlying()) {
                System.out.println("Airplane " + airplane.getPlaneIdentification() + " requested. Is not flying, still room for " + airplane.getMaxNumberOfPassenger() + " passengers.");
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
}
