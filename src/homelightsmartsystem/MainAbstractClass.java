/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homelightsmartsystem;

/**
 *
 * @author STAR LIGHT COMP TECH
 */
public abstract class MainAbstractClass {
    //private String HBox;
    private String Rooms;
    // constructors
    MainAbstractClass(String Rooms){
   // this.HBox=HBox;
    this.Rooms=Rooms;
    }
    
    
    //getters and setters
   // public void setHBox(){
    //}
    public void setRooms(){
    }
   // public String getHBox(){
    //    return HBox;
    //}
     public String getRooms(){
         return Rooms;
    }
}
