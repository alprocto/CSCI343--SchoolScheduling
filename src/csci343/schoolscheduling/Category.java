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

    protected static ArrayList<Category> categories = new ArrayList();
    private String description;
    private int departmentID;

    public static int getID(String input) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).description.equals(input)) {
                return i;
            }
        }

        Category temp = new Category();
        temp.departmentID = Department.nextDepartment();
        temp.description = input;
        categories.add(temp);
        return categories.size() - 1;
    }
    
    public int getDepartmentID(){
        return departmentID;
    }
    
    public String getDescription(){
        return description;
    }

}
