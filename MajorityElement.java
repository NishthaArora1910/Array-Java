import java.util.Arrays;
public class MajorityElement {
    static int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
    
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println("Majority Element is: " +majorityElement(nums));
    }
}
