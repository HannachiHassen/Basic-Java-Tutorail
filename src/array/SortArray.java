package array;

public final class SortArray {

	public static void main(String[] args) {
		int i;
		int arr[] = { 25, 49, -12, 58, 104, -92, -3, 20, 83, 121 };
		
		sortingArray(arr, arr.length); // Calling user defined method
		System.out.println("Array after storing:");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void sortingArray(int arr[], int x) {
		for (int i = 1; i < x; i++) {
			int j = i;
			int y = arr[i];
			while ((j > 0) && (arr[j - 1] > y)) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = y;
		}
	}
}
