import java.util.Scanner;

public class java1101 {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);

		while (((m = sc.nextInt()) > 0 )&&((n = sc.nextInt()) > 0 )) {
			int sum = 0;
			if (m < n) {
				for (int x = m; x <= n; x++) {
					sum = sum + x;
					System.out.printf("%d ", x);
				}

			} else if (m > n) {
				for (int x = n; x <= m; x++) {
					sum = sum + x;
					System.out.printf("%d", x);
				}
			}
			System.out.println("Sum=" + sum);
		}
	}
}
