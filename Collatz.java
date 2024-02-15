// This is the code about collatz problem in the range of i and j, the maximum value of repeatation it will return

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for i and j :");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int maxcycle = 0;
        int cycle = 0;
        for(int k = i ; k <= j; k++){
            cycle = repeat(k); 
            if (maxcycle < cycle) {
                maxcycle = cycle;
            }
        }
        System.out.println("The maximum cycle count is: " +maxcycle);
    }

    public static int repeat(int k) {
        int count = 1;
        while(k != 1) {
            if (k%2 == 0) {
                k = k / 2;
            } else {
                k = 3 * k + 1;
            }
            count++;
        }
        return count;
    }
}
