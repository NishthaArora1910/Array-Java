public class ThirdLargestInArray {
    public static void main(String[] args) {
        int arr[] = {300,7,20,15,90,5,100};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        int n = arr.length;
        if(n<3){
            System.out.println("Array too small!");
        }

        for(int i=0;i<n;i++){
            if(arr[i]>firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i]>secondLargest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
        }
        System.out.println("First Largest: "+firstLargest);
        System.out.println("Second Largest: "+secondLargest);
        System.out.println("Third Largest: "+thirdLargest);
    } 
}
