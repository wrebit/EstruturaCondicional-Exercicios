package exercises;

import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

 
    System.out.println("Digite um número: ");
    num = sc.nextInt();
    
    // % = resto da divisão
    if (num % 2 == 0){
      System.out.println("Número é par");
    } else {
      System.out.println("Número é ímpar");
    }

    sc.close();
  }
  
}