import java.lang.Math; // imports the math library

public class ScientificCalculator extends Calculator{   //Creates the ScientificCalculator class which is a child of the Calculator class
	//Define the Constructor
	public ScientificCalculator(int a, int b){   //creates the constuctor for ScientificCalculator class
		super(a,b); // initializa the Calculator class for use in the ScientificCalculator class
	}
	// exponent() Method:
	//   Using the two integer numbers specified after creating a ScientificCalculator object, it raises the first integer
	//   To a power defined by the second integer.
	//
	// Example:
	//   ScientificCalculator s = new ScientificCalculator(4,4);
	//   s.exponent();
	//
	// Returns:
	//   256
	public int exponent(){  // creates the exponent method
		int exp = 1;    // creates variable exp that has an initial value of 1
		Math.pow(super.get_first_number(),super.get_second_number())  // Uses the math library to raise the first number to the second number
		return exp;  // return the result
	}
	// sqrt() Method:
	//   Using the two integer numbers specified after creating a ScientificCalculator object, it takes the square root of the first integer
	//
	// Example:
	//   ScientificCalculator s = new ScientificCalculator(4,4);
	//   s.sqrt();
	//
	// Returns:
	//   2 (double)
	public double sqrt(){ // Creates the method for square roots
		return	Math.sqrt(super.get_first_number()); // returns the square root of the first number
	}
}


// Add two methods that calculate the exponent of x^y and square root of x and y
