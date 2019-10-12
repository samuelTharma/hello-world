package uk.test.git;

import java.util.Arrays;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-nerated method stub
		int[] numbers = new SortingDemo().sortNumbers(new int[] {3,1,89,44,22});
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public int[] sortNumbers(int[] numbers)
	{
		Arrays.parallelSort(numbers);
		return numbers;
	}

}
