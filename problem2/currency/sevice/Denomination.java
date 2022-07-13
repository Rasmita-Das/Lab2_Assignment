package problem2.currency.sevice;

import java.util.*;

public class Denomination {
	public static HashMap<Integer, Integer>hm = new HashMap<>();
	
	public void merge(int array[], int sIndex, int mid, int eIndex) {
		//implementing sizes of 2 sub arrays to merge
		int n1 = mid - sIndex + 1;
		int n2 = eIndex - mid;
		
		//creating temporary arrays
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		//copy data
		for(int i = 0; i < n1; ++i)
			leftArray[i] = array[sIndex + i];
		for(int j = 0; j < n2; ++j)
			rightArray[j] = array[mid + 1 + j];
		
		//initialing values
		int i = 0, j=0, a= sIndex;
		while(i < n1 && j < n2) {
			if(leftArray[i] >= rightArray[j]) {   
				array[a] = leftArray[i];
				i++;
			}else {
				array[a] = rightArray[j];
				j++;
			}
			a++;
		}
		// to copy the remaining elements of left array
		while(i < n1) {
			array[a] = leftArray[i];
			i++; a++;
		}
		//to copy the remaining elements of right array.
		while(j < n2) {
			array[a] = rightArray[j];
			j++; 
			a++;}
		}
	//functions those sorts arraythrough merging
		public void sorting(int[] notes, int left,int right) {
			if(left < right) {
				int mid = (left + right) / 2;
				
				sorting(notes, left, mid);			
				sorting(notes, mid + 1, right);	
				//merged the sorted halves
				merge(notes, left, mid,right);
			}
		}
		public void paymentProcess(int[] notes, int amount) {
			int[] count = new int[notes.length];
			for(int i=0; i<notes.length; i++) {
				if(amount >= notes[i]) {
					count[i] = amount / notes[i];
					amount = amount - count[i] * notes[i];
				}
			}
			if(amount>0) {
				System.out.println("Exact amount cannot be given with the highest denomination");
			}else {
				System.out.println("Your payment approach in order to give minimum number of notes will be ");
				for(int i=0; i<notes.length; i++) {
					if(count[i] != 0) {
						System.out.println(notes[i] + ":" + count[i]);
					}
				}
			}
		}
		
//		
//			
//			int arr = amount/currency;
//			amount-=currency*currency;
//			hm.put(arr, currency);
//			sorted(notes, amount);
//		}
//		
}