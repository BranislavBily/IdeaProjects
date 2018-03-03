package ulohy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie6HladanieAleCharVStringu {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        System.out.print("Input your sentence: ");
        String sentence = br.readLine();
        char letters[] = sentence.toCharArray();
        System.out.print("Input char you are looking for: ");
        char yearnedLetter = br.readLine().charAt(0);
        int indexOfBinarySearch = binarySearch(letters, 0, letters.length, yearnedLetter);
        if(indexOfBinarySearch == -1) {
            indexOfBinarySearch = imAGenius(letters,0, letters.length, yearnedLetter);
        }
        int indexOfOfLinearSearch = linearSearch(letters, yearnedLetter);
        System.out.println("Char H was found by Binary Search on index "+indexOfBinarySearch+", Linear Search on index "+indexOfOfLinearSearch);
    }

    public static int binarySearch(char[] array, int leftIndex, int rightIndex, char value){
        if(leftIndex == rightIndex && array[leftIndex] != value) {
            return -1;
        }
        int middleIndex = leftIndex + (rightIndex - leftIndex)/2;
        if(array[middleIndex] == value) {
            return middleIndex;
        } else if(array[middleIndex] > value) {
            return binarySearch(array, middleIndex + 1, rightIndex, value);
        } else {
            return binarySearch(array, leftIndex, Math.max(leftIndex, middleIndex - 1), value);
        }
    }
    //TODO Zoradenie pola aby binarne vyhladavanie preslo spravne
    public static int imAGenius(char[] array, int leftIndex, int rightIndex, char value){
        if(leftIndex == rightIndex && array[leftIndex] != value) {
            return -1;
        }
        int middleIndex = leftIndex + (rightIndex - leftIndex)/2;
        if(array[middleIndex] == value) {
            return middleIndex;
        }
        else if(array[middleIndex] < value) {
            return imAGenius(array, middleIndex + 1, rightIndex, value);
        } else {
            return imAGenius(array, leftIndex, Math.max(leftIndex, middleIndex - 1), value);
        }
    }

    public static int linearSearch(char[] array, char value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value) return i;
        }
        return -1;
    }
}
