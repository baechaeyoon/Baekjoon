package algorithm.Implementation;

import java.util.Scanner;

/**
 * 백준_2953번
 * title : 나는 요리사다
 */

public class baekjoon_2953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int index = 0;

        for(int i =0; i<5; i++){
            int sum = 0;
            for(int j = 0; j<4; j++){
                int score = sc.nextInt();
                sum += score;
                if(max <= sum){
                    max = sum;
                    index = i+1;
                }
            }
        }
        System.out.println(index + " " + max);
        sc.close();
    }
}
