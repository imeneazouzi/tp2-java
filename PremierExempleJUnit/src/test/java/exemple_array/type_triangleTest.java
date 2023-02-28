package exemple_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class type_triangleTest {

	@Test
	void test() {
				//arrange 
				int a=1;
				int b=1;
				int c=1;
				
				//act
				int result = type_triangle.triangle(a, b, c);
				
				//assert
				assertEquals(result, 1);
	}

}
