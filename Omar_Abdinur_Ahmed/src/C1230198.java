import java.util.Scanner;
public class C1230198 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");

        String userInput = scanner.nextLine();

        int vowelCount = countVowels(userInput);

        System.out.println("Number of Vowels: "+ vowelCount);
    }
    public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
             count++;
             }
        }

        return count;
    }

}