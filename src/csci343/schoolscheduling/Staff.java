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
 * @author Amanda
 */
public class Staff {
    
   private static String positions[]={"Faculty", "Staff"};
   
    private int salary;
    private int month;
    private int day;
    private int year;
    private String position;
    
    
    
   public static Staff random(){
       Staff temp = new Staff();
        Random rand = new Random();
        temp.salary = rand.nextInt(71)*1000+30000;
        temp.month = rand.nextInt(12)+1;
        temp.day = rand.nextInt(28)+1;
        temp.year = rand.nextInt(5)+2012;
        int i=rand.nextInt(2);
        temp.position= positions[i];
        
        return temp;
    }
    public String toString(){
        return salary + ", " + month + ", " + day + ", " + year;
    }
    
}
