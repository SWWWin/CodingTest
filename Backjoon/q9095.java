package math.Backjoon;

import java.util.Scanner;

public class q9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dp = new int[12];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(dp[N]);
        }

    }
}
