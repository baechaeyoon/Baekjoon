package algorithm.Implementation;

import java.util.Scanner;

/**
 * 백준_9498번
 * title : 시험성적
 */

public class baekjoon_9498 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        in.close();

        if(A>=90) System.out.println("A");
        else if(A>=80) System.out.println("B");
        else if (A>=70) System.out.println("C");
        else if(A>=60) System.out.println("D");
        else System.out.println("F");
    }

}
