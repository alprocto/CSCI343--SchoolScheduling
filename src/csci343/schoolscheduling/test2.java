/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.io.File;

/**
 *
 * @author alprocto
 */
public class test2 {

    public static void main(String[] args) {
        for(int x=0; x<10; x++){
        System.out.println(Building.random().toString());
        }
//        Sections.initialize(new File("coursescsv.csv"), new File("sections.csv"));
    }
        

}
