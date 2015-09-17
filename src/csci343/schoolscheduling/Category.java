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
public class Category {
    protected static ArrayList<String> categories = new ArrayList();
    private String description; 
    public static int getID(String input) {
        if(categories.contains((Object)input)){
            return categories.indexOf((Object)input);
        } else{
            categories.add(input);
            return categories.size()-1;
                    
        }
    }
 
}
