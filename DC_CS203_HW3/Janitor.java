public class Janitor extends Employee{
  private String department;
  private String sweeping;

  // Janitor(String name, int blazerId, String department, String sweeping): Contstructs a Janitor object using given inputs.
  // Input: a string representing a name, an Integer representing a blazerId, a String representing a department, and a String representing if the janitor is sweeping
  // no outputs
  public Janitor(String name, int blazerId, String department, String sweeping){
    super(name,blazerId);
    this.department = department;
    this.sweeping = sweeping;
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
  // getSweeping(): Gets the value of sweeping
  // no inputs
  // returns this.sweeping
  public String getSweeping(){
    return this.sweeping;
  }
  // setSweeping(String sweeping): Sets the value of sweeping
  // inputs: A string representing the value of sweeping
  // no outputs
  public void setSweeping(String sweeping){
    this.sweeping = sweeping;
  }

  // ToString(): Returns attributes of the class in string form
  // No inputs
  // returns a formatted string containing values from the class
  public String toString(){
    return "Name: "+super.getName()+"    BlazerId: "+super.getBlazerId()+"    Department: "+getDepartment()+"    Talking: "+getSweeping();
  }
}
