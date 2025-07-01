import java.util.Scanner;

public class EvenOdd{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter 6 integers:");
        for(int i = 0; i < 6; i++) {
            numbers[i] = input.nextInt();
            if(numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
