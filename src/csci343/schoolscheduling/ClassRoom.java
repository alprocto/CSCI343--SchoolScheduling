/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csci343.schoolscheduling;

/**
 *
 * @author Amanda
 */
public class ClassRoom {
    protected String buildingCode;
    protected Boolean phoneAvailable;
    protected int roomNumber;
    
    public ClassRoom(String buildingCode, Boolean phoneAvailable, int roomNumber){
        this.buildingCode=buildingCode;
        this.phoneAvailable=phoneAvailable;
        this.roomNumber=roomNumber;
    }
    @Override
    public String toString(){
        return buildingCode + ", " + roomNumber + ", " + phoneAvailable;
    }
    
}
