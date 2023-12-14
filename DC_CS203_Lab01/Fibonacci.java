import java.util.Scanner;

public class Fibonacci{
  static void fibonacci(){
    System.out.println("Enter the number of fibonacci numbers to generate:");
    System.out.print(" N = ");
    Scanner myObj = new Scanner(System.in);
    int n = myObj.nextInt();
    n -= 1;

    // Taken from Lab04 in CS103
    int f1 = 0;
    int f2 = 1;
    for (int i = n; i >= 0; i--){
      System.out.print(String.valueOf(f1)+" ");
      int sum = f1+f2;
      f1 = f2;
      f2 = sum;
    }
  }

  public static void main(String args[]){
    fibonacci();
  }
}
