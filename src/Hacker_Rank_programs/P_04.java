package Hacker_Rank_programs;
import java.util.Scanner;
public class P_04 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Get input from user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Loop from 1 to n
        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            } else if (i % 5 == 0)
            {
                // optional: You can print "Buzz" if you want, else skip this condition
                System.out.println("Buzz");
            } else
            {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
