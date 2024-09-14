package Variable;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 25;
        long b = a;
        System.out.println(b);

        // long c = 25;
        // int d = c;
        // System.out.println(d); // .\TypeConversion.java:10: error: incompatible types: possible lossy conversion from long to int     int d = c;

        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
    
}

/* Widening // implicity Type Conversion.
 * Conversion happen when 
 *      a. type compatible   ex:-  conversion between short and int 
 *                                  type incompatiblity between int and short
 *
 *      b. destination type > source type
 */