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

    private int credits;
    private int month;
    private int day;
    private int year;
    private int hour;
    private int minute;
    private int length;
    private Boolean mondaySchedule;
    private Boolean tuesdaySchedule;
    private Boolean wednesdaySchedule;
    private Boolean thursdaySchedule;
    private Boolean fridaySchedule;
    private Boolean saturdaySchedule;

    public static Class random() {
        Class temp = new Class();
        Random rand = new Random();
        temp.credits = rand.nextInt(4) + 1;                    //1 to 4 credits
        temp.mondaySchedule = rand.nextBoolean();
        temp.tuesdaySchedule = rand.nextBoolean();
        temp.wednesdaySchedule = rand.nextBoolean();
        temp.thursdaySchedule = rand.nextBoolean();
        temp.fridaySchedule = rand.nextBoolean();
        temp.saturdaySchedule = rand.nextBoolean();
        temp.length = rand.nextInt(10) * 15 + 45;
        

        return temp;
    }

    public String toString() {
        return month + ", " + day + ", " + year + ", " + hour + ", " + minute + ", " + length + ", " + mondaySchedule + ", " + tuesdaySchedule + ", " + wednesdaySchedule + ", " + thursdaySchedule + ", " + fridaySchedule + ", " + saturdaySchedule;
    }
}
