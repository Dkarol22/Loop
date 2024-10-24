package com.calderon.loops;

import java.util.Scanner;

public class DrawSquare {
	
	public void init() {
		Integer number = this.getIntegerNumberFromUserKeyboard();
		this.printSquareAsterisk(number);
			
	}
private void printSquareAsterisk(Integer number) {
  	 for (int i = 1; i <= number; i++) {
				this.printRowAsterisk(number);
			}
	   	System.out.println();
}

			private void printRowAsterisk(Integer number) {
				
				for (int i = 1; i <= number; i++) {
					System.out.print("*");
				}
				System.out.println();
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
