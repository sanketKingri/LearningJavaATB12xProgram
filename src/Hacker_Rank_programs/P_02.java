package Hacker_Rank_programs;
import java.util.Scanner;
public class P_02
{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int a = scanner.nextInt();
        scanner.close();
        if (a % 2 !=0)
        {
            System.out.println("Weird");
        }
        else
        {
            if (a>=2 && a<=5)
            {
                System.out.println("Not Weird");
            }
            else if (a>=6 && a<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
    }
}
