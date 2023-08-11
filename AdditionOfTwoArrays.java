public class AdditionOFTwoArrays {
    static void arraySum(int a[], int b[]){
        int m = a.length;
        int n = b.length;
        int carry=0;
        int i=m-1;
        int j=n-1;
        int k=Math.max(m,n);
        int sum[] = new int[k+1];
        
        while(i>=0 || j>=0){
            int ans=0;
            if(i>=0 && j>=0){
                ans = a[i] + b[j] + carry;
                int temp = ans/10;
                sum[k] = ans%10;
                if(temp==0){
                    carry=0;
                }
                else{
                    carry=1;
                }
                i--;
                j--;
                k--;
            }

            else if(i>=0){
                ans = a[i] + carry;
                int temp = ans/10;
                sum[k] = ans%10;
                if(temp==0){
                    carry=0;
                }
                else{
                    carry=1;
                }
                i--;
                k--;
            }

            else{
                ans = b[j] + carry;
                int temp = ans/10;
                sum[k] = ans%10;
                if(temp==0){
                    carry=0;
                }
                else{
                    carry=1;
                }
                j--;
                k--;
            }
        }
        sum[k]=carry;

        for(int elem: sum){
            System.out.print(elem+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = {9,9,9,9};
        int b[] = {9,9,9,9};
        arraySum(a,b);
    }
}
