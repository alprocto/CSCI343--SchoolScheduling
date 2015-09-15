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
public class PhoneNumber {

    protected int areaCode;
    protected int centralOfficeCode = 555;                //Only 555-0100 through 555-0199 are reserved for fictional use.
    protected int subscriberNumber;

    public PhoneNumber(int areaCode, int centralOfficeCode, int subscriberNumber) {
        this.areaCode = areaCode;
        this.centralOfficeCode = centralOfficeCode;
        this.subscriberNumber = subscriberNumber;

    }

    public PhoneNumber(int areaCode, int subscriberNumber) {
        this.areaCode = areaCode;
        this.subscriberNumber = subscriberNumber;
    }

    public static PhoneNumber random() {
        Random rand = new Random();
        PhoneNumber temp = new PhoneNumber(rand.nextInt(800) + 200, rand.nextInt(100) + 100);
        return temp;
    }

    public String toString() {
        if (subscriberNumber < 10) {
                    return "(" + areaCode + ") " + centralOfficeCode + "-000" + subscriberNumber;
        } else if (subscriberNumber < 100) {
                    return "(" + areaCode + ") " + centralOfficeCode + "-00" + subscriberNumber;
        } else if (subscriberNumber < 1000) {
        return "(" + areaCode + ") " + centralOfficeCode + "-0" + subscriberNumber;
        }
        return "(" + areaCode + ") " + centralOfficeCode + "-" + subscriberNumber;
    }

}
