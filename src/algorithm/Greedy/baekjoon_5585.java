package algorithm.Greedy;

import java.util.Scanner;

/**
 * 백준_5585번
 * title : 거스름돈
 */

public class baekjoon_5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1000 - sc.nextInt();
        int count = 0;
        int[] arr = {500,100,50,10,5,1};
        for(int i =0; i<arr.length; i++) {
            if(N%arr[i]>=0) {
                count += N/arr[i];
                N = N%arr[i];
            }
        }
        System.out.println(count);
    }
}
