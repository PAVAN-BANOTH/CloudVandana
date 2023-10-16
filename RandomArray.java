package in.pspk;


import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int aL = arr.length;
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = rand.nextInt(aL);


            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

