/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci343.schoolscheduling;

import java.util.Random;

/**
 *
 * @author alprocto
 */
public class Person {

    protected Address address;
    protected String firstName;
    protected String surname;
    protected PhoneNumber phoneNumber;

    public Person() {
        firstName = FirstName.random();
        surname = Surname.random();
        address = Address.random();
        phoneNumber = PhoneNumber.random();

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return surname;
    }

    public String getStreetAddress() {
        return address.getStreetNumber() + address.getStreet();
    }

    public String getCity() {
        return address.getCity();
    }

    public String getState() {
        return address.getState();
    }

    public String getZipCode() {
        return address.getZipCode();
    }

    public int getAreaCode() {
        return phoneNumber.areaCode;
    }

    public int getPhoneNumber() {
        return phoneNumber.centralOfficeCode * 1000 + phoneNumber.subscriberNumber;
    }
    
    @Override
    public String toString(){
        return firstName + " "+ surname + ", " + address.toString() + ", " + phoneNumber.toString();
    }

}
