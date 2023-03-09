public class SecondHighest {
    public static int secondHigh(int[] arr){
        int mx1=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>mx1){
                mx1=arr[i];
            }
        }
        int mx2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mx1 && arr[i]>mx2){
                mx2=arr[i];
            }

        }
        return mx2;
    }

    public static void main(String[] args) {
int arr[]={1,2,3,4,5};
 System.out.println("the second highest in array is "+secondHigh(arr));
    }
}
