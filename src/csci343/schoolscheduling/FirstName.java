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
public class FirstName {

    private static ArrayList<String> names;

    public static void initialize(File firstNameFile) throws FileNotFoundException {
        names = new ArrayList();
        Scanner scanner = new Scanner(firstNameFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String lineArray[] = line.split(",");
            if (lineArray.length >= 3) {
                names.add(lineArray[0]);

            }

        }
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i).toString());
//        }
    }

    public static void initialize(File firstNameFile, int limit) throws FileNotFoundException {
        names = new ArrayList();
        Scanner scanner = new Scanner(firstNameFile);
        int f = 0;
        int m = 0;
        while (scanner.hasNextLine() && (f < limit || m < limit)) {
            String line = scanner.nextLine();
            String lineArray[] = line.split(",");
            if (lineArray.length >= 3) {
                if (lineArray[1].compareToIgnoreCase("F") == 0 && f < limit) {
                    names.add(lineArray[0]);
                    f++;
                } else if (lineArray[1].compareToIgnoreCase("M") == 0 && m < limit) {
                    names.add(lineArray[0]);
                    m++;
                }

            }
        }
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i).toString());
//        }
    }

    public static String random() {
        Random rand = new Random();
        return names.get(rand.nextInt(names.size()));
    }
}
