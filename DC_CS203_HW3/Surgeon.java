public class Surgeon extends Employee{
  private String department;
  private String operating;

  //Constructor(s)
  // Surgeon(String name, int blazerId, String department, String Operating): Contstructs a Surgeon object using given inputs.
  // Input: a string representing a name, an Integer representing a blazerId, a String representing a department, and a String representing if the surgeon is Operating
  // no outputs
  public Surgeon(String name, int blazerId, String department, String Operating){
    super(name,blazerId);
    this.department = department;
    this.operating = Operating;
  }

  // getter-setter

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
  // getOperating(): Gets the value of operating
  // no inputs
  // returns this.operating
  public String getOperating(){
    return this.operating;
  }
  // setOperating(String operating): Sets the value of operating
  // inputs: A string representing the value of operating
  // no outputs
  public void setOperating(String operating){
    this.operating = operating;
  }

  // ToString(): Returns attributes of the class in string form
  // No inputs
  // returns a formatted string containing values from the class
  public String toString(){
    return "Name: "+super.getName()+"    BlazerId: "+super.getBlazerId()+"    Department: "+getDepartment()+"    Operating: "+getOperating();
  }
}
