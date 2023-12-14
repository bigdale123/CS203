public class Doctor extends Employee{
  private String specialty;

  // Doctor(String name, int blazerId, string Specialty): Contstructs a Doctor object using given inputs.
  // Input: a string representing a name, an Integer representing a blazerId, and a string representing specialty
  // no outputs
  public Doctor(String name, int blazerId, String specialty){
    super(name,blazerId);
    this.specialty = specialty;
  }

  // getSpecialty(): returns the value of specialty
  // no inputs
  // returns this.specialty
  public String getSpecialty(){
    return this.specialty;
  }
  // setPatients(int Patients): sets the value of specialty
  // input: a string representing the specialty
  // no output
  public void setSpecialty(String specialty){
    this.specialty = specialty;
  }

  // ToString(): Returns attributes of the class in string form
  // No inputs
  // returns a formatted string containing values from the class
  public String toString(){
    return "Name: "+super.getName()+"    BlazerId: "+super.getBlazerId()+"    Specialty: "+getSpecialty();
  }
}
