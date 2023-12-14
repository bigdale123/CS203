import java.util.*;

public class runme{

  // main(String[] args): This is just the main method that runs the menu
  // no inputs
  // no outputs
  public static void main(String[] args){
    HelperMethods hm = new HelperMethods();
    hm.fileToArray("uabEmployee.txt");
    System.out.println("----------------------------------");
    System.out.println("   UAB Hospital Employee System");
    System.out.println("----------------------------------");
    System.out.println();
    Scanner myObj = new Scanner(System.in);
    while(true){
      System.out.println();
      System.out.println("----- Options -----");
      System.out.println(" 1. List hospital employees");
      System.out.println(" 2. Add hospital employee");
      System.out.println(" 3. Delete hospital employee");
      System.out.println(" 4. Update Database (Write changes to file)");
      System.out.println(" 5. Exit program");
      System.out.println("-------------------");
      System.out.println();
      System.out.print(" Enter choice: ");
      String choice = myObj.nextLine();
      System.out.println();
      if (choice.equals("1")){
        hm.printEmployees();
      }
      else if(choice.equals("2")){
        System.out.println();
        System.out.println("--- Which kind of employee is being added? ---");
        System.out.println(" 1. Generic Employee");
        System.out.println(" 2. Surgeon");
        System.out.println(" 3. Receptionist");
        System.out.println(" 4. Janitor");
        System.out.println(" 5. Nurse");
        System.out.println(" 6. Administrator");
        System.out.println(" 7. Doctor");
        System.out.println();
        System.out.print(" Enter Choice: ");
        choice = myObj.nextLine();
        System.out.println();
        if(choice.equals("1")){
          System.out.print("What is the employee's name? ");
          String name = myObj.nextLine();
          System.out.print("What is the employee's BlazerID? ");
          int BlazerID = myObj.nextInt();
          hm.addEmployee(name,BlazerID);
        }
        else if(choice.equals("2")){
          System.out.print("What is the Surgeon's name? ");
          String name = myObj.nextLine();
          System.out.print("What is the Surgeon's BlazerID? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          System.out.print("What is the Surgeon's department? ");
          String department = myObj.nextLine();
          System.out.print("Is the Surgeon operating? (Y/N) ");
          String operating = myObj.nextLine();
          hm.addSurgeon(name,BlazerID,department,operating);
        }
        else if(choice.equals("3")){
          System.out.print("What is the Receptionist's name? ");
          String name = myObj.nextLine();
          System.out.print("What is the Receptionist's BlazerID? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          System.out.print("What is the Receptionist's department? ");
          String department = myObj.nextLine();
          System.out.print("Is the Receptionist talking? (Y/N) ");
          String talking = myObj.nextLine();
          hm.addReceptionist(name,BlazerID,department,talking);
        }
        else if(choice.equals("4")){
          System.out.print("What is the Janitor's name? ");
          String name = myObj.nextLine();
          System.out.print("What is the Janitor's BlazerID? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          System.out.print("What is the Janitor's department? ");
          String department = myObj.nextLine();
          System.out.print("Is the Janitor sweeping? (Y/N) ");
          String sweeping = myObj.nextLine();
          hm.addJanitor(name,BlazerID,department,sweeping);
        }
        else if(choice.equals("5")){
          System.out.print("What is the Nurse's name? ");
          String name = myObj.nextLine();
          System.out.print("What is the Nurse's BlazerID? ");
          int BlazerID = myObj.nextInt();
          System.out.print("How many patients does the nurse have? ");
          int patients = myObj.nextInt();
          hm.addNurse(name,BlazerID,patients);
        }
        else if(choice.equals("6")){
          System.out.print("What is the Administrator's name? ");
          String name = myObj.nextLine();
          System.out.print("What is the Administrator's BlazerID? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          System.out.print("What is the Administrator's department? ");
          String department = myObj.nextLine();
          hm.addAdministrator(name,BlazerID,department);
        }
        else if(choice.equals("7")){
          System.out.print("What is the Doctor's name? ");
          String name = myObj.nextLine();
          System.out.print("What is the Doctor's BlazerID? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          System.out.print("What is the Doctor's specialty? ");
          String specialty = myObj.nextLine();
          hm.addAdministrator(name,BlazerID,specialty);
        }
      }
      else if(choice.equals("3")){
        System.out.println();
        System.out.println("--- Which kind of employee is being deleted? ---");
        System.out.println(" 1. Generic Employee");
        System.out.println(" 2. Surgeon");
        System.out.println(" 3. Receptionist");
        System.out.println(" 4. Janitor");
        System.out.println(" 5. Nurse");
        System.out.println(" 6. Administrator");
        System.out.println(" 7. Doctor");
        System.out.println();
        System.out.print(" Enter Choice: ");
        choice = myObj.nextLine();
        System.out.println();
        if(choice.equals("1")){
          System.out.print("What is the BlazerID of the Employee to be deleted? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          hm.deleteEmployee(BlazerID);
        }
        else if(choice.equals("2")){
          System.out.print("What is the BlazerID of the Surgeon to be deleted? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          hm.deleteSurgeon(BlazerID);
        }
        else if(choice.equals("3")){
          System.out.print("What is the BlazerID of the Receptionist to be deleted? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          hm.deleteReceptionist(BlazerID);
        }
        else if(choice.equals("4")){
          System.out.print("What is the BlazerID of the Janitor to be deleted? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          hm.deleteJanitor(BlazerID);
        }
        else if(choice.equals("5")){
          System.out.print("What is the BlazerID of the Nurse to be deleted? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          hm.deleteNurse(BlazerID);
        }
        else if(choice.equals("6")){
          System.out.print("What is the BlazerID of the Administrator to be deleted? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          hm.deleteAdministrator(BlazerID);
        }
        else if(choice.equals("7")){
          System.out.print("What is the BlazerID of the Doctor to be deleted? ");
          int BlazerID = myObj.nextInt();
          myObj.nextLine(); // consumes the newline char
          hm.deleteDoctor(BlazerID);
        }
      }
      else if(choice.equals("4")){
        hm.updateDatabase("uabEmployee.txt");
      }
      else if(choice.equals("5")){
        System.out.print("The program will exit. Do you want to continue? (Y/N) ");
        choice = myObj.nextLine();
        if(choice.toLowerCase().equals("y")){
          System.out.print(" Do you want to update the database before exiting? (Y/N) ");
          String choice1 = myObj.nextLine();
          if(choice1.toLowerCase().equals("y")){
            hm.updateDatabase("uabEmployee.txt");
          }
          break;
        }

      }

    }



    //      For Debugging
    // hm.fileToArray("uabEmployee.txt");
    // hm.printEmployees();
    // hm.addEmployee("Bob",0007);
    // hm.addSurgeon("Strange",0004,"NS","Y");
    // hm.addReceptionist("Pam",0005,"Talking","Y");
    // hm.addJanitor("Scruffy",0006,"Maintenance","N");
    // hm.addNurse("Joy",0002,4);
    // hm.addAdministrator("Breen",0003,"Overseer");
    // hm.addDoctor("John",0001,"Proctology");
    // hm.updateDatabase("uabEmployee.txt");
    // hm.deleteEmployee(0007);
    // hm.deleteSurgeon(0004);
    // hm.deleteReceptionist(0005);
    // hm.deleteJanitor(0006);
    // hm.deleteNurse(0002);
    // hm.deleteAdministrator(0003);
    // hm.deleteDoctor(0001);
    // hm.printEmployees();
    // hm.updateDatabase("uabEmployee.txt");
  }
}
