package org.example;

public class Race {
    private String leaderName = "";
    private int leaderDistance = 0;

    public void checkLeader(Car car) {
        int distance = 24 * car.getSpeed();
        if (distance > leaderDistance) {
            leaderDistance = distance;
            leaderName = car.getName();
        }
    }

    public String getLeaderName() {
        return leaderName;
    }
}
