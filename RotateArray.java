public class RotateArray {
    static void rotate(int[] nums, int k) {
        k = k%nums.length;

        if(k<0){
            k = nums.length + k;
        }
        //1st part reverse
        reverse(nums, 0 , nums.length-k-1);

        //2nd part reverse
        reverse(nums, nums.length - k, nums.length-1);

        //reverse the entire array
        reverse(nums, 0, nums.length-1);

        for(int elem: nums){
            System.out.print(elem+" ");
        }
    }

    static void reverse(int arr[], int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        int rotations = 3;
        rotate(nums, rotations);
    }
}
