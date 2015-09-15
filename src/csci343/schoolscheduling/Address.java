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
public class Address {

    private static ArrayList<String> streetNames;
    private static ArrayList<PostalCode> postalCodes;

    private int number;
    private String street;
    private PostalCode code;

    public static void initialize(File streetFile, File postalCodesFile) throws FileNotFoundException {
        streetNames = new ArrayList();
        Scanner scanner = new Scanner(streetFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            streetNames.add(line);
        }

        postalCodes = new ArrayList();
        scanner = new Scanner(postalCodesFile);
        scanner.nextLine();         //get rid of first line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String parts[] = line.split(",");
            if (parts.length >= 4) {
                PostalCode temp = new PostalCode(parts[1], parts[3], parts[0]);
//                System.out.println(temp.toString());
                postalCodes.add(temp);
            }

        }

    }

    public static Address random() {
        Address address = new Address();
        Random rand = new Random();
        address.street = streetNames.get(rand.nextInt(streetNames.size()));
        address.code = postalCodes.get(rand.nextInt(postalCodes.size()));
        address.number = rand.nextInt(4900) + 100;
        return address;
    }

    @Override
    public String toString() {
        return number + " " + street + ", " + code.toString();
    }

//           generateAddress
}
