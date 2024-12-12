package Enum;

public enum TrafficLight {
    RED("Stop"),
    YELLOW("Ready"),
    GREEN("Go");

    final String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
