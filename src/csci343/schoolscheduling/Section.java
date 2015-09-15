///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package csci343.schoolscheduling;
//
//import java.io.*;
//import java.util.*;
//
///**
// *
// * @author alprocto
// */
//public class Section {
//    private static ArrayList<Integer> subjectID;
//    private static ArrayList<Integer> subjectCode;
//    private static ArrayList<String> subjectPreReq;
//   
//    
//
//    public static void initialize(File streetFile, File postalCodesFile) throws FileNotFoundException {
//        subjectID = new ArrayList();
//        Scanner scanner = new Scanner(streetFile);
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            subjectID.add(line);
//        }
//
//        subjectCode = new ArrayList();
//        scanner = new Scanner(postalCodesFile);
//        scanner.nextLine();         //get rid of first line
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            String parts[] = line.split(",");
//            Subject temp = new Subject(parts[1], parts[3], parts[0]);
////            System.out.println(temp.toString());
//            subjectCode.add(temp);
//            
//        }
//        
//    }
//    
//    public static Section random(){
//        Section address = new Section();
//        Random rand = new Random();
//        address.street = subjectID.get(rand.nextInt(subjectID.size()));
//        address.code = subjectCode.get(rand.nextInt(subjectCode.size()));
//        address.number = rand.nextInt(9900) + 100;
//        return address;
//    }  
//    
//    @Override
//    public String toString(){
//        return number + " " + street + ", " + code.toString();
//    }
//    
//
////           generateAddress
//}
