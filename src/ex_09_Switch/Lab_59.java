package ex_09_Switch;

public class Lab_59 {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}