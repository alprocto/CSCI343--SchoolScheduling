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
public class Faculty_Subjects {
    protected static ArrayList<Faculty_Subjects> subjects= new ArrayList<>();
    protected int staffID;
    protected int subjectID;
    protected double proficiencyRating;
    
    public static Faculty_Subjects random(){
        Faculty_Subjects temp = new Faculty_Subjects();
        Random rand = new Random();
        temp.staffID = Faculty.list.get(rand.nextInt(Faculty.list.size())).staffID;
        temp.subjectID = rand.nextInt(Subject.subjects.size());
        temp.proficiencyRating = (double)rand.nextInt(6);
        
        
        subjects.add(temp);
                
        return temp;
    }
    
    
}
