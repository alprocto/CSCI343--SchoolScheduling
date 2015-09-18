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
public class Faculty_Categories {
    protected static ArrayList<Faculty_Categories> categories= new ArrayList<>();
    protected int staffID;
    protected int categoryID;
    
    public static Faculty_Categories random(){
        Faculty_Categories temp = new Faculty_Categories();
        Random rand = new Random();
        temp.staffID = Faculty.list.get(rand.nextInt(Faculty.list.size())).staffID;
        temp.categoryID = rand.nextInt(Category.categories.size());
        
        for (int i =0; i<categories.size(); i++){
            if (categories.get(i).categoryID==temp.categoryID && categories.get(i).staffID==temp.staffID){
                return random();
            }
        }
        
        categories.add(temp);
                
        return temp;
        
    }
    
    public static void generate(int number) {
        for (int i = 0; i < number; i++) {
            random();
        }

    }
    
    
}
