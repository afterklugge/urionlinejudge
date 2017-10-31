import java.util.Scanner;

public class URI1039 {

	public static void main(String[] args) {
		double A, B, C, D, E, MEDIA;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = sc.nextDouble();
		
		MEDIA = ((A*2) + (B*3) + (C*4)+ (D*1)) / 10;
		
		if (MEDIA >= 7.0) {
			System.out.printf("MEDIA = %.1f%n", MEDIA);
			System.out.println("Aluno aprovado.");
		}
		else if (MEDIA < 5.0) {
			System.out.printf("MEDIA = %.1f%n", MEDIA);
			System.out.println("Aluno reprovado.");
		}
		
		else if(MEDIA <= 6.9 && MEDIA >= 5.0) {
				System.out.printf("MEDIA = %.1f%n", MEDIA);
				System.out.print("Aluno em exame.\n");
				E = sc.nextDouble();
				System.out.printf("Nota do exame: %.1f%n", E);
				
				
				if ((E + MEDIA) / 2.0  > 5.0) {
					System.out.println("Aluno reprovado.");
				}
				else {
					System.out.println("Aluno reprovado.");
				}
				System.out.printf("Media final: %.1f%n", (E + MEDIA) / 2.0);
			}
		else {
			System.out.println("Aluno reprovado.");
		}
	}
}
