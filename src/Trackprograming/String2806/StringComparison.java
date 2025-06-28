package Trackprograming.String2806;

public class StringComparison
{
    public static void main(String[] args)
    {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";
        boolean referenceEqual = (string1 == string3);
        boolean equalsResult = string1.equals(string2);
        boolean equalsIgnoreCaseResult = string1.equalsIgnoreCase(string2);
        int compareToResult = string1.compareTo(string2);
        System.out.println("== operator (string1 == string3): " + referenceEqual);
        System.out.println("equals(): " + equalsResult);
        System.out.println("equalsIgnoreCase(): " + equalsIgnoreCaseResult);
        System.out.println("compareTo(): " + compareToResult);
    }
}
