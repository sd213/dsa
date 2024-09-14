
import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        int n = new Scanner(System.in).nextInt();
        if(n==1){
            System.out.println(n+" is not prime.");
        }
        else if(n == 2){
            System.out.println(n+" is prime.");
        }
        else{
            boolean isPrime = true;
            for(int i =2 ; i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime)
                System.out.println(n+" is prime.");
            else
                System.out.println(n+" is not prime.");
        }
    }
    
}
/*
 * The code snippet `for (int i = 2; i <= Math.sqrt(n); i++)` is often used in algorithms for checking if a number \( n \) is prime. Here’s a detailed explanation of its purpose and significance:

### Context: Prime Number Checking

A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. To determine whether a number \( n \) is prime, you need to check if \( n \) is divisible by any number other than 1 and \( n \).

### Optimization by Checking up to \( \sqrt{n} \)

Instead of checking all numbers from 2 to \( n-1 \) to see if they divide \( n \), you only need to check up to \( \sqrt{n} \). Here’s why:

1. **Factor Pairs**: If \( n \) is divisible by some number \( p \), then \( n = p \times q \) for some integer \( q \). If both \( p \) and \( q \) were greater than \( \sqrt{n} \), then \( p \times q \) would be greater than \( n \), which is a contradiction. Therefore, at least one of \( p \) or \( q \) must be less than or equal to \( \sqrt{n} \).

2. **Redundancy Elimination**: Once you have checked all numbers up to \( \sqrt{n} \), if no divisors are found, \( n \) cannot have any divisors greater than \( \sqrt{n} \). This is because any larger divisor would have to be paired with a smaller divisor that is already checked.

### Code Explanation

- `for (int i = 2; i <= Math.sqrt(n); i++)`
  - **Initialization**: `int i = 2` starts the loop with \( i \) set to 2, the smallest prime number.
  - **Condition**: `i <= Math.sqrt(n)` ensures the loop runs as long as \( i \) is less than or equal to the square root of \( n \).
  - **Increment**: `i++` increases \( i \) by 1 in each iteration.

### Practical Example

Let's illustrate with an example:

- Suppose \( n = 29 \).
- \( \sqrt{29} \approx 5.39 \), so you need to check divisors up to 5.

The loop will check \( i = 2, 3, 4, 5 \):
- If none of these values divide 29 (i.e., `29 % i != 0` for all \( i \)), then 29 is prime.

### Benefits

1. **Efficiency**: Reduces the number of iterations from \( n-2 \) to about \( \sqrt{n} - 1 \), significantly speeding up the check for large \( n \).
2. **Simplicity**: Easy to implement and understand, leveraging the mathematical property of divisors.

### Conclusion

Using `for (int i = 2; i <= Math.sqrt(n); i++)` in the context of prime checking is an optimization technique that leverages mathematical properties to reduce the number of necessary checks, thus improving the algorithm's efficiency while maintaining correctness.
 */