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
    private static ArrayList<String> buildingName;
    private static ArrayList<Integer> numberOfFloors;
    private static ArrayList<Integer> buildingCode;
    private static ArrayList<Boolean> elavatorAccess;
    private static ArrayList<Boolean> siteParkingAvailable;
    
    public static String random(){
        Building building = new Building();
        Random rand = new Random();
        building.code = numberOfFloors.get(rand.nextInt(numberOfFloors.size()));
        building.code = buildingCode.get(rand.nextInt(buildingCode.size()));
        building.number = rand.nextInt(9900) + 100;
        return building;
    }
    
    @Override
    public String toString(){
        return buildingName + ", " + numberOfFloors + ", " + elavatorAccess + ", " + siteParkingAvailable + buildingCode.toString();
    }
}
