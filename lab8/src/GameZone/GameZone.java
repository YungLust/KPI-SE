package GameZone;

import Buildings.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The GameZone class represents a 2D game zone where buildings can be placed and managed.
 * It is configured by the dimensions (width and height), owner, and the buildings placed within it.
 */
public class GameZone {
    int width;
    int height;
    String owner;

    /**
     * The list of buildings present in the game zone.
     */
    List<Buildings> buildings = new ArrayList<>();

    /**
     * A 2D array representing the display grid of the game zone.
     * Each cell can hold a character representing a building symbol or remain empty.
     */
    char[][] display;

    /**
     * constructs game zone object with specified parameters.
     * also it initializes display array
     * @param width is the width of game zone
     * @param height is the height of game zone
     * @param owner is the owner of game zone
     */
    public GameZone(int width, int height, String owner) {
        this.width = width;
        this.height = height;
        this.owner = owner;
        display = new char[height][width];
    }

    /**
     * Places a building in the game zone at the specified coordinates.
     * The method ensures the building fits within the zone and does not overlap other buildings.
     *
     * @param building The building to place.
     * @param x The x-coordinate of the building's top-left corner.
     * @param y The y-coordinate of the building's top-left corner.
     */
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

    /**
     * Removes a building from the game zone at the specified coordinates.
     *
     * @param building The building to remove.
     * @param x The x-coordinate of the building's top-left corner.
     * @param y The y-coordinate of the building's top-left corner.
     */
    public void removeBuilding(Buildings building, int x, int y) {
        if (buildings.contains(building)) {
            buildings.remove(building);
            x-=1;
            y-=1;
            int width = building.getWidth();
            int height = building.getHeight();

            for (int i = x; i < x+width; i++) {
                for (int j = y; j < y+height; j++) {
                    //System.out.printf("deleting shit at: [%d][%d]\n",i,j);
                    display[j][i] = '\0';
                }
            }
        } else {
            System.out.println("No such building in this village!");
        }
    }

    /**
     * Checks whether a building fits within the game zone's boundaries.
     *
     * @param x The x-coordinate of the building's top-left corner.
     * @param y The y-coordinate of the building's top-left corner.
     * @param width The width of the building.
     * @param height The height of the building.
     * @return {@code true} if the building fits within the zone, {@code false} otherwise.
     */
    private Boolean isInZone(int x, int y, int width, int height) {
        x-=1;
        y-=1;
        if ((x + width > this.width) || (y + height > this.height) || (x < 0) || (y < 0)){
            System.out.println("Can`t place building: area not in game zone");
            return false;
        }
        return true;
    }

    /**
     * Checks whether a building dont overlap other buildings.
     *
     * @param x The x-coordinate of the building's top-left corner.
     * @param y The y-coordinate of the building's top-left corner.
     * @param width The width of the building.
     * @param height The height of the building.
     * @return {@code true} if the building`s area is free, {@code false} otherwise.
     */
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

    /**
     * Displays the current state of the game zone as a grid.
     * Empty spaces are represented by middle dots ("·"), and buildings are represented by their symbols.
     */
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
