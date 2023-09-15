package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numSquare = 3;
		int[] height = new int[numSquare];
		int[] width = new int[numSquare];
		Rettangolo[] squares = new Rettangolo[numSquare];
		Scanner sc = new Scanner(System.in);
		
		 
		
		
		for(int i = 0; i < numSquare; i++) {
			
			System.out.print("Inserisci l'altezza del rettangolo n." + (i + 1) + ": ");
			height[i] = sc.nextInt();
			
			System.out.print("Inserisci la larghezza del rettangolo n." + (i + 1) + ": ");
			width[i] = sc.nextInt();
		}
		
		
		
		for(int i = 0; i < numSquare; i++) {
			squares[i] = new Rettangolo(width[i], height[i]);
			System.out.println("");
			System.out.println("Il perimetro del rettangolo n." + (i + 1) + " è: " + squares[i].perimetro());
			System.out.println("L'area del rettangolo n." + (i + 1) + " è: " + squares[i].area());
			
			
			for(int x = 0; x < width[i]; x++) {
				System.out.println("");
				for(int y = 0; y < height[i]; y++) {
					if((x > 0 && x < width[i] - 1) && (y > 0 && y < height[i] - 1) ) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
		}
		
		 
		
		

	}

}
