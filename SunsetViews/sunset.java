package SunsetViews;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sunset {
    public ArrayList<Integer> sunsetLooking(int buildings[], String direction) {
        ArrayList<Integer> build = new ArrayList<>();
        int maxbuilding = 0;
        if (direction.equals("EAST")) {
            for (int i = buildings.length - 1; i >= 0; i--) {
                if (buildings[i] > maxbuilding) {
                    build.add(i);
                    maxbuilding = buildings[i];
                }
            }
            Collections.reverse(build);
        } else {
            for (int i = 0; i < buildings.length; i++) {
                if (buildings[i] > maxbuilding) {
                    build.add(i);
                    maxbuilding = buildings[i];
                }
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int buildings[] = { 3, 5, 4, 4, 3, 1, 3, 2 };
        String direction = "EAST";
        System.out.println(sunsetLooking);
    }
}
