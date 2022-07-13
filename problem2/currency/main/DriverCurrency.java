package problem2.currency.main;

import java.util.Scanner;

import problem2.currency.sevice.Denomination;

public class DriverCurrency {

	
	public static void  printArray(int array[]) {
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i] + " ");
		
	}
	
	public static void main(String[] args) {
		Denomination sorted = new Denomination();
		Denomination notesCount = new Denomination();
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the size of currency denominations");
			int size = s.nextInt();
			int notes[] = new int[size];
			
			System.out.println("Enter the currency denominations value");
			
			for(int i = 0; i < size; i++) {
				notes[i] = s.nextInt();
			}
			
			System.out.println("enter the amount you want to pay");
			int amount = s.nextInt();
			sorted.sorting(notes, 0, notes.length - 1);
			notesCount.paymentProcess(notes, amount);
			s.close();
		}
	
	}

}
