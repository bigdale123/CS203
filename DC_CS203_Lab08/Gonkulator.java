public class Gonkulator {
	private int num;

	/**
	 * This class Gonkulates stuff.
	 * @param takes an integer
	 */
	public Gonkulator(int _num) {
		this.num = _num;
	}

	public int getNum() {
		return this.num;
	}
	public void setNum(int _num) {
		this.num = _num;
	}

	/**
	 * This method adds five to the instance variable num
	 */
	public void addFive() {
		int tempVariable = this.getNum();
		for(int i = 0; i < 5; i++) {
			tempVariable = tempVariable + 1;
		}
		this.setNum(tempVariable);

	} // end addSeven

	/**
	 * This method determines whether or not the instance variable is even
	 * @return boolean: true if the instance variable is even, false otherwise
	 */
	public boolean isItEven() {
		boolean isItEven = false;
		int tempVariable = this.getNum();
		int remainder = tempVariable % 2;
		if(remainder == 0) {
			// if there is no remainder, the number is divisible by 2, so it's even
			isItEven = true;
		}

		return isItEven;
	}  // end isItEven method

	/**
	 * this method returns a String to represent this object
	 * It is called when we ask to print the object, e.g. System.out.println(<object>);
	 * @return String to represent object: a short statement and the object's
	 * instance variable (num)
	 */
	public String toString() {
		return "My Gonkulator's value is " + this.getNum();
	}

} // end class
