public class DSA3checkSortEle {
    public static void main(String[] args) {
        int arr[]={-2,-1,0,1,2};
     boolean isSorted=true;

         for(int i=0;i<arr.length-1;i++){   /* arr.length  arr[i]<arr[i-1] also can be used  */
            if(arr[i]>arr[i+1]){
             isSorted= false;
                break;
            }

         }
         if(isSorted){
            System.out.println("true");
         }
         else{
            System.out.println("false");
         }
    }
    
}
