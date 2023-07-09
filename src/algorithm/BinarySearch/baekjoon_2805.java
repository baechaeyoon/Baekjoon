package algorithm.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준_2805번
 * title : 나무 자르기
 * content :
 *              1) 상근이는 절단기에 높이 H를 지정해야 한다. 높이를 지정하면 톱날이 땅으로 부터 H미터 위로 올라간다.
 *              2) 그 다음, 한 줄에 연속해 있는 나무를 모두 절단해버린다.
 *              3) 높이가 H보다 큰 나무는 H의 위의 부분이 잘릴 것이고, 낮은 나무는 잘리지 않을 것이다.
 *              4) 예를 들어, 한줄에 연속해 있는 나무의 높이가 20,15,10,17이라고 했을 때 높이를 15로 지정했다면, 나무를 자른 뒤의 높이는 15,15,10,15가 될 것이고, 상근이는 길이가 5인 나무와 2인 나무(총 7미터)를 들고 갈 것이다.
 *              5) 나무를 필요한 만큼만 집으로 가져가려고 한다. 이때, 적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 구하여라.
 * input :
 *              1) 첫째 줄에는 나무의 수 N과 상근이가 집으로 가져가려고 하는 나무의 길이 M이 주어진다. (1 <= N 1<= 1,000,000 , 1 <= M <= 2,000,000,000)
 *              2) 둘째 줄에는 나무의 높이가 주어진다. 나무의 높이의 합은 항상 M보다 크거나 같기 때문에, 상근이는 집에 필요한 나무를 항상 가져갈 수 있다. 높이는 1,000,000,000보다 작거나 같은 양의 정수 또는 0이다.
 * ex :
 *              1) 4, 7 / 20, 15, 10, 17
 *              2) 5, 20 / 4, 42, 26, 46
 */

public class baekjoon_2805 {
    private static int N;
    private static int M;
    private static int[] trees;
    private static long max= 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 나무의 수 N
        N = Integer.parseInt(st.nextToken());
        // 집으로 가져가려고 하는 나무의 길이 M
        M = Integer.parseInt(st.nextToken());

        trees = new int[N + 1];

        for(int i = 1; i<=N; i++){
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }

        long start = 0;
        long end = max;

        while(start <= end){
            long mid = (start+end) / 2;
            long sum = 0;

            for(int tree: trees){
                if(tree > mid){
                    sum += tree - mid;
                }
            }

            if(sum >= M){
                start = mid + 1;
            } else{
                end = mid -1;
            }
        }

        System.out.println(end);


    }
}
