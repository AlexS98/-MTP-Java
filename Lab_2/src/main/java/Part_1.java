/*
 * Variant 4
 * Find the geometric mean of paired array elements;
 * Find the largest number by module of the array element;
 * Find the maximum paired item in the array;
 ? Determine the arithmetic mean of the minimum elements of the array;
 * Find the module-minimized array element;
 * Find the sum of items in the interval [0; 10]
*/
import java.util.Scanner;

public class Part_1 {
    public static  void  main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Part 1");
        int n = 0;
        while(n <= 0) {
            System.out.print("Elements num(only int): ");
            n = in.nextInt();
        }
        double[] array = new double[n];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter " + i + ": ");
            array[i] = in.nextInt();
        }

        double Geom_mean = 1.0;
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0) {
                Geom_mean *= array[i];
                counter++;
            }
        }
        if(counter>0) Geom_mean = Math.pow(Geom_mean, (1.0)/counter);
        else Geom_mean = 0;
        System.out.println("Geometric mean of paired array elements: " + Geom_mean);

        double max = array[0];
        for(int i = 1; i < array.length; i++){
            if(Math.abs(array[i]) > Math.abs(max)) max = array[i];
        }
        System.out.println("Largest number by module: " + max);

        double max_pair = 1;
        for(int i = 1; i < array.length; i++){
            if(array[i] % 2 == 0 && array[i] > max_pair) max_pair = array[i];
        }
        if(max_pair == 1) System.out.println("No pair items");
        else System.out.println("Maximum paired item: " + max_pair);

        double Arith_mean = 0.0;
        counter = 0;
        for(int i = 0; i < array.length; i++){
                Arith_mean += array[i];
                counter++;
        }
        Arith_mean = Arith_mean/counter;
        System.out.println("Arithmetic mean: " + Arith_mean);

        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if(Math.abs(array[i]) < Math.abs(min)) min = array[i];
        }
        System.out.println("Smallest number by module: " + min);

        int inter_sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]>=0 & array[i]<=10) inter_sum += array[i];
        }
        System.out.println("Sum of items in the interval [0; 10]: " + inter_sum);
    }
}
