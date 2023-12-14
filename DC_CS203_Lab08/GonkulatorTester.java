public class GonkulatorTester {

	public static void main(String[] args) {
		int x = 6;
		Gonkulator myGonk = new Gonkulator(x);

		System.out.println("Initial Gonkulator object");
		System.out.println(myGonk);

		System.out.println();
		System.out.println("calling addFive (should be 5+5=10)"); //Changed addSeven to addFive
		myGonk.addFive();
		System.out.println(myGonk);

		System.out.println();
		System.out.println("calling isItEven");
		System.out.println("based on current value of num: " + myGonk.getNum());
		System.out.printf("Expected value: %s \n", (myGonk.getNum()%2==0) ? true : false);
		System.out.println("Calculated: " + myGonk.isItEven());


	} // end main

} // end class
