package Hacker_Rank_programs;
import java.util.Scanner;
public class P_01
{
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Keep reading integers while input is available
            while (scanner.hasNextInt())
            {
                int number = scanner.nextInt();
                System.out.println(number);
            }
            scanner.close();
        }
}
