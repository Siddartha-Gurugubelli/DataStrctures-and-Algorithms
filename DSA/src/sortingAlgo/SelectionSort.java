package sortingAlgo;

public class SelectionSort {
    public static void main(String[] args){
        int [] nums = {10, 7, 9, 12, 4, 8, 11};
        int [] result = selectionSort(nums);
        for(int num:result){
            System.out.print(num+ " ");
        }
    }

    public static int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }
}
