package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_97 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("SAnket");
        stringBuffer.append("Kingri");
        System.out.println(stringBuffer);

        String s1 = "SAnket";
        s1 = s1+ "Kingri";
        System.out.println(s1);
    }
}
