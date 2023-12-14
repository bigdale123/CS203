/**
 * This is class contains methods to compute area of different shapes.
 * @author
 */
public class Area {


	/**
	 * This method computes the area of a circle
	 * @param r, the radius of a circle, a double
	 * @return the value of the area of circle
	 */
	public  double circleArea (double r){
		return Math.PI * r * r;
	}

	/**
	 * This method computes the area of a triangle
	 * @param b, h : doubles to represent the base (b) and height (h) of the triangle
	 * @return the value of the area of triangle
	 */
	public double triangleArea (double b, double h){
		return 0.5*b*h; // added code to calculate and return area of triangle
	}


	/**
	 * This method computes the area of a square
	 * @param l : double to represent the length of one side of the square
	 * @return the value of the area of square
	 */
	public double squareArea (double l){
		return l*l; // added code to calculate and return area of square
	}

	/**
	 * This method computes the area of a rectangle
	 * @param l, w : doubles to represent the length (l) and width (w) of a rectangle
	 * @return the value of the area of rectangle
	 */
	public double rectangleArea (double l, double w){
		return l*w; //added code to calculate and return area of rectangle
	}


}
