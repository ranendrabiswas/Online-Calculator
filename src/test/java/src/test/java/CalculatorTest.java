package src.test.java;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Calculator;

public class CalculatorTest {
	
	static Calculator obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		obj=new Calculator();
	}

	@Test
	public void testAdd() {
		int result=obj.add(2,3);
		assertEquals(5, result);
		//fail("Not yet implemented");
	}

}
