/*
 * Variant 4
 * Create an array of numbers that consists of 150 elements. The contents of the array generate with Random#nextInt.
 * Implement five types of data sorts: bubble sort, cocktail sort, quick sort, cycle sort, odd-even sort;
 * Use two libraries to sort the data.
 * Three times perform each of the sorts, including sorts with libraries, with the working time measurement of each of them.
 * Gather the performance (resources and time) metrics of your sorting and libraries sorting.
 * The time for working of the each sort is output to the console.
 */


import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int[] originalArray = new int[150];
        int[] sortArray = new int[150];
        Random random = new Random();
        for (int i = 0; i < 150; i++) originalArray[i] = random.nextInt() % 100;
        long start,end;
        for (byte i = 0; i < 3; i++) {
            System.arraycopy(originalArray, 0, sortArray, 0, 150);
            start = System.nanoTime();
            Sorts.BubbleSort(sortArray);
            end = System.nanoTime();
            System.out.println("Bubble Sort " + (i + 1) + ", time: " + (end - start));
        }

        for (byte i = 0; i < 3; i++) {
            System.arraycopy(originalArray, 0, sortArray, 0, 150);
            start = System.nanoTime();
            Sorts.CocktailSort(sortArray);
            end = System.nanoTime();
            System.out.println("Cocktail Sort " + (i + 1) + ", time: " + (end - start));
        }

        for (byte i = 0; i < 3; i++) {
            System.arraycopy(originalArray, 0, sortArray, 0, 150);
            start = System.nanoTime();
            Sorts.QuickSort(sortArray, 0, sortArray.length - 1);
            end = System.nanoTime();
            System.out.println("Quick Sort " + (i + 1) + ", time: " + (end - start));
        }

        for (byte i = 0; i < 3; i++) {
            System.arraycopy(originalArray, 0, sortArray, 0, 150);
            start = System.nanoTime();
            Sorts.CycleSort(sortArray);
            end = System.nanoTime();
            System.out.println("Cycle Sort " + (i + 1) + ", time: " + (end - start));
        }

        for (byte i = 0; i < 3; i++) {
            System.arraycopy(originalArray, 0, sortArray, 0, 150);
            start = System.nanoTime();
            Sorts.OddEvenSort(sortArray);
            end = System.nanoTime();
            System.out.println("Odd-Even Sort " + (i + 1) + ", time: " + (end - start));
        }

        for (byte i = 0; i < 3; i++) {
            System.arraycopy(originalArray, 0, sortArray, 0, 150);
            start = System.nanoTime();
            Arrays.sort(sortArray);
            end = System.nanoTime();
            System.out.println("(library)Array Sort " + (i + 1) + ", time: " + (end - start));
        }
    }


    static void showArray(int[] array) {
        for (int item : array) System.out.print(item + "|");
        System.out.println();
    }
}
