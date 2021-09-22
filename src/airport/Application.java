package airport;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Airport airport = new Airport("Schipol", new ArrayList<>());
        airport.printAllAirplanes();

        airport.requestPlane();
        airport.getAirplanes().get(1).loadPassengers(700);
    }
}
