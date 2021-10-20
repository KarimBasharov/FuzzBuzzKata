package ee.tthk.tarpv19.basharov;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	FizzBuzz fb;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturnOneHundredNumbers() {
		FizzBuzz fb=new FizzBuzz();
		assertEquals(100, fb.getNumbers().length);
	}
	@Test
	void shouldReturnNumbers1_100() {
		int[] expected = IntStream.range(1, 101).toArray();
		assertEquals(100, fb.getNumbers().length);
	}
	
	@Test
	void shouldReturnFizzNumbersDivisibleBly3() {
		String[] actual = fb.getNumbers();
		for(int i = 0; i < expected1_100.length; i++) {
			if(Integer.valueOf(expected1_100[i])%5==0) {lajlgijdlirjg�l�ajfg�l
				assertEquals("Fizz",actual[i]);
			}else {
				assertEquals("expected",actual[i]);
			}
			
		}
		int[] expected = IntStream.range(1, 101).toArray();
		assertEquals(100, fb.getNumbers().length);
	}
	
	@Test
	public void check_0is0() {
		assertEquals(FizzBuzz.fiz(0), ("0"));
	}
	
	@Test
	public void check_1is1() {
		assertEquals(FizzBuzz.fiz(1), ("1"));
	}
	
	@Test
	public void check_3isFizz() {
		assertEquals(FizzBuzz.fiz(3), ("Fizz"));
	}
	
	@Test
	public void check_5isBuzz() {
		assertEquals(FizzBuzz.fiz(5), ("Buzz"));
	}
	
	@Test
	public void check_multipleOf3isFizz() {
		assertEquals(FizzBuzz.fiz(6), ("Fizz"));
	}
	
	@Test
	public void check_multipleOf5isBuzz() {
		assertEquals(FizzBuzz.fiz(10), ("Buzz"));
	}
	
	@Test
	public void check_multipleOf5And3IsBuzz() {
		assertEquals(FizzBuzz.fiz(15), ("FizzBuzz"));
	}

}
