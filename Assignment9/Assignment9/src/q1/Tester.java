package q1;

import java.util.Comparator;
import java.util.Arrays;

class MyOwnComparator implements Comparator<Double>{
	public int compare(Double o1, Double o2) {
		int diff = o1.compareTo(o2);
		return diff;
	};
}

public class Tester {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Double[] arr = {2.2,5.3,2.1,6.3,6.2,7.8};
//		Arrays.sort(arr);
		Tester.selectionSort(arr, new MyOwnComparator());
		for(Double i: arr)
			System.out.println(i);
	}
}
