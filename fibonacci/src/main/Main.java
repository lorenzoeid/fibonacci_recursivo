package main;

import java.util.Scanner;

public class Main {

	public static void main (String args[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a posição a ser encontrada na sequência de Fibonacci: ");
			int N = sc.nextInt();
			int n1 = N;
			
			if (N <= 0) {
				System.out.println("Digite um número acima de 0");
			}else {
				System.out.println("A posição " + n1 + " tem o valor: " + fibonacci(N));
			}
			sc.close();
	}
	
     public static int fibonacci(int n) {
		
		if (n <= 1) {
			return n;
		} 
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
