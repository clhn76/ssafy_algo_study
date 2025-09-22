import java.io.*;
import java.util.*;

public class Main_BOJ_1003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] dp = new int[41][2];

			dp[1][1] = 1;
			dp[0][0] = 1; 

			for (int j = 2; j <= n; j++) {
				dp[j][0] = dp[j - 1][0] + dp[j - 2][0];
				dp[j][1] = dp[j - 1][1] + dp[j - 2][1];
			}

			sb.append(dp[n][0]).append(" ").append(dp[n][1]).append("\n");
		}
		System.out.println(sb);
	}
}