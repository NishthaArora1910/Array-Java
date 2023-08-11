public class DutchNationalFlagProblem {
    static void dnf(int arr[], int n){
        int low =0;
        int high = n-1;
        int mid = 0;
        int temp =0;
        while(mid<=high){
            if(arr[mid]==0){
                //if arr[i]=0
                //swap arr[low] & arr[mid]
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                //if arr[i] =2
                //swap arr[mid] & arr[high]
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,0,1,2};
        dnf(arr, arr.length);
    }
}
