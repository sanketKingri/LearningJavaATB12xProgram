package ex_03_Literals;

public class Lab_11 {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
//        char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Sanket");
        System.out.println("sanket"+new_line+"kingri");
        System.out.println("sanket\nkingri");
        System.out.println("sanket"+tab_line+"kingri");
        System.out.println("sanket"+back_space+"kingri");
        System.out.println( " ----- ");

        System.out.println("sanket is "+carriage_return+"Kingri");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';

    }
}
