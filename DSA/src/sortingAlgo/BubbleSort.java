package sortingAlgo;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {10,6,2,8,12,1,5};

		int[] result = bubbleSort(arr);
		for(int element: result) {
			System.out.print(element + ",");
		}
	}

	// BubbleSort
	public static int[] bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
		return arr;
	}

	// Swap function
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
