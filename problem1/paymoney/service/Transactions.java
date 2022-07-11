package problem1.paymoney.service;

import java.util.Scanner;

public class Transactions {

	public void cheakTransaction(int[] array, int targetNum) {

		while(targetNum > 0) {

			try (Scanner sc = new Scanner(System.in)) {
				@SuppressWarnings("unused")
				int flag = 0;

				System.out.println("Enter the value of target");
				int target = sc.nextInt();

				int sum = 0;
				for(int i = 0; i < array.length; i++) {
					sum += array[i];

					if(sum >= target) {
						System.out.println("Target achieved ater " + (i + 1) + "transaction");

						flag = 1;

						break;
					}
				}
			}
		}
	}
}
