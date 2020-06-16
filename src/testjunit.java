import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testjunit {

	@Test
	void test() {
		TestEuroBitCoin c = new TestEuroBitCoin();
		if (Integer.parseInt(c.test()) > 0.20) {
			assertTrue(true);
		}
	}

}
