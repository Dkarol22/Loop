package com.calderon.loops;

import java.util.Scanner;

public class Loop {

	public void init() {
	// loopWhite();
	//	loopDoWhite();
		
	//	loopFor() ;
		 
		
	}

	private void loopFor() {
		int i,j,k;
		i = j = k = 0;
		for (i=0; i<10; i++) {
			System.out.println(" dentro del bucle 1: " + i);
		}
		
		for(int z = 10; z>0; z--) {
			System.out.println("Dentro del bucle 2 : " + z);
		}
		for (j=0, k=20; j<10 && k>0; j++, k=k-2) {
		System.out.println("dentro del bucle 3 : " + j + ", " + k);
		}
		
	 }
	private void loopDoWhite() {
		 
		 int numero, anterior;
		 numero = anterior = 7;
		 boolean esPrimo = true;
		 
		 do { 
			 anterior--;
			 if (numero % anterior == 0) {
				 esPrimo = false;
			 }
		 
		 }  while(anterior > 2 && esPrimo);
		 if (esPrimo) {
			 System.out.println("este numero: " + numero + " es primo");
		 } else { 
			 System.out.println("Este numero: " + numero + "No es primo");
		 }
		 
			 
			 
			 
			 }
		 
		 

	private void loopWhite() {
		
		int contador =10;
		
		while (contador > 0) {
			System.out.println("Dentro del bucle " + contador);
			contador--;
			
			// termina el primer bucle contador --;
		}
			contador = 10;
			System.out.println("El siguiente bucle:");
			
			while (contador--> 0) {
				System.out.println("Dentro del bucle " + contador);
			}
						
			
	
		}
		 
		}
		
	

	

