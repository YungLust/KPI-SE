package Main;

import Buildings.*;
import Database.*;
import GameZone.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GameZone gz = new GameZone(10, 10, "Metamorphosis#5133");

        Tower tower = new Tower(1, 1);
        Fence horizontalfence = new Fence(6, 1);
        Fence verticalFence = new Fence(1, 6);
        House house = new House(4, 4);
        gz.display();
        System.out.println("Placing House!");

        gz.build(house, 4, 4);
        gz.display();
        System.out.println("Placing towers!");

        gz.build(tower, 2, 2);
        gz.build(tower, 9, 2);
        gz.build(tower, 2, 9);
        gz.build(tower, 9, 9);
        gz.display();
        System.out.println("Placing Fences!");

        gz.build(horizontalfence, 3, 2);
        gz.build(horizontalfence, 3, 9);
        gz.build(verticalFence, 2, 3);
        gz.build(verticalFence, 9, 3);
        gz.display();
        System.out.println("All done!");

        ConfigRetriever cr = new ConfigRetriever("small");
        System.out.println(Arrays.toString(cr.getGameZoneConfig()));



    }
}
