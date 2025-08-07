import java.util.Arrays;

public class DSA7leftRotaK{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
    int d=2;
int n=arr.length;    

 for(int i=0;i<d;i++){
    int temp=arr[0];

    for(int j=1;j<n;j++){
        arr[j-1]=arr[j];
    }
    arr[n-1]=temp;
 }
System.out.println(Arrays.toString(arr));


}

}