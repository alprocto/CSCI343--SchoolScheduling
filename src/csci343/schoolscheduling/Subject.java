/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author alprocto
 */
public class Subject {
    protected static ArrayList<Subject> subjects = new ArrayList();
   
    protected int categoryID;
    protected String subjectCode;
    protected String subjectName;
    protected String subjectPreReq;
    protected String subjectDescription;
    
    /**
     *
     * @param category
     * @param subjectName
     * @param description
     */
    public static void initialize(File subjectFile) throws FileNotFoundException{
        Scanner scanner = new Scanner(subjectFile);
        scanner.nextLine();         //get rid of first line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String parts[] = line.split(",");
            if (parts.length >= 3) {
                Subject temp = new Subject(parts[0], parts[1], parts[2], parts[3], parts[4]);
//                System.out.println(temp.toString());
                subjects.add(temp);
            } else{
//                System.out.println(line);
            }

        }
    }
    public Subject(String category, String subjectName, String description, String preReq, String code){
        this.categoryID=Category.getID(category);
        this.subjectName=subjectName;
        this.subjectDescription=description;
        this.subjectCode = code;
        this.subjectPreReq=preReq;
        
    }
    
    @Override
    public String toString(){
        return "-1";
    }
           
//           generateAddress
    
    public int getID(){
        return 1;
    }
    
}