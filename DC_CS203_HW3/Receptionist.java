public class Receptionist extends Employee{
  private String department;
  private String talking;

  //Constructor(s)
  // Receptionist(String name, int blazerId, String department, String talking): Contstructs a Receptionist object using given inputs.
  // Input: a string representing a name, an Integer representing a blazerId, a String representing a department, and a String representing if the Receptionist is talking
  // no outputs
  public Receptionist(String name, int blazerId, String department, String talking){
    super(name,blazerId);
    this.department = department;
    this.talking = talking;
  }

  // getDepartment(): returns the value of department
  // No inputs
  // returns this.department
  public String getDepartment(){
    return this.department;
  }
  // setDepartment(String department): Sets the value of department
  // inputs: A string representing the department
  // No outputs
  public void setDepartment(String department){
    this.department = department;
  }
  // getTalking(): Gets the value of talking
  // no inputs
  // returns this.talking
  public String getTalking(){
    return this.talking;
  }
  // setTalking(String talking): Sets the value of talking
  // inputs: A string representing the value of talking
  // no outputs
  public void setTalking(String talking){
    this.talking = talking;
  }

  // ToString(): Returns attributes of the class in string form
  // No inputs
  // returns a formatted string containing values from the class
  public String toString(){
    return "Name: "+super.getName()+"    BlazerId: "+super.getBlazerId()+"    Department: "+getDepartment()+"    Talking: "+getTalking();
  }
}
