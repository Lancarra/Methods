package app;

import java.util.Scanner;

public class Main {

    // Method to print the square of a number
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("The square of " + number + " is " + square + ".");
    }

    // Method to calculate the volume of a cylinder
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate the sum of elements in an array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Method to reverse a string
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // Method to calculate a^b
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    // Method to print a string n times
    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input a number and print its square
        System.out.print("1. Input a number and print its square ");
        System.out.print("\nEnter an integer: ");
        int number = scanner.nextInt();
        printSquare(number);

        // 2. Input the radius and height and calculate the volume of the cylinder
        System.out.print("\n2. Input the radius and height and calculate the volume of the cylinder ");
        System.out.print("\nEnter the cylinder's radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the cylinder's height: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is " + volume + ".");

        // 3. Array of numbers and sum of elements
        System.out.print("\n3. Array of numbers and sum of elements ");
        int[] array = {10, 20, 30, 40, 50};
        int sum = sumArray(array);
        System.out.println("\nArray of numbers: [10, 20, 30, 40, 50]");
        System.out.println("The sum of all elements in the array is " + sum + ".");

        // 4. Input a string and reverse it
        System.out.print("\n4. Input a string and reverse it ");
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("\nEnter a string: ");
        String text = scanner.nextLine();
        String reversed = reverseString(text);
        System.out.println("The string in reverse order: " + reversed);

        // 5. Input numbers a and b and calculate a^b
        System.out.print("\n5. Input numbers a and b and calculate a^b ");
        System.out.print("\nEnter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int result = power(a, b);
        System.out.println("The result of " + a + "^" + b + " is " + result + ".");

        // 6. Input n and a string to print n times
        System.out.print("\n6. Input n and a string to print n times ");
        System.out.print("\nEnter an integer n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        printTextNTimes(n, inputText);
    }
}
