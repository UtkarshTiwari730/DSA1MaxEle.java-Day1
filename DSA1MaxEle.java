public class DSA1MaxEle {
    public static void main(String[]args){
        int arr[]={-2,12,5,9,7,6};
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}

