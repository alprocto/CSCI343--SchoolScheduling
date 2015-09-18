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
public class Faculty_Classes {
    protected static ArrayList<Faculty_Classes> classes= new ArrayList<>();
    protected int staffID;
    protected int classID;
    
    public static Faculty_Classes random(){
        Faculty_Classes temp = new Faculty_Classes();
        Random rand = new Random();
        temp.staffID = Faculty.list.get(rand.nextInt(Faculty.list.size())).staffID;
        temp.classID = rand.nextInt(Class.classes.size());
        
        for (int i =0; i<classes.size(); i++){
            if (classes.get(i).staffID==temp.staffID && classes.get(i).classID==temp.classID){
                return random();
            }
        }
        
        classes.add(temp);
                
        return temp;
    }
    
    public static void generate(int number) {
        for (int i = 0; i < number; i++) {
            random();
        }

    }
    
    
}
