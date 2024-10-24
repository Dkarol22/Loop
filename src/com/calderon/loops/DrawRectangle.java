package com.calderon.loops;

import java.util.Scanner;

public class DrawRectangle {
	
	public void init() {
		System.out.println("te voy a pedir primero numero de filas y luego columnas");
		Integer numberOfRows = this.getIntegerNumberFromUserKeyboard();
		Integer numberOfCols = this.getIntegerNumberFromUserKeyboard();
		this.printRectangleAsterisk(numberOfRows, numberOfCols);
			
	}
        private void printRectangleAsterisk(Integer numberOfRows, Integer numberOfCols) {
  	      for (int i = 1; i <= numberOfRows; i++) {
				this.printRowAsterisk(numberOfCols);
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
			
			//scan.close();
			return numberFromUserKeyboard;

		    
		   
		    }
}
