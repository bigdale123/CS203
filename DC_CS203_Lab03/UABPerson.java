import java.lang.*;
import java.io.*;
import java.util.*;

public class UABPerson{
  private String name;
  private int age;
  private String blazerID;

  //Constructor Method
  public UABPerson(String name, int age, String blazerID){
    this.name = name;
    this.age = age;
    this.blazerID = blazerID;
  }
  // Get Methods
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public String getBlazerID(){
    return this.blazerID;
  }
  // Set Methods
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setBlazerID(String blazerID){
    this.blazerID = blazerID;
  }
  // Other Methods
  public boolean checkPalindrome(){
    String temp_name = this.getName();
    temp_name = temp_name.toLowerCase();
    String result = "";
    for (int i = (temp_name.length() - 1); i > -1; i--){
      result = result + temp_name.charAt(i);
    }
    //System.out.println(temp_name);
    //System.out.println(result);
    boolean Equals = temp_name.equals(result);
    return Equals;
  }

  public int yearsUntilRetirement(){
    return 65-this.age;
  }

  public String toString(){
    return this.getName()+"("+this.getBlazerID()+") is "+this.getAge()+" years old.";
  }

}
