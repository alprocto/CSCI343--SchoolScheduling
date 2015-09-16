/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.util.ArrayList;

/**
 *
 * @author alprocto
 */
public class Student{
    protected static ArrayList<Student> students = new ArrayList<>();
    private Person person;
    
public static void generateStudents(int number){
    for (int i = 0; i<number; i++){
        Student temp = new Student();
        temp.person=new Person();
        students.add(temp);
    }
}    
    
}
