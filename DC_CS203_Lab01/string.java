import java.util.Scanner;

public class string{
  static void string(){
    System.out.println("Enter a string to find the middle character of:");
    System.out.print(" String = ");
    Scanner myObj = new Scanner(System.in);
    String n = myObj.nextLine();
    if (n.length()%2 == 1){
      int index = (n.length()/2);
      System.out.println(n.charAt(index));
    }
    else{
      System.out.println(n.charAt(n.length()/2));
    }
  }
  public static void main(String args[]){
      string();
  }

}
