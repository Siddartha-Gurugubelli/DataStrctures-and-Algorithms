package searchingAlgo;

public class Searching {

	public static void main(String[] args) {
		
		int [] arr = {5, 7,12,16,22,27};
		int target = 12;
		int liResult = linearSearch(arr, target);
		int biResult = binarySearch(arr, target);
		int biRecResult = binaryRecursiveSearch(arr, target, 0, arr.length-1);
		
		if(liResult!=-1)
			System.out.println("Linear Search " + liResult);
		else
			System.out.println("Element not found");
		if(biResult!=-1)
			System.out.println("Binary Search " + liResult);
		else
			System.out.println("Element not found");
		if(biRecResult!=-1)
			System.out.println("Binary Recursive Search " + liResult);
		else
			System.out.println("Element not found");
		//comment
		

	}

	public static int linearSearch(int[] arr, int target) {
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==target)
				return i;
		}
		
		return -1;
	}

	public static int binarySearch(int[] arr, int target) {
		
		int first = 0;
		int last = arr.length -1;
		while(first<=last) {
			int mid = (first+last)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(mid<target) {
				first = mid+1;
			}
			else if(mid>target) {
				last =mid -1;
			}
		}
		
		return -1;
	}

	public static int binaryRecursiveSearch(int[] arr, int target, int first, int last) {
		int mid = (first+last)/2;
		if(arr[mid]==target) {
			return mid;
		}
		else if(mid<target) {
			return binaryRecursiveSearch(arr, target, mid+1, last);
		}
		else if(mid>target) {
			return binaryRecursiveSearch(arr, target, first, mid-1);
		}
		
		return -1;
	}

	

}
