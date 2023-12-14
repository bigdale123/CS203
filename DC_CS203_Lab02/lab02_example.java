import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class lab02_example{

  public static void main(String[] args){
    String filename = "student.csv";
    File file = new File(filename);
    ArrayList<String> students = new ArrayList<String>();
    HashMap<String,Double> data = new HashMap<String,Double>();
    try{
      Scanner scan = new Scanner(file);
      scan.nextLine();
      while(scan.hasNextLine()){
        String line = scan.nextLine();
        String elms[] = line.split(",");
        //System.out.println(elms[2]);
        //System.out.println(line);
        String name = elms[0];
        Double bill1 = Double.parseDouble(elms[1]);
        Double bill2 = Double.parseDouble(elms[2]);
        Double bill3 = Double.parseDouble(elms[3]);

        students.add(name);
        data.put(name, bill1+bill2+bill3);
      }
      scan.close();
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
    for (String student: students){
      System.out.printf(student+" has a bill total of %.2f\n", data.get(student));
    }
  }

}
