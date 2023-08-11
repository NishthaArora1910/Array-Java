public class ZigZagArray {
    static void zigzag(int arr[], int n){
        boolean flag=true;
        int temp = 0;
        for(int i=0;i<=n-2;i++){
            if(flag){
                // "<" operation
                if(arr[i]>arr[i+1]){
                    //swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

            else{
                //">" operation
                if(arr[i]<arr[i+1]){
                    //swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag; //flip the flage
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,7,8,6,2,1};
        int n = arr.length;
        zigzag(arr, n);
    }
}
