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
        Faculty_Classes.generate(20);
        Faculty_Subjects.generate(20);
        Student_Schedules.generate(100);
    }

    private static String getData() {
        return staff()
                + "\n\n" + departments()
                + "\n\n" + facultyCategories()
                + "\n\n" + faculty()
                + "\n\n" + categories()
                + "\n\n" + facultyCategories()
                + "\n\n" + subjects()
                + "\n\n" + facultySubjects()
                + "\n\n" + classes()
                + "\n\n" + classRooms()
                + "\n\n" + buildings()
                + "\n\n" + studentClassStatus()
                + "\n\n" + studentSchedules();
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
            output = output + "(" + i + "," + Category.categories.get(i).getDescription() + "," + Category.categories.get(i).getDepartmentID() + ")";
            if (i == Category.categories.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String facultyClasses() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Faculty_Classes(StaffID, ClassID)\n"
                + "VALUES ";

        for (int i = 0; i < Faculty_Classes.classes.size(); i++) {
            output = output + "(" + Faculty_Classes.classes.get(i).staffID + "," + Faculty_Classes.classes.get(i).classID + ")";
            if (i == Faculty_Classes.classes.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String subjects() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Subjects(SubjectID, SubjectCode, SubjectName, SubjectPreReq, SubjectDescription, CategoryID)\n"
                + "VALUES ";

        for (int i = 0; i < Subject.subjects.size(); i++) {
            Subject temp = Subject.subjects.get(i);
            output = output + "(" + i + "," + temp.subjectCode + "," + temp.subjectName + "," + temp.subjectPreReq + "," + temp.subjectDescription + "," + temp.categoryID + ")";
            if (i == Subject.subjects.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String facultySubjects() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Faculty_Subjects(StaffID, SubjectID, ProficiencyRating)\n"
                + "VALUES ";

        for (int i = 0; i < Faculty_Subjects.subjects.size(); i++) {
            output = output + "(" + Faculty_Subjects.subjects.get(i).staffID + "," + Faculty_Subjects.subjects.get(i).subjectID + "," + Faculty_Subjects.subjects.get(i).proficiencyRating + ")";
            if (i == Faculty_Subjects.subjects.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String classes() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Classes(ClassID, SubjectID, ClassRoomID, Credits, StartDate, StartTime, Duration, MondaySchedule, TuesdaySchedule, WednesdaySchedule, ThursdaySchedule, FridaySchedule, SaturdaySchedule)\n"
                + "VALUES ";

        for (int i = 0; i < Class.classes.size(); i++) {
            Class temp = Class.classes.get(i);
            output = output + "(" + i + "," + temp.sujectID + "," + temp.classRoomID + "," + temp.credits + "," + temp.year + "-" + temp.month + "-" + temp.day + "," + temp.hour + ":" + temp.minute + "," + temp.length + "," + temp.mondaySchedule + "," + temp.tuesdaySchedule + "," + temp.wednesdaySchedule + "," + temp.thursdaySchedule + "," + temp.fridaySchedule + "," + temp.saturdaySchedule + ")";
            if (i == Staff.staff.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String classRooms() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Class_Rooms(ClassRoomID, RoomNumber, BuildingCode, PhoneAvailable)\n"
                + "VALUES ";

        for (int i = 0; i < Building.classRooms.size(); i++) {
            output = output + "(" + i + "," + Building.classRooms.get(i).roomNumber + "," + Building.classRooms.get(i).buildingCode + "," + Building.classRooms.get(i).phoneAvailable + ")";
            if (i == Building.classRooms.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String buildings() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Buildings(BuildingCode, BuildingName, NumberOfFloors, ElevatorAccess, SiteParkingAvailable)\n"
                + "VALUES ";

        for (int i = 0; i < Building.buildings.size(); i++) {
            output = output + "(" + i + "," + Building.buildings.get(i).buildingCode + "," + Building.buildings.get(i).buildingName + "," + Building.buildings.get(i).numberOfFloors + "," + Building.buildings.get(i).elavatorAccess + "," + Building.buildings.get(i).siteParkingAvailable + ")";
            if (i == Building.buildings.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String studentClassStatus() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Student_Class_Status(ClassStatus, ClassStatusDescription)\n"
                + "VALUES ";

        for (int i = 0; i < Student_Class_Status.status.length; i++) {
            output = output + "(" + i + "," + Student_Class_Status.status[i] + ")";
            if (i == Student_Class_Status.status.length - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

    private static String studentSchedules() {
        String output = new String();
        output = "INSERT INTO\n"
                + "Student_Schedules(StudentID, ClassID, ClassStatus, Grade)\n"
                + "VALUES ";

        for (int i = 0; i < Student_Schedules.schedules.size(); i++) {
            output = output + "(" + Student_Schedules.schedules.get(i).studentID + "," + Student_Schedules.schedules.get(i).classID + "," + Student_Schedules.schedules.get(i).classStatus + "," + Student_Schedules.schedules.get(i).grade + ")";
            if (i == Student_Schedules.schedules.size() - 1) {
                output = output + ";";
            } else {
                output = output + ",\n";
            }
        }
        return output;

    }

}
