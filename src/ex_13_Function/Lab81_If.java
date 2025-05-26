package ex_13_Function;

public class Lab81_If {
    public static void main(String[] args)
    {
        int age = Integer.parseInt(args[0]);
        if (age < 18)
        {
            System.out.println("Allowed to Vote");
        }
            else
        {
            System.out.println("Your Are Not Allowed to Vote");
        }


    }
}
