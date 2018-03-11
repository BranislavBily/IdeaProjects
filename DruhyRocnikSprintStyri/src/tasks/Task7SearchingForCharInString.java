package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 03.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Task7SearchingForCharInString {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        System.out.print("Input your sentence: ");
        String sentence = br.readLine();
        char letters[] = sentence.toCharArray();
        System.out.print("Input char you are looking for: ");
        char yearnedLetter = br.readLine().charAt(0);
        dealingWithSearch(letters, yearnedLetter);
    }

    public static void dealingWithSearch(char[] letters, char yearnedLetter){
        char[] helper = assigningValues(letters);
        helper = Sort.quickSortChar(helper, 0, helper.length -1);
        int indexInSortedArray = Search.binarySearchChar(helper, 0, helper.length - 1, yearnedLetter);
        int indexOfBinarySearch = Search.linearSearchChar(letters, helper[indexInSortedArray]);
        int indexOfOfLinearSearch = linearSearch(letters, yearnedLetter);
        System.out.println("Char "+yearnedLetter+" was found by Binary Search on index "+indexOfBinarySearch+", Linear Search on index "+indexOfOfLinearSearch);
    }

    public static char[] assigningValues(char[] letters) {
        char[] helper = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            helper[i] = letters[i];
        }
        return helper;
    }

    public static int linearSearch(char[] array, char value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value) return i;
        }
        return -1;
    }
}
