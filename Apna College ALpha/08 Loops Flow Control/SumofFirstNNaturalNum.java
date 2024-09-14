import java.util.Scanner;

public class SumofFirstNNaturalNum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter Number:- ");
        int n = new Scanner(System.in).nextInt();
        int counter = 1;
        while(counter<=n){
            sum += counter;
            counter++;
        }
        System.out.println("sum is : "+sum);
    }
}
