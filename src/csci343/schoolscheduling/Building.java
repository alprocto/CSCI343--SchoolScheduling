/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.io.*;
import java.util.*;

/**
 *
 * @author alprocto
 */
public class Building {

    protected static ArrayList<Building> buildings = new ArrayList();
    private static ArrayList<String> buildingCodes = new ArrayList();
    protected static ArrayList<ClassRoom> classRooms = new ArrayList();

    private String buildingName;
    private Integer numberOfFloors;
    private String buildingCode;
    private Boolean elavatorAccess;
    private Boolean siteParkingAvailable;

    public static Building random() {
        Building temp = new Building();
        Random rand = new Random();
        temp.buildingName = Surname.random();
        temp.buildingCode = temp.buildingName.substring(0, 3).toUpperCase();
        temp.numberOfFloors = rand.nextInt(4) + 2;                    //3 to 5 floors
        temp.elavatorAccess = rand.nextBoolean();
        temp.siteParkingAvailable = rand.nextBoolean();
        if (buildingCodes.contains(temp.buildingCode)) {
            return random();
        } else {
            buildingCodes.add(temp.buildingCode);
            buildings.add(temp);
            for (int x = 1; x <= temp.numberOfFloors; x++) {
                int numOfRooms = rand.nextInt(10) + 10;
                for (int i = 1; i <= numOfRooms; i++) {
                    ClassRoom room = new ClassRoom(temp.buildingCode, rand.nextBoolean(), x * 100 + i);
                    classRooms.add(room);
                }
            }

            return temp;

        }
    }

    @Override
    public String toString() {
        return buildingCode.toString() + ", " + buildingName + ", " + numberOfFloors + ", " + elavatorAccess + ", " + siteParkingAvailable;
    }

    public static void generateBuildings(int number) {
        for (int i = 0; i < number; i++) {
            random();
        }

    }
}
