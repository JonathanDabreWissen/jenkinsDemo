package jenkinsDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorMainTest {

	
	@Test
	void additionTest() {
		System.out.println("Addition test started");
		Calculator c1 = new Calculator();
		
		c1.add(10, 20);
		
		assertEquals(30, c1.additionResult);
		System.out.println("Addition test ended");
	}
	
	@Test
	void subtractionTest() {
		System.out.println("Subtraction test started");
		Calculator c2 = new Calculator();
		
		c2.sub(30, 10);
		
		assertEquals(20, c2.subtractionResult);
		System.out.println("Subtraction test ended");
	}
	
	@Test
	void multiplicationTest() {
		System.out.println("Multiplication test started");
		Calculator c3 = new Calculator();
		c3.mul(10, 20);
		
		assertEquals(200, c3.multiplicationResult);
		System.out.println("Multiplication test ended");
	}

	@Test
	void divisionTest(){
		System.out.println("Division test started");
		Calculator c4 = new Calculator();
		c4.mul(20, 10);
		
		assertEquals(2, c4.divisionResult);
		System.out.println("Division test ended");
	
	}

}
