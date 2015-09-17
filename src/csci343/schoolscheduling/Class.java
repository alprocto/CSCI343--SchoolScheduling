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

    protected int credits;
    protected int month;
    protected int day;
    protected int year;
    protected int hour;
    protected int minute;
    protected int length;
    protected Boolean mondaySchedule;
    protected Boolean tuesdaySchedule;
    protected Boolean wednesdaySchedule;
    protected Boolean thursdaySchedule;
    protected Boolean fridaySchedule;
    protected Boolean saturdaySchedule;
    protected int classRoomID;
    protected int sujectID;

    public static Class random() {
        Class temp = new Class();
        Random rand = new Random();
        temp.sujectID = rand.nextInt(Subject.subjects.size());
        temp.credits = rand.nextInt(4) + 1;                    //1 to 4 credits
        temp.mondaySchedule = rand.nextBoolean();
        temp.tuesdaySchedule = rand.nextBoolean();
        temp.wednesdaySchedule = rand.nextBoolean();
        temp.thursdaySchedule = rand.nextBoolean();
        temp.fridaySchedule = rand.nextBoolean();
        temp.saturdaySchedule = rand.nextBoolean();
        temp.length = rand.nextInt(10) * 15 + 45;
        temp.month = rand.nextInt(12) + 1;
        temp.day = rand.nextInt(28) + 1;
        temp.hour = rand.nextInt(12) + 8;
        temp.minute = rand.nextInt(4) * 15;
        temp.year = rand.nextInt(5) + 2012;
        temp.classRoomID = rand.nextInt(Building.classRooms.size());
        classes.add(temp);

        return temp;
    }

    public String toString() {
        return month + ", " + day + ", " + year + ", " + hour + ", " + minute + ", " + length + ", " + mondaySchedule + ", " + tuesdaySchedule + ", " + wednesdaySchedule + ", " + thursdaySchedule + ", " + fridaySchedule + ", " + saturdaySchedule;
    }

    public static void generateClasses(int number) {
        for (int i = 0; i < number; i++) {
            random();
        }
    }

}
