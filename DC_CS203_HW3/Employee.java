public class Employee{
  private String name;
  private int blazerId;

  // Employee(String name, int blazerId): Contstructs a Employee object using given inputs.
  // Input: a string representing a name, an Integer representing a blazerId
  // no outputs
  public Employee(String name, int blazerId){
    this.name = name;
    this.blazerId = blazerId;
  }


  //getName(): Returns the value of Name
  // no inputs
  // returns this.name
  public String getName(){
    return this.name;
  }
  // setName(String name): Sets the value of name
  // Inputs: a string representing a name
  // no outputs
  public void setName(String name){  // While unlikely, this has been implemented in the event someone changes their name.
    this.name = name;
  }
  //getBlazerId(): Returns the value of blazerId
  // no inputs
  // returns this.blazerId
  public String getBlazerId(){
    return String.valueOf(this.blazerId);
  }
  // Note: Not implementing setBlazerId, since the blazer ID should not be changeable,
  //    Only removeable in the case of an employee being deleted.

  // ToString(): Returns attributes of the class in string form
  // No inputs
  // returns a formatted string containing values from the class
  public String toString(){
    return " Name: "+this.getName()+"    BlazerId: "+this.getBlazerId();
  }
}
