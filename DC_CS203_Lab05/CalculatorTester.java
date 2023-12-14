import java.util.Scanner;                                    // imports the scanner library
public class CalculatorTester {                              // creates the class CalculatorTester
	public static void main(String[] args){                    // creates the main method for the CalculatorTester class
    // ask user to enter two numbers
		Scanner myObj = new Scanner(System.in);                  // creates a scanner object used to get user input
		System.out.println("Please enter two numbers.");         // prints the prompt explaining what the user has to type in
		System.out.print(" Num 1:  ");                           // prints the prompt for the user to input n
    int n = myObj.nextInt();                                 // stores the user input into variable n
		System.out.print(" Num 2:  ");                           // prints the prompt for the user to input n2
    int n2 = myObj.nextInt();                                // stores the user input into variable n2

		// creates a calculator object
		Calculator c = new Calculator(n,n2);
		// invoke the methods and print the results
		System.out.println(c.get_first_number());                //prints the first number in Calculator object
		System.out.println(c.get_second_number());               //prints the seconds number in Calculator object
		System.out.println();                                    //prints an empty line
		System.out.println(c.add());                             //prints the addition of a and b
		System.out.println(c.sub());                             //prints the difference of a and b
		System.out.println(c.mult());                            //prints the product of a and b
		System.out.println(c.div());                             //prints the quotient of a and b
		System.out.println();                       						 //prints an empty line
		ScientificCalculator s = new ScientificCalculator(n,n2); //creates ScientificCalculator object
		System.out.println(s.exponent());                        //prints the first integer raised to the second integer
		System.out.println(s.sqrt());                            //prints the square root of the first integer
	}

}
