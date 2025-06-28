package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_96 {
    public static void main(String[] args) {
        String s0 = "sanket";
        String s1 = new String("sanket");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("sanket");
        StringBuilder stringBuilder = new StringBuilder("sanket");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
