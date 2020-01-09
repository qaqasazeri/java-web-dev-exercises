package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 5, 8};
        String word = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

        //printing all numbers
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        //printing odd numbers
        System.out.println();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0)
                System.out.print(nums[i]);
        }

        System.out.println();
//Splitting word with space

        String arr[] = word.split("\\s+");

        System.out.println(arr[0]);


        System.out.println(Arrays.toString(arr));

    }
}
