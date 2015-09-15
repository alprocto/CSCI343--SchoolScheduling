/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Last names from The Census Bureau
 * (http://www2.census.gov/topics/genealogy/1990surnames/dist.all.last) First
 * names from Social Security Administration
 * (http://www.ssa.gov/OACT/babynames/limits.html) City, State, and Zip Codes
 * from https://www.aggdata.com/node/86
 *
 * @author alprocto
 */
public class CSCI343SchoolScheduling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        setup();
        test1.main(args);
        test2.main(args);
        // TODO code application logic here
    }

    private static void setup() throws FileNotFoundException {
        Address.initialize(new File("streetNames.txt"), new File("us_postal_codes.csv"));
        Surname.initialize(new File("lastNames.txt"), 500);             //limit to first 500 names

    }
}
