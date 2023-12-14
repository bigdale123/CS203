package dylcal13_Lab11;

public class minmax{
	public static <T extends Comparable<T>> Pair<T,T> pair(T[] array){
		T max = array[0];
		T min = array[0];
		
		for (T element: array) {
			if (element.compareTo(min)<0) {
				min = element;
			}
			if (element.compareTo(max)>0) {
				max = element;
			}
		}
		
		Pair<T,T> ret_pair = new Pair<T, T>(max,min);
		return ret_pair;
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,3,2,1};
		Double[] floatArray = {1.2,2.2,3.1428};
		String[] stringArray = {"Hey","cool", "guy"}; // Believe it or not, Capital H has a lower unicode value that lower case c, making it the minimum value. Go figure!
		
		System.out.println("intArray");
		System.out.println("  Max: "+pair(intArray).getKey());
		System.out.println("  Min: "+pair(intArray).getValue());
		
		System.out.println("floatArray");
		System.out.println("  Max: "+pair(floatArray).getKey());
		System.out.println("  Min: "+pair(floatArray).getValue());
		
		System.out.println("stringArray");
		System.out.println("  Max: "+pair(stringArray).getKey());
		System.out.println("  Min: "+pair(stringArray).getValue());
	}
}