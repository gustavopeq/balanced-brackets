import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	
	@Test
	void testPerfectSituation() {
		boolean output = Main.isBalanced("([]){([()])}");
		assertEquals(true, output);
	}
	
	@Test
	void testFirstClosing() {
		boolean output = Main.isBalanced("]()[]{}");
		assertEquals(false, output);
	}
	
	@Test
	void testLastOpening() {
		boolean output = Main.isBalanced("{()[]{{");
		assertEquals(false, output);
	}
	
	@Test
	void testLastMissing() {
		boolean output = Main.isBalanced("{()[{}");
		assertEquals(false, output);
	}

}
