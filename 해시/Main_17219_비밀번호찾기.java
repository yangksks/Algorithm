package day0418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_17219_비밀번호찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> password = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            password.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            sb.append(password.get(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }
}
