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
        System.out.println(getData());
//        test1.main(args);
//        test2.main(args);
        // TODO code application logic here
    }

    private static void setup() throws FileNotFoundException {
        Address.initialize(new File("streetNames.txt"), new File("us_postal_codes.csv"));
        Surname.initialize(new File("lastNames.txt"), 500);             //limit to first 500 names
        FirstName.initialize(new File("names\\yob1990.txt"), 250);      //limit to first 250 female and first 250 male names
        Building.generateBuildings(10);
        Student.generateStudents(50);
        Staff.generateStaff(50);
        Department.initialize();
        Subject.initialize(new File("coursescsv.csv"));
        Class.generateClasses(100);
        Faculty_Categories.generate(50);
        Faculty_Classes.generate(5);
        Faculty_Subjects.generate(5);
        Student_Schedules.generate(100);
    }

    private static String getData() {
        return staff() + "\n\n" + departments() + "\n\n" + facultyCategories() + "\n\n" + faculty() +"\n\n" + categories();
    }

    private static String staff() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Staff(StaffID, StfFirstName, StfLastName, StfStreetAddress, StfState, StfZipCode, StfAreaCode, StfPhoneNumber, Salary, DateHired, Position)\n"
                + "VALUES ";

        for (int i = 0; i < Staff.staff.size(); i++) {
            Staff temp = Staff.staff.get(i);
            Person tempPerson = new Person();
            output = output + "(" + i + "," + tempPerson.getFirstName() + "," + tempPerson.getLastName() + "," + tempPerson.getStreetAddress() + "," + tempPerson.getState() + "," + tempPerson.getZipCode() + "," + tempPerson.getAreaCode() + "," + tempPerson.getPhoneNumber() + "," + temp.salary + "," + temp.year + "-" + temp.month + "-" + temp.day + "," + temp.position + ")";
            if (i == Staff.staff.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String departments() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Departments(DepartmentID, DeptName, DeptChair)\n"
                + "VALUES ";

        for (int i = 0; i < Department.name.length; i++) {
            output = output + "(" + i + "," + Department.name[i] + "," + Department.chairID[i] + ")";
            if (i == Department.name.length - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String facultyCategories() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Faculty_Categories(CategoryID, StaffID)\n"
                + "VALUES ";

        for (int i = 0; i < Faculty_Categories.categories.size(); i++) {
            output = output + "(" + Faculty_Categories.categories.get(i).categoryID + "," + Faculty_Categories.categories.get(i).staffID + ")";
            if (i == Faculty_Categories.categories.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;
    }

    private static String faculty() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Faculty(StaffID, Title, Status, Tenured)\n"
                + "VALUES ";

        for (int i = 0; i < Faculty.list.size(); i++) {
            Faculty temp = Faculty.list.get(i);
            output = output + "(" + temp.staffID + "," + temp.title + "," + temp.status + "," + temp.tenured + ")";
            if (i == Faculty.list.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String categories() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Categories(CategoryID, CategoryDescription, DepartmentID)\n"
                + "VALUES ";

        for (int i = 0; i < Category.categories.size(); i++) {
            output = output + "(" + i + "," + Category.categories.get(i).getDescription()+ "," + Category.categories.get(i).getDepartmentID() + ")";
            if (i == Category.categories.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

}
