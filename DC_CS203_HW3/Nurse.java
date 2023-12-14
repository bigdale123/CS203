public class Nurse extends Employee{
  private int patients;

  // Nurse(String name, int blazerId, int patients: Contstructs a Nurse object using given inputs.
  // Input: a string representing a name, an Integer representing a blazerId, a String representing a department, and a int representing the number of patients
  // no outputs
  public Nurse(String name, int blazerId, int patients){
    super(name,blazerId);
    this.patients = patients;
  }

  // getPatients(): returns the value of patients
  // no inputs
  // returns patients
  public String getPatients(){
    return String.valueOf(this.patients);
  }
  // setPatients(int Patients): sets the value of Patients
  // input: an integer representing the number of Patients
  // no output
  public void setPatients(int Patients){
    this.patients = Patients;
  }

  // ToString(): Returns attributes of the class in string form
  // No inputs
  // returns a formatted string containing values from the class
  public String toString(){
    return "Name: "+super.getName()+"    BlazerId: "+super.getBlazerId()+"    Patients: "+getPatients();
  }
}
