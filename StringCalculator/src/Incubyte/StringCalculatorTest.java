package Incubyte;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void testEmptyString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("");
		assertEquals(res,0);
	}
	
	@Test
	void string_with_single_number_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.add("1"));
	}
}
