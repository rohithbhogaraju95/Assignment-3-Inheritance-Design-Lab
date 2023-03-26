package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class count {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.count("alphabet");
		assertEquals(2, output);
	}

}
