package day0315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1654_랜선자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long max = 0; // 랜선 길이 중 최댓값

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i])
                max = arr[i];
        }


        max++;

        long min = 0; // 탐색 길이 최솟값
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;

            long count = 0;

            // 구해진 중간 길이로 잘라서 총 몇개가 만들어지는지 구한다.

            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            /*
             *  [upper bound 형식]
             *
             *  mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
             *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
             *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
             */

            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }


        // UpperBound로 얻어진 값(min)에 -1이 최대 길이가 된다.
        System.out.println(min - 1);

    }
}
