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
public class Department {

    private static String name[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    private static int count = 0;
    protected static int chairID[] = new int[name.length];

    public static void initialize() {
        for (int i = 0; i < chairID.length; i++) {
            chairID[i] = Faculty.list.get(i).staffID;
        }
    }
    
    public static int nextDepartment(){
        count++;
        if(count>=name.length){
            count=0;
        }
        return count;
    }

}
