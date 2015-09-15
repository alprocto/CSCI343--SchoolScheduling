/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.io.*;
import java.util.*;

/**
 *
 * @author alprocto
 */
public class Surname {
    private static ArrayList<String> names;
    
    
    public static void initialize(File lastNameFile) throws FileNotFoundException{
        names = new ArrayList();
        Scanner scanner = new Scanner(lastNameFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.split(" ")[0];
            line = line.substring(0, 1) + line.substring(1).toLowerCase();
            names.add(line);
        }
    }
    
    public static void initialize(File lastNameFile, int limit) throws FileNotFoundException{
        names = new ArrayList();
        Scanner scanner = new Scanner(lastNameFile);
        int i =0;
        while (scanner.hasNextLine() && i < limit) {
            String line = scanner.nextLine();
            line = line.split(" ")[0];
            line = line.substring(0, 1) + line.substring(1).toLowerCase();
            names.add(line);
            i++;
        }
    }
    
    public static String random(){
        Random rand = new Random();     
        return names.get(rand.nextInt(names.size()));
    }
}
