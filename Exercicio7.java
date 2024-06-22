package exercises;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		System.out.println("Digite o valor de x: ");
		x = (double) sc.nextDouble();
		System.out.println("Digite o valor de y: ");
		y = (double) sc.nextDouble();
		System.out.printf("%n");
		sc.close();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x > 0.0 && y == 0.0) {
			System.out.println("Eixo X");
		} else if (x == 0.0 && y > 0.0) {
			System.out.println("Eixo Y");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
				
		
	}

}
