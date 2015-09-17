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
public class Student_Schedules {
    protected static ArrayList<Student_Schedules> schedules = new ArrayList<>();
    protected int studentID;
    protected int classID;
    protected int classStatus;
    protected float grade;
    
    public static Student_Schedules random(){
        Student_Schedules temp = new Student_Schedules();
        Random rand = new Random();
        temp.studentID = rand.nextInt(Student.students.size());
        temp.classID = rand.nextInt(Class.classes.size());
        temp.classStatus = Student_Class_Status.random();
        temp.grade = (float)rand.nextInt(5);
        
        
        schedules.add(temp);
                
        return temp;
    }
    
    
    
    
}
