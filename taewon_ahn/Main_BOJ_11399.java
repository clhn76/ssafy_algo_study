import java.io.*;
import java.util.*;

public class Main_BOJ_11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int[] dp = new int[N];
		dp[0] = arr[0];
		for (int i = 1; i < N; i++) {
			dp[i] = dp[i - 1] + arr[i];
		}

		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += dp[i];
		}

		System.out.println(sum);
	}
}