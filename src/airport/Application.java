package airport;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Airport airport = new Airport("Eindhoven", new ArrayList<>());

        airport.requestListOfAirplanes();
    }
}
