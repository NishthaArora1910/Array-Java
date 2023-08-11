public class MissingNumber {
    static int missingNumber(int array[], int n) {
        // Your Code Here
        int arrSum=0;
        int sum = (n+1)*(n+2)/2;
        for(int i=0;i<n;i++){
            arrSum += array[i];
        }
        return sum-arrSum;
        
    }

    public static void main(String args[]){
        int arr[] = {6,1,2,8,3,4,7,10,5};
        System.out.println("Missing number is: "+missingNumber(arr, arr.length));
    }
}
