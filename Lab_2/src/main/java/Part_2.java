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

public class Part_2 {
    public static  void  main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Part 2");
        int n = 0;
        while(n <= 0) {
            System.out.print("Elements num: ");
            n = in.nextInt();
        }
    }
}
