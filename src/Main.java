import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] { 7, 2, 3, 5, 4, 9 };
		int[] arr2 = new int[] { 4, 5, 6, 1, 10, 2 };

		int[] arr3 = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr3.length; i++) {
			
			if (hash.containsKey(arr3[i]) && hash.get(arr3[i]) == 0) {
				
				System.out.println(arr3[i]);
				hash.put(arr3[i], 1);
			
			} else {
				
				hash.put(arr3[i], 0);
			
			}
		}
	}

}
