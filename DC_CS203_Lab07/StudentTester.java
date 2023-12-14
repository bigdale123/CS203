import java.io.*;
import java.util.*;

public class StudentTester{
  public static void main(String[] args){
    Student students[] = new Student[25]; // initialize object array for the student's
    try{
      File f = new File("studentList.txt");  // Open file containing students
      Scanner in = new Scanner(f); // start scanner for the input file
      PrintWriter out = new PrintWriter("studentGrades.txt"); // start file writer
      int line_num = 0; // initialize line counter (used for adding objects to object array)
      while (in.hasNextLine()){ // while there is a next line:
        String line = in.nextLine();  //  read line as String
        System.out.println(line);  // print out line (for debugging)
        String[] splitted = line.split(","); // split line on commas
        students[line_num] = new Student(splitted[0],Integer.valueOf(splitted[1]),Integer.valueOf(splitted[2]),Integer.valueOf(splitted[3])); // add new object to object array using values found in String array (line 15)
        students[line_num].setFinalGrade(); // calculate student's final grade
        students[line_num].setLetterGrade(); // calculate student's letter grade
        out.println(splitted[0]+" received a grade of "+students[line_num].getFinalGrade()+": "+students[line_num].getLetterGrade()); // write student's name, final grade, and letter grade to file
        line_num += 1; // add one to the line number count
      }
      out.close(); // when finished reading lines, "flush" file changes to the output file.
  }
  catch (FileNotFoundException e){
    e.printStackTrace(); // called if no file is found.
  }
  }

}
