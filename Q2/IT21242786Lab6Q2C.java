import java.util.Scanner;

public class IT21242786Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        int i = 0;
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");

        i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        double average = (double) sum / 10;

        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}