package problem1.paymoney.main;

import java.util.Scanner;

import problem1.paymoney.service.Transactions;

public class Driver {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of transaction array");
			//sc.nextInt(size);
			int size = sc.nextInt() ;
			int array[] = new int[size];

			System.out.println("Enter the value of array");
			for(int i = 0; i < size; i++)
				array[i] = sc.nextInt();

			System.out.println("Enter the total number of targets that needs to be achieved");
			int targetNum = sc.nextInt();

			Transactions service = new	Transactions();
			service.cheakTransaction(array, targetNum);
		}
	}

}


