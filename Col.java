import java.util.Scanner;

class Col{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        while(n != 1) {
            if (n%2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        System.out.println("The count is :" +count);
    }
}