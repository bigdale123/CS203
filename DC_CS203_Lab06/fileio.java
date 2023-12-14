import java.io.*;
import java.util.*;

public class fileio{
  public static void main(String[] args){
    try{
    File f = new File("tester.txt");
    Scanner in = new Scanner(f);
    PrintWriter out = new PrintWriter("output.txt");
    double total = 0;
    while (in.hasNextLine()){
      String line = in.nextLine();
      System.out.println(line);
      String[] splitted = line.split(",");
      for (String n : splitted){
        total += Integer.parseInt(n);

      }
      out.println(total);
    }
    out.close();
    // double total = 0;
    // while (in.hasNextDouble()){
    //   double value = in.nextDouble();
    //   System.out.println(value);
    //   total += value;
    //   System.out.println(value);
    // }
    // System.out.println(total);
  }
  catch (FileNotFoundException e){
    e.printStackTrace();
  }
}
}
