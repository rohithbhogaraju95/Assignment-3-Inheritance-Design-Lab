package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divide {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(25,5);
		assertEquals(5, output);//positive
		//assertEquals(6, output);//negative
	}

}
