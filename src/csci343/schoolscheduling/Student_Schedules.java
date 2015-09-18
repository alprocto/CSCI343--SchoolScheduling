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
    protected double grade;
    
    public static Student_Schedules random(){
        Student_Schedules temp = new Student_Schedules();
        Random rand = new Random();
        temp.studentID = rand.nextInt(Student.students.size());
        temp.classID = rand.nextInt(Class.classes.size());
        temp.classStatus = Student_Class_Status.random();
        temp.grade = (double)rand.nextInt(4)+1.0;
        
        for (int i =0; i<schedules.size(); i++){
            if (schedules.get(i).studentID==temp.studentID && schedules.get(i).classID==temp.classID && schedules.get(i).classStatus==temp.classStatus){
                return random();
            }
        }
        
        schedules.add(temp);
                
        return temp;
    }
    
    public static double getGPA(int student){
        int numOfCredits=0; 
        double gpaPoints=0.0;
        for(int x=0; x<schedules.size(); x++){
            if(schedules.get(x).studentID==student){
                numOfCredits+=Class.classes.get(schedules.get(x).classID).credits;
                gpaPoints+=schedules.get(x).grade*Class.classes.get(schedules.get(x).classID).credits;
            }
        }
        if(numOfCredits == 0){
            return 0.0;
        }
        else{
            return gpaPoints/(double)numOfCredits;
        }
    }
    
    public static void generate(int number) {
        for (int i = 0; i < number; i++) {
            random();
        }

    }
}
