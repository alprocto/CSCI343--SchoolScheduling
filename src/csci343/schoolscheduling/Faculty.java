/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csci343.schoolscheduling;

import java.util.*;
import java.io.*;

/**
 *
 * @author Amanda
 */
public class Faculty {
    protected static ArrayList<Faculty> list = new ArrayList();
    protected int staffID;
    private String title;
    private String status;
    private Boolean tenured;
    protected static String positions[]={"Professor", "Associate Profesor", "Assistant Professor", "Lecturer", "Adjuct Professor"};
    protected static String statuses[]={"Retired", "Full Time", "Part Time", "Visiting"};
    //public Faculty (int staffID);
    
    public static Faculty random(int id){
        Faculty temp = new Faculty();
        Random rand = new Random();
        temp.tenured= rand.nextBoolean();
        temp.title= positions[rand.nextInt(positions.length)];
        temp.status= statuses[rand.nextInt(statuses.length)];
        temp.staffID=id;
        list.add(temp);
        return temp;
        
    }
    
public String toString(){
    return title + ", " + status + ", " + tenured;
}
}
