package GameZone;

import Buildings.*;

import java.util.ArrayList;
import java.util.List;

public class GameZone {
    int width;
    int height;
    String owner;
    List<Buildings> buildings = new ArrayList<>();
    char[][] display;

    public GameZone(int width, int height, String owner) {
        this.width = width;
        this.height = height;
        this.owner = owner;
        display = new char[height][width];
    }

    public void build(Buildings building, int x, int y) {
        int width = building.getWidth();
        int height = building.getHeight();
        char symbol = building.getSymbol();
        x-=1;
        y-=1;
        if (isInZone(x, y, width, height) && isAreaFree(x, y, width, height)) {
            for (int i = x; i < x+width; i++) {
                for (int j = y; j < y+height; j++) {
                    display[j][i] = symbol;
                }
            }
        }
        buildings.add(building);
    }

    public void removeBuilding(Buildings building, int x, int y) {
        if (buildings.contains(building)) {
            buildings.remove(building);

            int width = building.getWidth();
            int height = building.getHeight();

            for (int i = x; i < width; i++) {
                for (int j = y; j < height; j++) {
                    display[j][i] = '\0';
                }
            }
        } else {
            System.out.println("No such building in this village!");
        }
    }

    private Boolean isInZone(int x, int y, int width, int height) {
        x-=1;
        y-=1;
        if ((x + width > this.width) || (y + height > this.height) || (x < 0) || (y < 0)){
            System.out.println("Can`t place building: area not in game zone");
            return false;
        }
        return true;
    }

    private Boolean isAreaFree(int x, int y, int width, int height) {
        for (int i = x; i < x + width; i++) {
            for (int j = y; j < y + height; j++) {
                if (display[j][i] != '\0') {
                    System.out.println("Can`t place building: area is occupied.");
                    return false;
                }
            }
        }
        return true;
    }

    public void display() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (display[i][j] == '\0') {
                    System.out.print(" · ");
                } else {
                    System.out.print(" "+display[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}
