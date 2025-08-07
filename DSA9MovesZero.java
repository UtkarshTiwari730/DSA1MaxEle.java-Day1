import java.util.Arrays;

public class DSA9MovesZero {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,4,5,6,0,8,7  } ;
        int []temp=new int[arr.length];
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                temp[i++]=arr[j];

            }
        }
        System.out.println(Arrays.toString(temp));
        
        }
    
}
