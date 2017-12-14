import java.util.*;

public class Lab07Problem04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("A = ");
		int a = scan.nextInt();

		System.out.print("B = ");
		int b = scan.nextInt();

		int d = gcd(a, b);

		System.out.printf("GCD(%d, %d) = %d%n", a, b, d);
	}

	private static int gcd(int a, int b) {
		if (a == 0 && b == 0) {
			throw new IllegalArgumentException("GDC(0, 0) is not defined");
		}

		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		int e = a % b;
		while (e != 0) {
			a = b;
			b = e;
			e = a % b;
		}
		return b;
	}
}
