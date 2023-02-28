package exemple_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class principaleTest {

	@Test
	void test() {
				//arrange 
				int n=4;
				int a=1;
				int b=1;
				int c=1;
				
				
				//act
				boolean result1 = parfait.nombreParfait(n);
				int result2 = type_triangle.triangle(a, b, c);
				
				//assert
				assertEquals(result1, true);
				assertEquals(result2, 1);
	}

}
