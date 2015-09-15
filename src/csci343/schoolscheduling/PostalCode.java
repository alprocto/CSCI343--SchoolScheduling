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
public class PostalCode {
    protected String city;
    protected String state;
    protected String postalCode;
    
    /**
     *
     * @param city
     * @param state
     * @param postalCode
     */
    public PostalCode(String city, String state, String postalCode){
        this.city=city;
        this.state=state;
        this.postalCode=postalCode;
    }
    
    @Override
    public String toString(){
        return city + ", " + state + " " + postalCode;
    }
           
//           generateAddress
    
}
