package ex_13_Function;

public class Lab_82
{
    public static void main(String[] args) {

        int r1 = sum_of_two_number(4,5);
        int r2 = sum_of_two_number(12,45);
        System.out.println(r1);
        System.out.println(r2);

    }

    static int sum_of_two_number(int first,int second){
        return first+second;
    }
}
