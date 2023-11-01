package q2;

public class Tester {
	public static <T extends Number> double min(T[] arr){
		double minVal = Double.MAX_VALUE;
		
		for(T ele : arr) {
			
			if(ele.doubleValue() < minVal) {
				minVal = ele.doubleValue();
			}
		}
		return minVal;
		
	}
	
	public static void main(String[] args) {
		
//		String[] arr1 = new String[] { "A", "B", "C", "D" };
//		Tester.min(arr1); //generic type is inferred = String
		// Will not work....
		
		Double[] arr2 = new Double[] { 1.1, 2.2,0.1, 3.3, 4.4 };
		System.out.println(Tester.min(arr2)); //generic type is inferred = Double
		
		Integer[] arr3 = new Integer[] { 11, 22, 33, 44 };
		System.out.println(Tester.min(arr3)); //generic type is 
		
//		int[] arr = { 10, 20, 30, 40 };
//		min(arr); // In Java, generics cannot be used with primitive types
		
	}
}
