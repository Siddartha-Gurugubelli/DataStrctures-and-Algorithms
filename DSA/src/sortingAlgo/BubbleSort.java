package sortingAlgo;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,6,2,8,12,1,5};
		
		int[] result = bubbleSort(arr);
		for(int element:result) {
			System.out.print(element+",");
		}

	}

	public static int[] bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
