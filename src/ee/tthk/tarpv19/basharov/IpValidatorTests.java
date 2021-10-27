package ee.tthk.tarpv19.basharov;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IpValidatorTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ShouldReturnFalse_GivenEmptyStringParameter() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.ValidateIpv4Address(""));
	}
	@Test
	void ShouldBe_False_GivenStringWithThreeDots() {
		IpValidator validator = new IpValidator();
		assertTrue(validator.ValidateIpv4Address("..."));
	}
	@Test
	void ShouldReturnFourNumbersGivenStringWithThreeDots() {
		IpValidator validator = new IpValidator();
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected,validator.getNumbers("1.2.3.4"));
	}
	@Test
	void ShouldBe_False_GivenStringWithThreeNumbersAndDots() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.ValidateIpv4Address("1.2.3."));
	}

}
