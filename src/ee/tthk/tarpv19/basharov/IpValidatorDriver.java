package ee.tthk.tarpv19.basharov;

import java.util.Arrays;

public class IpValidatorDriver {

	public static void main(String[]args) {
		int[] numbers = Arrays.stream("1.2.3.4".split("\\.")).mapToInt(Integer::parseInt).toArray();
	}
	
}
