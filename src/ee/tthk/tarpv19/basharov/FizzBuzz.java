package ee.tthk.tarpv19.basharov;

import com.sun.tools.javac.code.Attribute.Array;
import java.util.Array;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++){
			System.out.println(fiz(i));
		}
	}

	public static String fiz(int i) {
		if(i == 0) return "0";
		if(i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
		if(i % 3 == 0) return "Fizz";
		if(i % 5 == 0) return "Buzz";
		return String.valueOf(i);
	}
	private int[] numbers;
	public int[] getNumbers() {
		numbers = new int[100];
		for (int i=0; 1 < numbers.length; i++) {
			numbers[i]=i+1;
		}
		/*return (String[]) Array.stream(numbers)
				.boxed()
				.map(Integer::toString)
				.toArray(String[]::new);*/
	}
	private String getFizzBuzz(int number) {
		if(number%3==0) {
			return "Fizz";
		if(number%5==0) {
			return "Buzz";
		}
		return String.valueOf(number);
	}
	}
}
