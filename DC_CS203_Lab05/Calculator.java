public class Calculator {  // Creates the calculator class
	// instance variables
	private int num1, num2; //Initializes the variables num1 and num2 for private use in the Calculator class

// setting the values of two numbers
	/**
	 * This is the Constructor for the Calculator class.
	 * The Calculator class takes two integers. The class
	 *   provides methods to add, subtract, multiply, and divide these two integers.
	 * param a an int representing the first number
	 * param b an int representing the second number
	 */
	public Calculator(int a, int b){ // creates constructor method Calculator
		this.num1 = a;    // stores input a as private variable num1
		this.num2 = b;    // stores input b as private variable num2
	}
	public int get_first_number(){  //creates method for getting value of first number, num1
		return this.num1; //returns value of num1
	}
	public int get_second_number(){ //creates method for getting value of second number, num2
		return this.num2;  // returns value of num2
	}
	public int add(){  //creates method for adding numbers
		return this.num1+this.num2;  // returns the sum of num1 and num2
	}
	public int sub(){  // creates method for subtracting numbers
		return this.num1-this.num2;  // returns difference between num1 and num2
	}
	public int mult(){ // creates method for multiplying numbers
		return this.num1*this.num2; // returns product of num1 and num2
	}
	public int div(){ // creates method for dividing numbers
		return this.num1/this.num2;  // returns quotient of num1 and num2
	}

}
