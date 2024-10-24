package com.calderon.loops;

import java.util.Scanner;

public class DrawStars {

public void init () {
	Integer number = this.getIntegerNumberFromUserKeyboard();
		System.out.println("el numero es: " + number);
		System.out.println("el numero es par: " + this.isEven(number));
		System.out.println("el numero es mayor que 0:" +
		             this.isGreaterThanZero(number));
		
		
		        this.printAsterisk(number);
		        if (this.isEven(number) && this.isGreaterThanZero(number)) {
		        	this.printAsterisk(number);
		        
		        }

		        else {
		        	System.out.println("El numero no cumple las condiciones");
		        }
		        
		        
		        
}

     private void printAsterisk(Integer number) {
    	 
    	 for (int i = 1; i <= number; i++) {
			System.out.println("****");
		}
    	 
     }
	

	 public Boolean isEven(Integer number) {   
			return (number % 2 == 0) ? true : false;
			
//		//boolean isEven = false;
//		if (number % 2 == 0) { 
//			
//		 isEven = true;
//		 
//			}
//		//return isEven; 
	 }
    public boolean isGreaterThanZero(Integer number) {
    	return (number > 0) ? true : false;
		
    }
    	
    public Integer getIntegerNumberFromUserKeyboard() {
    	Integer numberFromUserKeyboard = 0;
    
	Scanner scan = new Scanner(System.in);
	System.out.println("introduce un numero entero: ");
	numberFromUserKeyboard = scan.nextInt();
	scan.close();
	return numberFromUserKeyboard;
			
	 }
}
     

