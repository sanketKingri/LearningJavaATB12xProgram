package ex_18_OOPs_Constructors;

public class Lab_121 {


    public class Lab162_OOPs {
        public static void main(String[] args) {
            Baby b1 = new Baby();
            new Baby();
            new Baby();
            Baby b2;

        }

    }
    static class Baby{
        String name;

        // Default Constructor also called
        Baby(){
            System.out.println("I am called, Object is created!");
        }
    }
}
