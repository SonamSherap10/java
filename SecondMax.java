public class SecondMax {
    public static int FindSecMax (int arr[] ) {
        int max = 0;
        int secMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        return secMax;
    }


    public static void main(String[] args) {
        int[] number = {28, 54, 82, 29, 69, 26, 25,82};
        System.out.print(FindSecMax(number));
    }

}
