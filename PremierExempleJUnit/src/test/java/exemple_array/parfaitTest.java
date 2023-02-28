package exemple_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class parfaitTest {

	@Test
	void test() {
		//arrange 
		int a=4;
		
		
		//act
		boolean result = parfait.nombreParfait(a);
		
		//assert
		assertEquals(result, true);
	}

}
