package OldRepository.java1.Practice.w13;

import java.util.*;

/**
 * 피보나치 수열 계산
 * @author 김이든
 */
public class FibonacciRecursion {
    public static void main(String[] args){
        System.out.print(fiboRecursion(1) + " ");
        System.out.print(fiboRecursion(2) + " ");
        System.out.print(fiboRecursion(3) + " ");
        System.out.print(fiboRecursion(4) + " ");
        System.out.print(fiboRecursion(5) + " ");
        System.out.print(fiboRecursion(6) + " ");
        System.out.print(fiboRecursion(7) + " ");
        System.out.print(fiboRecursion(8) + " ");
        System.out.print(fiboRecursion(9) + " ");
        System.out.print(fiboRecursion(10) + " ");
        System.out.print(fiboRecursion(20) + " ");

        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();


        System.out.println(fiboRecursion(n));

    }

    /**
     * 피보나치 수열의 n번째 값, f(n)을 recursion 방법으로 구한다.
     * 수열은 아래와 같은 방식으로 표기하기로 한다.
     * f(1) = 1, f(2) = 1, f(3) = 2, f(4) = 3, ...
     * @param n
     * @return f(n)
     */
    public static long fiboRecursion(int n){
        if(n <= 2){
            return 1;
        }
        else{
            return fiboRecursion(n-1) + fiboRecursion(n-2);
        }
    }
}

