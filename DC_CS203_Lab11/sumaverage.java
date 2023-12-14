package dylcal13_Lab11;

public class sumaverage{
	public interface Measurable{
		double getMeasure();
	}
	
	public static <T extends Number> Pair<Double,Double> sumavg(T[] array){
		double sum = 0;
		double average = 0;
		
		for (T element: array) {
			sum += element.doubleValue();
			average += element.doubleValue();
		}
		average /= array.length;
		
		Pair<Double, Double> ret_pair = new Pair<Double,Double>(sum,average);
		return ret_pair;
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,3,2,1};
		Double[] floatArray = {1.2,2.2,3.1428};
		
		System.out.println("intArray");
		System.out.println("  Max: "+sumavg(intArray).getKey());
		System.out.println("  Min: "+sumavg(intArray).getValue());
		
		System.out.println("floatArray");
		System.out.println("  Max: "+sumavg(floatArray).getKey());
		System.out.println("  Min: "+sumavg(floatArray).getValue());
		
	}
}