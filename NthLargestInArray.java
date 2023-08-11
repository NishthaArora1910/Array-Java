import java.util.*;
public class NthLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {7,20,15,90,5,100};
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        Arrays.sort(arr);
        int nthLargest = arr[n-1];
        System.out.println("Nth Largest Element in the array is: "+nthLargest);
        sc.close();
    }
}
