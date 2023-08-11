public class SubtractionOfTwoArrays {
    static void arrayDiff(int a[], int b[]){
        int m = a.length;
        int n = b.length;
        int i=m-1;
        int j=n-1;
        int k = Math.max(m,n);
        int diff[] = new int[k];
        k = k-1;
        int borrow =0;
        int temp=0;
        while(i>=0 || j>=0){
            int ans =0;
            if(i>=0 && j>=0){
                ans = a[i] - b[j] -borrow;
                if(ans<0){
                    borrow=1;
                }
                else{
                    borrow=0;
                }
                if(ans>=0){
                    temp = ans;
                }
                else{
                    temp = ans+10;
                }
                diff[k] = temp;
                i--;
                j--;
                k--;
            }

            else if(i>=0){
                ans = a[i] -b[j] -borrow;
                if(ans<0){
                    borrow=1;
                }
                if(ans>=0){
                    temp = ans;
                }
                else{
                    temp = ans+10;
                }
                diff[k] = temp;
                i--;
                k--;
            }

            else{
                ans = a[i] - b[j] -borrow;
                if(ans<0){
                    borrow=1;
                }
                if(ans>=0){
                    temp = ans;
                }
                else{
                    temp = ans +10;
                }
                diff[k] = temp;
                j--;
                k--;
            }
        }

        for(int elem: diff){
            System.out.print(elem+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = {4,5,6,7};
        int b[] = {1,2,3,9};
        arrayDiff(a,b);
    }
}
