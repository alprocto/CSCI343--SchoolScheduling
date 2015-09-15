/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.io.*;

/**
 *
 * @author alprocto
 */
public class test1 {
    public static void main(String[] args) throws FileNotFoundException{
        FirstName.initialize(new File("names\\yob1990.txt"), 100);
//        for (int i = 0; i < 20; i++) {
//            System.out.println(FirstName.n);
//            System.out.println(Address.random().toString());
//            System.out.println();
//        }
        for (int i = 0; i < 20; i++) {
            Person temp = new Person();
            System.out.println(temp.toString());
        }
    }
}
