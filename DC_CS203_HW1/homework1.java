import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
public class homework1{
  static void budget(String filename){
    File file = new File(filename);
    ArrayList<String> Departments = new ArrayList<String>();
    ArrayList<Double> Salaries = new ArrayList<Double>();
    HashMap<String,Double> Department_Budget = new HashMap<String,Double>();
    HashMap<String,Double> Department_Employees = new HashMap<String,Double>();
    Double max_salary = 0.0;
    Double min_salary = 10000000000000000000.0; // A bit jank, but keeps the minimum salary from defaulting to zero.
    String max_salary_info = "";
    String min_salary_info = "";
    try{
      Scanner scan = new Scanner(file);
      scan.nextLine();
      while(scan.hasNextLine()){
        String line = scan.nextLine();
        String elms[] = line.split(",");

        // The following ArrayList Method is used from this StackOverflow Thread (https://bit.ly/32QkLob):
        // ArrayList.contains() to see if a department is already stored
        if(Departments.contains(elms[3]) == false){
          Departments.add(elms[3]);
        }

        if(Department_Employees.containsKey(elms[3]) == true){
          Department_Employees.replace(elms[3],Department_Employees.get(elms[3])+1.0);
        }
        else{
          Department_Employees.put(elms[3],1.0);
        }
        Double n = Double.parseDouble(elms[4]);
        // The following HashMap methods have been used from geeksforgeeks.com:
        //   - HashMap.containsKey() to see if key already exists
        //   - HashMap.replace() to update a value
        if(Department_Budget.containsKey(elms[3]) == true){
          Department_Budget.replace(elms[3],Department_Budget.get(elms[3])+n);
        }
        else{
          Department_Budget.put(elms[3],n);
        }
        if (Salaries.contains(n) == false){
          Salaries.add(n);
        }
        if (n >= max_salary){
          max_salary = n;
          max_salary_info = line;
        }
        else if (n <= min_salary && n > 0 && n <= max_salary){
          min_salary = n;
          min_salary_info = line;
        }
      }
      scan.close();
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
    double Department_Max_Salary = 0.0;
    String Department_Max = "";
    for (String department: Departments){
      System.out.printf(department+" has a budget total of %.2f\n", Department_Budget.get(department));
      if (Department_Budget.get(department) > Department_Max_Salary){
        Department_Max = department;
        Department_Max_Salary = Department_Budget.get(department);
      }
    }
    System.out.println("-----");
    System.out.printf(Salaries.size()+" Unique Salaries: "+Salaries);
    System.out.println("-----");
    System.out.println("Max Salary: "+max_salary);
    System.out.println("Max Salary Info: "+max_salary_info);
    System.out.println();
    System.out.println("Min Salary: "+min_salary);
    System.out.println("Min Salary Info: "+min_salary_info);
    System.out.println("-----");
    System.out.println("Department with highest salary: "+Department_Max);
    System.out.println("  Salary: "+Department_Max_Salary);
    System.out.println("-----");
    for (String department: Departments){
      System.out.printf(department+" has a total of %.2f Employees.\n", Department_Employees.get(department));
    }
  }
  public static void main(String[] args){
    budget("company_records.csv");
  }
}
