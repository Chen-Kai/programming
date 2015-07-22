import java.util.Arrays;

public class App {
	static int[] a;
	static boolean[] marked;

	static int f(int n, int k) {
		if (n == k || k == 0) {
			if (n == k) {
				for (int i = 1; i <= n; i++) {
					marked[i] = true;
				}
			}
			// System.out.println(Arrays.toString(marked) + ", " + n + ", " +
			// k);
			for (int i = 1; i < a.length; i++) {
				if (marked[i]) {
					System.out.print(a[i] + " ");
				}
			}
			System.out.println();
			if (n == k) {
				for (int i = 1; i <= n; i++) {
					marked[i] = false;
				}
			}
			return 1;
		}
		marked[n] = true;
		int a = f(n - 1, k - 1);
		marked[n] = false;
		int b = f(n - 1, k);
		return a + b;
	}

	public static void main(String[] args) {
		final int N = 100;
		final int K = 2;
		a = new int[N + 1];
		for (int i = 0; i < N + 1; i++) {
			a[i] = i;
		}
		marked = new boolean[N + 1];
		System.out.println(f(N, K));
	}
}
