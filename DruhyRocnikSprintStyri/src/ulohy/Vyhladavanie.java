package ulohy;

public class Vyhladavanie {
    public static int binarySearch(int[]  array, int leftIndex, int rightIndex, int value){
        if(leftIndex == rightIndex && array[leftIndex] != value) return -1;

        int middleIndex = leftIndex + (rightIndex - leftIndex)/2;
        if(array[middleIndex] == value) return middleIndex;
        else if(array[middleIndex] > value)
            return binarySearch(array, middleIndex + 1, rightIndex, value);
        else return binarySearch(array, leftIndex, Math.max(leftIndex, middleIndex - 1), value);
    }

    public static int linearSearch(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value) return i;
        }
        return -1;
    }
}
