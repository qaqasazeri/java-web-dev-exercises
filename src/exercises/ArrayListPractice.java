package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(45);
        numbers.add(90);
        numbers.add(84);
        numbers.add(58);
        numbers.add(33);
        numbers.add(78);
        numbers.add(41);
        numbers.add(8);
        numbers.add(23);

        System.out.print(Sum(numbers));

    }

    public static int Sum(ArrayList<Integer> nums) {
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        return sum;
    }
}
