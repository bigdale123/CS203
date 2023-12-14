// Class: Student
// Class that represents a student,and has a name, exam grades, and a final and letter grade associated with it that can be accessed using setter-getter methods.
// Creating a Strudent object:
//    Student a = new Student(Full Name, Exam 1 Grade, Exam 2 Grade, Final Exam Grade);
// Available Methods:
//  - setFinalGrade()
//  - getFinalGrade()
//  - setLetterGrade()
//  - getLetterGrade()

public class Student{
	// Instance Variable initialization
	private String name;
	private String lastName;
	private int exam1, exam2, finalExam;
	private double finalGrade;
	private String letterGrade;

  // Constructor Class for Student
	// Used to initialize a Student object, using a string that is the student's full name,
	//    an integer that is the first exam grade, an integer that is the second exam grade,
	//    and an integer that represents the final exam grade.
	// @param: String fullname, int exam1, int exam2, int finalExam
	// Nothing expected to be returned
	public Student(String fullname, int exam1, int exam2, int finalExam){
		this.exam1 = exam1;
		this.exam2 = exam2;
		this.finalExam = finalExam;
		String[] firstmiddlelast = fullname.split(" ");
		this.name = firstmiddlelast[0];
		this.lastName = firstmiddlelast[firstmiddlelast.length-1];
	}
	// setFinalGrade Method
	// Called on a Student object to calculate the student's final grade using the
	// 		grades provided at the object's construction.
	// No input parameters needed
	// No return value expected
	public void setFinalGrade(){
		// Had to convert ot double to get right answer, used this: https://www.javatpoint.com/java-int-to-double
		this.finalGrade = (25*Double.valueOf(this.exam1)+25*Double.valueOf(this.exam2)+50*Double.valueOf(this.finalExam))/100;
	}
	// getFinalGrade Method
	// Called on a Student object to get the student's final grade, which should have
	//		been calculated previously.
	// No input parameters needed
	// @return: Double value representing student's final grade
	public Double getFinalGrade(){
		return this.finalGrade;
	}
	// setLetterGrade Method
	// Called on a Student object to calculate the student's letter grade using the
	// 		final grade calculated previously.
	// No input parameters needed
	// No return value expected
	public void setLetterGrade(){
		if (this.finalGrade >= 90){
			this.letterGrade = "A";
		}
		else if (this.finalGrade < 90 && this.finalGrade >= 80){
			this.letterGrade = "B";
		}
		else if (this.finalGrade < 80 && this.finalGrade >= 70){
			this.letterGrade = "C";
		}
		else{
			this.letterGrade = "F";
		}
	}
	// getFinalGrade Method
	// Called on a Student object to get the student's letter grade, which should have
	//		been calculated previously.
	// No input parameters needed
	// @return: String value representing student's letter grade
	public String getLetterGrade(){
		return this.letterGrade;
	}

}
