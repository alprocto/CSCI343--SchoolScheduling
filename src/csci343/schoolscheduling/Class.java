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
public class Class {

    protected static ArrayList<Class> classes = new ArrayList();
    private static ArrayList<String> buildingCodes = new ArrayList();

    private int classID;
    private int credits;
    private int month;
    private int day;
    private int year;
    private int hour;
    private int minute;
    private Boolean mondaySchedule;
    
    

    public static Class random() {
        Class temp = new Class();
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
            return temp;

        }
    }

    @Override
    public String toString() {
        return buildingCode.toString() + ", " + buildingName + ", " + numberOfFloors + ", " + elavatorAccess + ", " + siteParkingAvailable;
    }
}
