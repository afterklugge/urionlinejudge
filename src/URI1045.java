import java.util.Arrays;
import java.util.Scanner;
public class URI1045 {

	public static void main(String[] args) {
		double x[] = new double[3];
		Scanner sc = new Scanner(System.in);
		x[0] = sc.nextDouble();
		x[1] = sc.nextDouble();
		x[2] = sc.nextDouble();
		
		Arrays.sort(x);
		double c = x[0], b = x[1], a = x[2];
		
		if (a >= (b+c)) {
			System.out.print("NAO FORMA TRIANGULO");
		}
		else if (a*a == (b*b)+(c*c)) {
			System.out.print("TRIANGULO RETANGULO");
		}
		else if (a*a > (b*b)+(c*c)) {
			System.out.print("TRIANGULO OBTUSANGULO");
		}
		else if (a*a < (b*b)+(c*c)) {
			System.out.print("TRIANGULO ACUTANGULO");
		}
		else if ( a == b && b == c) {
			System.out.print("TRIANGULO EQUILATERO");
		}
		else {
			System.out.print("TRIANGULO ISOSCELES");
	}
  }
}

