package orr;

import java.util.List;

public class Commuter {
    List<SmartCard> smartCards;
    Vehicle vehicle;
    String name;
    Commuter(String name, Vehicle vehicle, List<SmartCard> smartCards) {
        this.name = name;
        this.vehicle = vehicle;
        this.smartCards = smartCards;
    }
}
