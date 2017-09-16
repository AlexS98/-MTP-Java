/*
 * Variant 4
 * This is a valid square matrix of order n. Consider those elements
   which are located in rows starting with a negative element.;
 * Find the sum of those that are located respectively below, above
   and on main diagonal;
 * This is a valid square matrix of order 9. Obtain an integer square
   matrix of the same order in which the element is equal to one, if
   the corresponding element of the output matrix is greater than an
   element, located in its line on the main diagonal, otherwise is zero
*/
import java.util.Scanner;
import java.util.Random;

public class Part_2 {
    public static  void  main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Part 2");
        int n = 0;
        while(n <= 0) {
            System.out.print("Elements num: ");
            n = in.nextInt();
        }
        Random rand = new Random();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) matrix[i][j] = rand.nextInt(100);
        showMatrix(matrix);

        int belowSum = 0,mainSum = 0,aboveSum = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(i == j) mainSum += matrix[i][j];
                else if(i>j) belowSum += matrix[i][j];
                else if(i<j) aboveSum += matrix[i][j];
        System.out.println("Main diagonal: " + mainSum);
        System.out.println("Below diagonal: " + belowSum);
        System.out.println("Above diagonal: " + aboveSum);


        int[][] baseMatrix = new int[9][9];
        int[][] myMatrix = new int[9][9];
        for(int i = 0; i < 9; i++) for(int j = 0; j < 9; j++) baseMatrix[i][j] = rand.nextInt(100);
        System.out.println("baseMatrix");
        showMatrix(baseMatrix);
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++)
                if(baseMatrix[i][j] > baseMatrix[i][i]) myMatrix[i][j] = baseMatrix[i][j];
                else myMatrix[i][j] = 0;
        System.out.println("myMatrix");
        showMatrix(myMatrix);
    }

    public static void  showMatrix(int[][] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++){
                if(array[i][j] < 10) System.out.print(" ");
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
