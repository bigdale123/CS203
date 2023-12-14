public class Administrator extends Employee{
  private String department;

  // Administrator(String name, int blazerId, String department): Contstructs a Administrator object using given inputs.
  // Input: a string representing a name, an Integer representing a blazerId, and a String representing a department
  // no outputs
  public Administrator(String name, int blazerId, String department){
    super(name,blazerId);
    this.department = department;
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

  // ToString(): Returns attributes of the class in string form
  // No inputs
  // returns a formatted string containing values from the class
  public String toString(){
    return "Name: "+super.getName()+"    BlazerId: "+super.getBlazerId()+"    Department: "+getDepartment();
  }
}
