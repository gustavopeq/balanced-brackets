import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	
	@Test
	void testTrue() {
		boolean output = Main.isBalanced("([]){([()])}");
		assertEquals(true, output);
	}
	
	@Test
	void testFalse() {
		boolean output = Main.isBalanced("]()[]{}");
		assertEquals(false, output);
	}

}
