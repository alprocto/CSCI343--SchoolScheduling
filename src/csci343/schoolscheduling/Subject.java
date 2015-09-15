/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.util.*;

/**
 *
 * @author alprocto
 */
public class Subject {
    protected String category;
    protected String subjectName;
    protected String description;
    
    /**
     *
     * @param category
     * @param subjectName
     * @param description
     */
    public Subject(String category, String subjectName, String description){
        this.category=category;
        this.subjectName=subjectName;
        this.description=description;
    }
    
    @Override
    public String toString(){
        return category + "\t" + subjectName + "\t" + description;
    }
           
//           generateAddress
    
    public int getID(){
        
    }
    
}
