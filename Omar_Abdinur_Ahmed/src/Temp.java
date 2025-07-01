import java.util.Scanner;

public class Temp{

    public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = convertToCelsius(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
