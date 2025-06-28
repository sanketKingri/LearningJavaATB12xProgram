package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_94 {
    public static void main(String[] args) {
        String input = "sanket";
        // domarP

        for (int i= input.length()-1;i>=0;i--)
        {
            System.out.print(input.charAt(i));
        }

        System.out.println("");

        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());

    }
}
