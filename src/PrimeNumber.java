import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter is your number: ");
        int number = scanner.nextInt();

        for(int j = 1; j <= number; j++) {
            boolean isPrime = false;
            for(int i = 2; i < Math.sqrt(number); i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                } else isPrime = true;
            }
            if (isPrime) System.out.println(j + " is Prime!");
        }



    }
}
