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
public class Student_Class_Status {
    protected static String status[] = {"status A", "status B", "status C", "status D", "status E", "status F", "status G", "status H", "status I", "status J"};

    
    public static int random() {
        Student_Class_Status temp = new Student_Class_Status();
        Random rand = new Random();
        return rand.nextInt(status.length);
    }
    
    
    
    
}
