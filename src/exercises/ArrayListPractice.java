package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

   /* ArrayList<Integer> nums = new ArrayList<>();

    nums.add(3);
    nums.add(7);
    nums.add(2);
    nums.add(9);
    nums.add(6);
    nums.add(1);
    nums.add(1);
    nums.add(8);
    nums.add(4);
    nums.add(2);

    System.out.println(sumEven(nums));
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;*/

        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        words.add("ducks");
        words.add("bee");
        words.add("goats");

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        System.out.println(lengthCheck(words, numChars));
    }

    public static String lengthCheck(ArrayList<String> arr, int length) {

        ArrayList<String> selectedWords = new ArrayList<>();

        for (int i = 0 ; i < arr.size(); i++) {
            String testWord = arr.get(i);
            if (testWord.length() == length) {
                selectedWords.add(testWord);
            }
        }

        return String.valueOf(selectedWords);
    }




}
