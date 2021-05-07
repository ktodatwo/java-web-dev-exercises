package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {

    public static void main(String[] args) {

         HashMap<Character, Integer> charCounter = new HashMap<>();
        char letter;
        Scanner input = new Scanner(System.in);
        String testString;

        System.out.print("Enter sentence to count characters: ");
        testString = input.nextLine();
        input.close();

        char[] charactersInString = testString.toCharArray();

        //loop through text
        for(int i = 0; i < charactersInString.length; i++) {
            letter = charactersInString[i];

            //if key does exist in map
            if (charCounter.containsKey(letter) == true) {
                    int newCount = charCounter.get(letter)+1;
                    charCounter.put(letter, newCount);
            }

            //if  key doesn't exist in map
           else if (charCounter.containsKey(letter) == false) {
                charCounter.put(letter, 1);
            }

        } //<--  loop through text

        //print results
        for (Map.Entry<Character, Integer> characterInList : charCounter.entrySet()) {
            System.out.println((characterInList.getKey()) + ": " + characterInList.getValue());
        }

    }


}
