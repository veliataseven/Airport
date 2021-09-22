package airport;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Airport airport = new Airport("Eindhoven", new ArrayList<>(),  new ArrayList<>());

        System.out.println();
        airport.requestListOfPassengerPlanes();
        System.out.println();

        airport.requestListOfCargoPlanes();
        System.out.println();

        airport.getPeoplePlanes().get(0).requestStatusOfPlane();
        airport.getPeoplePlanes().get(0).load(400);
        System.out.println();

        airport.getCargoPlanes().get(0).requestStatusOfPlane();
        airport.getCargoPlanes().get(0).load(25);
        System.out.println();
    }
}
