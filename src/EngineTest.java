import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EngineTest {

	private final Engine engine = new Engine();

	
	@Test 
	void additionTest() { 
		assertEquals("3.0", engine.compute("1","2","+")); 
	}
	
	@Test
	void subtractionTest() {
		assertEquals("-2.0", engine.compute("3", "5", "\u02D7"));
	}
	
	@Test
	void multiplicationTest() {
		assertEquals("100.0", engine.compute("5", "20", "\u00D7"));
	}
	
	@Test
	void divisionTest() {
		assertEquals("3.0", engine.compute("12", "4", "\u00F7"));
	}
	
	@Test
	void modTest() {
		assertEquals("0.0", engine.compute("100", "2", "mod"));
	}
	

}
