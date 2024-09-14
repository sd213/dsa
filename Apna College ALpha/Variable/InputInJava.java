package Variable;

import java.util.Scanner;

public class InputInJava {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in); 

        String input = sc.next(); 
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        boolean isProgramDone = sc.nextBoolean();
        System.out.println(isProgramDone);
    }
}
// scanner object has only work that it uses different function use to capture data/value of different datatypes and store them in some variable.

// use nextLine() for storing spaces .