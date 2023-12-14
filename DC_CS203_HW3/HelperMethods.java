import java.io.*;
import java.util.*;


public class HelperMethods{
  private Employee employees[] = new Employee[1];
  private Surgeon surgeons[] = new Surgeon[1];
  private Receptionist receps[] = new Receptionist[1];
  private Janitor janitors[] = new Janitor[1];
  private Nurse nurses[] = new Nurse[1];
  private Administrator admins[] = new Administrator[1];
  private Doctor doctors[] = new Doctor[1];

  // fileToArray(String filename): using the filename variable, import each line as an object in an array of objects.
  // Input: A string variable representing a filename
  // No output returned
  public void fileToArray(String filename){
    try{
      File f = new File(filename);  // Open file containing students
      Scanner in = new Scanner(f); // start scanner for the input file
      int line_num = 0;
      while (in.hasNextLine()){
        String line = in.nextLine();
        // System.out.println(line);
        String[] splitted = line.split(" ");
        //System.out.println(splitted[0]);
        if (splitted[0].equals("E")){
          if(employees.length > 1){
            surgeons = Arrays.copyOf(surgeons,surgeons.length+1);
            employees[employees.length-1] = new Employee(splitted[1],Integer.valueOf(splitted[2]));
            employees = Arrays.copyOf(employees,employees.length+1);
          }
          else{
            employees[0] = new Employee(splitted[1],Integer.valueOf(splitted[2]));
            employees = Arrays.copyOf(employees,employees.length+1);
          }

        }
        else if (splitted[0].equals("S")){
          if(surgeons.length > 1){
            surgeons = Arrays.copyOf(surgeons,surgeons.length+1);
            surgeons[surgeons.length-1] = new Surgeon(splitted[1],Integer.valueOf(splitted[2]),splitted[3],splitted[4]);
            surgeons = Arrays.copyOf(surgeons,surgeons.length+1);
          }
          else{
            surgeons[0] = new Surgeon(splitted[1],Integer.valueOf(splitted[2]),splitted[3],splitted[4]);
            surgeons = Arrays.copyOf(surgeons,surgeons.length+1);
          }

        }
        else if (splitted[0].equals("R")){
          if(receps.length > 1){
            receps = Arrays.copyOf(receps,receps.length+1);
            receps[receps.length-1] = new Receptionist(splitted[1],Integer.valueOf(splitted[2]),splitted[3],splitted[4]);
            receps = Arrays.copyOf(receps,receps.length+1);
          }
          else{
            receps[0] = new Receptionist(splitted[1],Integer.valueOf(splitted[2]),splitted[3],splitted[4]);
            receps = Arrays.copyOf(receps,receps.length+1);
          }

        }

        else if (splitted[0].equals("J")){
          if(janitors.length == 1){
            janitors = Arrays.copyOf(janitors,janitors.length+1);
            janitors[janitors.length-1] = new Janitor(splitted[1],Integer.valueOf(splitted[2]),splitted[3],splitted[4]);
            janitors = Arrays.copyOf(janitors,janitors.length+1);
          }
          else{
            janitors[0] = new Janitor(splitted[1],Integer.valueOf(splitted[2]),splitted[3],splitted[4]);
            janitors = Arrays.copyOf(janitors,janitors.length+1);
          }

        }

        else if (splitted[0].equals("N")){
          if(nurses.length > 1){
            nurses = Arrays.copyOf(nurses,nurses.length+1);
            nurses[nurses.length-1] = new Nurse(splitted[1],Integer.valueOf(splitted[2]),Integer.valueOf(splitted[3]));
            nurses = Arrays.copyOf(nurses,nurses.length+1);
          }
          else{
            nurses[0] = new Nurse(splitted[1],Integer.valueOf(splitted[2]),Integer.valueOf(splitted[3]));
            nurses = Arrays.copyOf(nurses,nurses.length+1);
          }

        }

        else if (splitted[0].equals("A")){
          if(admins.length > 1){
            admins = Arrays.copyOf(admins,admins.length+1);
            admins[admins.length-1] = new Administrator(splitted[1],Integer.valueOf(splitted[2]),splitted[3]);
            admins = Arrays.copyOf(admins,admins.length+1);
          }
          else{
            admins[0] = new Administrator(splitted[1],Integer.valueOf(splitted[2]),splitted[3]);
            admins = Arrays.copyOf(admins,admins.length+1);
          }

        }

        else if (splitted[0].equals("D")){
          if(doctors.length > 1){
            doctors = Arrays.copyOf(doctors,doctors.length+1);
            doctors[doctors.length-1] = new Doctor(splitted[1],Integer.valueOf(splitted[2]),splitted[3]);
            doctors = Arrays.copyOf(doctors,doctors.length+1);
          }
          else{
            doctors[0] = new Doctor(splitted[1],Integer.valueOf(splitted[2]),splitted[3]);
            doctors = Arrays.copyOf(doctors,doctors.length+1);
          }

        }


      }
      // Cleans out any null values
      // Insurance policy to prevent NullPointerExceptions when running the program.
      // Used from this stackoverflow thread: https://stackoverflow.com/questions/7230315/how-to-remove-null-from-an-array-in-java
      employees = Arrays.stream(employees).filter(Objects::nonNull).toArray(Employee[]::new);
      surgeons = Arrays.stream(surgeons).filter(Objects::nonNull).toArray(Surgeon[]::new);
      receps = Arrays.stream(receps).filter(Objects::nonNull).toArray(Receptionist[]::new);
      janitors = Arrays.stream(janitors).filter(Objects::nonNull).toArray(Janitor[]::new);
      nurses = Arrays.stream(nurses).filter(Objects::nonNull).toArray(Nurse[]::new);
      admins = Arrays.stream(admins).filter(Objects::nonNull).toArray(Administrator[]::new);
      doctors = Arrays.stream(doctors).filter(Objects::nonNull).toArray(Doctor[]::new);
      in.close();
    }
    catch (FileNotFoundException e){
      e.printStackTrace(); // called if no file is found.
    }

  }

  // updateDatabase(String filename): Using a string as input, write out array objects line by line to the output file.
  // Input: A String representing a filename.
  // No output returned
  public void updateDatabase(String filename){
    File file = new File(filename);
    file.delete();
    try{
      PrintWriter out = new PrintWriter(filename);
      for (int i = 0; i < employees.length; i += 1){
        out.println("E "+employees[i].getName()+" "+employees[i].getBlazerId());
      }
      for (int i = 0; i < surgeons.length; i += 1){
        out.println("S "+surgeons[i].getName()+" "+surgeons[i].getBlazerId()+" "+surgeons[i].getDepartment()+" "+surgeons[i].getOperating());
      }
      for (int i = 0; i < receps.length; i += 1){
        out.println("R "+receps[i].getName()+" "+receps[i].getBlazerId()+" "+receps[i].getDepartment()+" "+receps[i].getTalking());
      }
      for (int i = 0; i < janitors.length; i += 1){
        out.println("J "+janitors[i].getName()+" "+janitors[i].getBlazerId()+" "+janitors[i].getDepartment()+" "+janitors[i].getSweeping());
      }
      for (int i = 0; i < nurses.length; i += 1){
        out.println("N "+nurses[i].getName()+" "+nurses[i].getBlazerId()+" "+nurses[i].getPatients());
      }
      for (int i = 0; i < admins.length; i += 1){
        out.println("A "+admins[i].getName()+" "+admins[i].getBlazerId()+" "+admins[i].getDepartment());
      }
      for (int i = 0; i < doctors.length; i += 1){
        out.println("D "+doctors[i].getName()+" "+doctors[i].getBlazerId()+" "+doctors[i].getSpecialty());
      }
      out.close();
    }
    catch (FileNotFoundException e){
      e.printStackTrace(); // called if no file is found.
    }

  }

  // addEmployee(String name, int blazerId): Using the given inputs, create a new employee in the employees array.
  // Input: a String representing a name, and an Integer representing a blazerId
  // No output returned
  public void addEmployee(String name, int blazerId){
    if(employees.length >= 1){
      employees = Arrays.copyOf(employees,employees.length+1);
      employees[employees.length-1] = new Employee(name,blazerId);

    }
    else{
      employees[0] = new Employee(name,blazerId);
      employees = Arrays.copyOf(employees,employees.length+1);
    }
    employees = Arrays.stream(employees).filter(Objects::nonNull).toArray(Employee[]::new);
  }

  //  addSurgeon(String name, int blazerId, String department, String Operating): Using the given inputs, create a new surgeon in the surgeons array.
  // Input: a string representing a name, an Integer representing a blazerId, a String representing a department, and a String representing if the surgeon is Operating
  // No output returned
  public void addSurgeon(String name, int blazerId, String department, String Operating){
    if(surgeons.length >= 1){
      surgeons = Arrays.copyOf(surgeons,surgeons.length+1);
      surgeons[surgeons.length-1] = new Surgeon(name,blazerId,department,Operating);

    }
    else{
      surgeons[0] = new Surgeon(name,blazerId,department,Operating);
      surgeons = Arrays.copyOf(surgeons,surgeons.length+1);
    }
    surgeons = Arrays.stream(surgeons).filter(Objects::nonNull).toArray(Surgeon[]::new);
  }

  //  addReceptionist(String name, int blazerId, String department, String talking): Using the given inputs, create a new Receptionist in the receps array.
  // Input: A string representing a name, an Integer representing a blazerId, a string representing a department, and a string representing if the receptionist is talking or not.
  // No output returned
  public void addReceptionist(String name, int blazerId, String department, String talking){
    if(receps.length >= 1){
      receps = Arrays.copyOf(receps,receps.length+1);
      receps[receps.length-1] = new Receptionist(name,blazerId,department,talking);

    }
    else{
      receps[0] = new Receptionist(name,blazerId,department,talking);
      receps = Arrays.copyOf(receps,receps.length+1);
    }
    receps = Arrays.stream(receps).filter(Objects::nonNull).toArray(Receptionist[]::new);
  }

  // addJanitor(String name, int blazerId, String department, String sweeping): Using the given inputs, create a new janitor in the janitors array.
  // Input: A string representing a name, an Integer representing a blazerId, a string representing a department, and a String representing if the janitor is sweeping.
  // No output returned.
  public void addJanitor(String name, int blazerId, String department, String sweeping){
    if(janitors.length >= 1){
      janitors = Arrays.copyOf(janitors,janitors.length+1);
      janitors[janitors.length-1] = new Janitor(name,blazerId,department,sweeping);

    }
    else{
      janitors[0] = new Janitor(name,blazerId,department,sweeping);
      janitors = Arrays.copyOf(janitors,janitors.length+1);
    }
    janitors = Arrays.stream(janitors).filter(Objects::nonNull).toArray(Janitor[]::new);
  }

  // addNurse(String name, int blazerId, int patients): Using the given inputs, create a new nurse in the nurses array.
  // Inputs: a string representing a name, an Integer representing a blazerId, and a Integer representing the number of patients the nurse has.
  // No output returned.
  public void addNurse(String name, int blazerId, int patients){
    if(nurses.length >= 1){
      nurses = Arrays.copyOf(nurses,nurses.length+1);
      nurses[nurses.length-1] = new Nurse(name,blazerId,patients);

    }
    else{
      nurses[0] = new Nurse(name,blazerId,patients);
      nurses = Arrays.copyOf(nurses,nurses.length+1);
    }
    nurses = Arrays.stream(nurses).filter(Objects::nonNull).toArray(Nurse[]::new);
  }

  // addAdministrator(String name, int blazerId, String department): Using the given inputs, create a new admin in the admins array.
  // Inputs: A string representing a name, an Integer representing a blazerId, and a string representing a department
  // No outputs returned
  public void addAdministrator(String name, int blazerId, String department){
    if(admins.length >= 1){
      admins = Arrays.copyOf(admins,admins.length+1);
      admins[admins.length-1] = new Administrator(name,blazerId,department);

    }
    else{
      admins[0] = new Administrator(name,blazerId,department);
      admins = Arrays.copyOf(admins,admins.length+1);
    }
    admins = Arrays.stream(admins).filter(Objects::nonNull).toArray(Administrator[]::new);
  }

  // addDoctor(String name, int blazerId, String specialty): Using the given inputs, create a new doctor in the doctors array.
  // Input: A string representing a name, a Integer representing a blazerId, and a String representing the doctors specialty
  // No output returned.
  public void addDoctor(String name, int blazerId, String specialty){
    if(doctors.length >= 1){
      doctors = Arrays.copyOf(doctors,doctors.length+1);
      doctors[doctors.length-1] = new Doctor(name,blazerId,specialty);

    }
    else{
      doctors[0] = new Doctor(name,blazerId,specialty);
      doctors = Arrays.copyOf(doctors,doctors.length+1);
    }
    doctors = Arrays.stream(doctors).filter(Objects::nonNull).toArray(Doctor[]::new);
  }

  // deleteEmployee(int blazerId): Given a blazerId, attempt to delete the employee.
  // Input: a Integer representing blazerId
  // No output returned
  public void deleteEmployee(int blazerId){
    for (int i = 0; i < employees.length; i += 1){
      if(employees[i].getBlazerId().equals(String.valueOf(blazerId))){
        employees[i] = null;
      }
    }
    employees = Arrays.stream(employees).filter(Objects::nonNull).toArray(Employee[]::new);
  }

  //  deleteSurgeon(int blazerId): Given a blazerId, attempt to delete the surgeon
  // Input: a Integer representing blazerId
  // No output returned
  public void deleteSurgeon(int blazerId){
    for (int i = 0; i < surgeons.length; i += 1){
      if(surgeons[i].getBlazerId().equals(String.valueOf(blazerId))){
        surgeons[i] = null;
      }
    }
    surgeons = Arrays.stream(surgeons).filter(Objects::nonNull).toArray(Surgeon[]::new);
  }

  // deleteReceptionist(int blazerId): Given a blazerId, attempt to delete the Receptionist
  // Input: a Integer representing blazerId
  // No output returned
  public void deleteReceptionist(int blazerId){
    for (int i = 0; i < receps.length; i += 1){
      if(receps[i].getBlazerId().equals(String.valueOf(blazerId))){
        receps[i] = null;
      }
    }
    receps = Arrays.stream(receps).filter(Objects::nonNull).toArray(Receptionist[]::new);
  }

  // deleteJanitor(int blazerId): Given a blazerId, attempt to delete the Janitor
  // Input: a Integer representing blazerId
  // No output returned
  public void deleteJanitor(int blazerId){
    for (int i = 0; i < janitors.length; i += 1){
      if(janitors[i].getBlazerId().equals(String.valueOf(blazerId))){
        janitors[i] = null;
      }
    }
    janitors = Arrays.stream(janitors).filter(Objects::nonNull).toArray(Janitor[]::new);
  }

  // deleteNurse(int blazerId): Given a blazerId, attempt to delete the Nurse
  // Input: a Integer representing blazerId
  // No output returned
  public void deleteNurse(int blazerId){
    for (int i = 0; i < nurses.length; i += 1){
      if(nurses[i].getBlazerId().equals(String.valueOf(blazerId))){
        nurses[i] = null;
      }
    }
    nurses = Arrays.stream(nurses).filter(Objects::nonNull).toArray(Nurse[]::new);
  }

  // deleteAdministrator(int blazerId): Given a blazerId, attempt to delete the Administrator
  // Input: a Integer representing blazerId
  // No output returned
  public void deleteAdministrator(int blazerId){
    for (int i = 0; i < admins.length; i += 1){
      if(admins[i].getBlazerId().equals(String.valueOf(blazerId))){
        admins[i] = null;
      }
    }
    admins = Arrays.stream(admins).filter(Objects::nonNull).toArray(Administrator[]::new);
  }

  // deleteDoctor(int blazerId): Given a blazerId, attempt to delete the Doctor
  // Input: a Integer representing blazerId
  // No output returned
  public void deleteDoctor(int blazerId){
    for (int i = 0; i < doctors.length; i += 1){
      if(doctors[i].getBlazerId().equals(String.valueOf(blazerId))){
        doctors[i] = null;
      }
    }
    doctors = Arrays.stream(doctors).filter(Objects::nonNull).toArray(Doctor[]::new);
  }

  // printEmployees(): Prints a list of Employees
  // no inputs needed
  // no outputs returned
  public void printEmployees(){
    System.out.println("The UAB Hospital System has the following Employees:");
    System.out.println("  Total # of Employees = "+String.valueOf(employees.length+surgeons.length+receps.length+janitors.length+nurses.length+admins.length+doctors.length));
    System.out.println();
    System.out.println("  Hospital Employees: "+String.valueOf(employees.length));
    for (int i = 0; i < employees.length; i += 1){
      System.out.println("    "+employees[i].toString());
    }
    System.out.println();
    System.out.println("  Surgeons: "+String.valueOf(surgeons.length));
    for (int i = 0; i < surgeons.length; i += 1){
      System.out.println("    "+surgeons[i].toString());
    }
    System.out.println();
    System.out.println("  Receptionists: "+String.valueOf(receps.length));
    for (int i = 0; i < receps.length; i += 1){
      System.out.println("    "+receps[i].toString());
    }
    System.out.println();
    System.out.println("  Janitors: "+String.valueOf(janitors.length));
    for (int i = 0; i < janitors.length; i += 1){
      System.out.println("    "+janitors[i].toString());
    }
    System.out.println();
    System.out.println("  Nurses: "+String.valueOf(nurses.length));
    for (int i = 0; i < nurses.length; i += 1){
      System.out.println("    "+nurses[i].toString());
    }
    System.out.println();
    System.out.println("  Administrators: "+String.valueOf(admins.length));
    for (int i = 0; i < admins.length; i += 1){
      System.out.println("    "+admins[i].toString());
    }
    System.out.println();
    System.out.println("  Doctors: "+String.valueOf(doctors.length));
    for (int i = 0; i < doctors.length; i += 1){
      System.out.println("    "+doctors[i].toString());
    }

  }

  // debuggingMethod(): Just a method to call when needing to debug the classes.
  // No Inputs
  // No outputs
  public void debuggingMethod(){
    Doctor doctor = new Doctor("John",0001,"Proctology");
    System.out.println(doctor.toString());

    Nurse nurse = new Nurse("Joy",0002,4);
    System.out.println(nurse.toString());

    Administrator admin = new Administrator("Breen",0003,"Overseer");
    System.out.println(admin.toString());

    Surgeon surgeon = new Surgeon("Strange",0004,"NS","Y");
    System.out.println(surgeon.toString());

    Receptionist recep = new Receptionist("Pam",0005,"Talking","Y");
    System.out.println(recep.toString());

    Janitor janitor = new Janitor("Scruffy",0006,"Maintenance","N");
    System.out.println(janitor.toString());
  }
}
