package exercises;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod, qtd;
		double price;
		
		
		System.out.println("Digite o código: ");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		qtd = sc.nextInt();
		
		switch (cod) {
			case 1:
				price = (double) qtd * 4;
				System.out.printf("Total: R$ %.2f", price);
				break;
			case 2: 
				price = (double) qtd * 4.5;
				System.out.printf("Total: R$ %.2f", price);
				break;
			case 3:
				price = (double) qtd * 5;
				System.out.printf("Total: R$ %.2f", price);
				break;
			case 4:
				price = (double) qtd * 2;
				System.out.printf("Total: R$ %.2f", price);
				break;
			case 5:
				price = (double) qtd * 1.5;
				System.out.printf("Total: R$ %.2f", price);
				break;
			
			 
		}
		
	
	sc.close();
	}

}
