public class reversearray {
public static void PrintArray(int [] arr){
    System.out.println("the array is : " );
    for (int i=0; i< arr.length ; i++){
        System.out.print(" " + arr[i]);
    }
}

public static void ReverseArray(int[] arr , int start , int end ){

    while(start<end) {
       int temp = arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
       start++;
       end--;
    }
}


     public static void main(String[] args) {
         int[] number = {1, 2, 3, 4, 5, 6, 7,8};
         PrintArray(number);
         ReverseArray(number, 0, number.length-1);
         System.out.println();
         PrintArray(number);

     }
 }