package br.com.navita.exercicio;

import java.util.Scanner;

public class NumeroIrmao {
	
	public static int solucao(int n) {
		char arrayN[] = (""+n).toCharArray();
		char temp;
		
		for (int i = 1; i < arrayN.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arrayN[i] >= arrayN[j]) {
					temp = arrayN[i];
					arrayN[i] = arrayN[j];
					arrayN[j] = temp;
				}
			}
		}
		
		int numeroIrmao = Integer.parseInt(new String(arrayN));
		return (numeroIrmao > 100000000) ? -1 : numeroIrmao;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrada: ");
		/* int irmao = sc.nextInt(); */	
		System.out.println("Saída: "+ solucao(sc.nextInt()));	
	}
}
