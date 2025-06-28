package Trackprograming.String2806;

public class StringPerformaceCompaire
{
    public static void main(String[] args)
    {
        int iterations = 1000;
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++)
        {
            str = str + "a";
        }
        long endTime = System.currentTimeMillis();
        long stringTime = endTime - startTime;
        System.out.println("String: " + stringTime + " ms");
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++)
        {
            stringBuilder.append("a");
        }
        endTime = System.currentTimeMillis();
        long builderTime = endTime - startTime;
        System.out.println("StringBuilder: " + builderTime + " ms");

        // StringBuffer concatenation
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++)
        {
            stringBuffer.append("a");
        }
        endTime = System.currentTimeMillis();
        long bufferTime = endTime - startTime;
        System.out.println("StringBuffer: " + bufferTime + " ms");
    }
}
