package com.ssbaez.ejercicio520;

import java.util.Scanner;

public class Pi {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int term;
		int num = 5;
		int signo = 2;
		
		System.out.println("APLICACION QUE CALCULA EL VALOR DE PI A PARTIR DE LA SERIE INFINITA" + 
						   "\nPI = 4 - 4/3 + 4/5 + 4/7 + 4/9 + 4/11 + ...");
		
		while(true) {//Evalua que el entero ingresado sea valido
			
			System.out.println("Cuantos terminos de la serie infinita quiere calcular");
			System.out.print("----> ");
			term = input.nextInt();
			
			if(term >= 1) {
				break;
			}
			System.out.println("***VALOR ERRONEO***");	
		}
		
		double pi = 4 - (double) 4/3;
		
		for(int i = 1; i < term; i++) {
			
			if(term != 1) {
				
				if(i == 1)
					System.out.printf("%.9f%n", pi);
				
				pi += (Math.pow(-1, signo))*((double) 4 / num);
				num += 2;
				signo++;
				System.out.printf("%.9f%n", pi);
				
			}
			else {
				System.out.printf("%.9f%n", pi);
			}
			
		}
		
	}

}
