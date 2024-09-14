package Variable;

public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);
        System.out.println(b-1);
        System.out.println((char) (b-1));


        byte b1 = 5;
        byte b2 = (byte) (b * 2);
        System.out.println(b2);

        int $=32;
        System.out.println($);
    }
}
/*
 Java automatically promotes each byte ,short or char operand to int when evaluating an expression.
 If one operand is long , float  or double  the whole expression is promoted to long , float or double respectively.
 */