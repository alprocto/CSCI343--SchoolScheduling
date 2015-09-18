/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author alprocto
 */
public class Student{
    protected static ArrayList<Student> students = new ArrayList<>();
    protected Person person;
    protected int majorID;
    
public static void generateStudents(int number){
          Random rand = new Random();
  
    for (int i = 0; i<number; i++){
        Student temp = new Student();
        temp.person=new Person();
        
        temp.majorID=rand.nextInt(Category.categories.size());
        //for major use Category.categories.get(majorID).getDescription();
        students.add(temp);
    }
}    

public double getGPA(){
    return Student_Schedules.getGPA(students.indexOf(this));
}
    
}
