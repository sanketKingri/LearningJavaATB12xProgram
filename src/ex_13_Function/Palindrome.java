package ex_13_Function;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev))
        {
            System.out.println(str +" string is Palindrom");
        }
        else
        {
            System.out.println(str + "String is not Palindrom");
        }
    }
}
