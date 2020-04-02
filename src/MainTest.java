import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	Main main = new Main();
	
	@Test
	void testTrue() {
		boolean output = main.isBalanced("([]){([()])}");
		assertEquals(true, output);
	}
	
	@Test
	void testFalse() {
		boolean output = main.isBalanced("]()[]{}");
		assertEquals(false, output);
	}

}
