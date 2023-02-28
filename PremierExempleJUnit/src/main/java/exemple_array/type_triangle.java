package exemple_array;

public class type_triangle {
	
	public static int triangle(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {

			return 0;

			}
			else if (a == b && b == c) {
			return 1;

			}
			else if (a == b || b == c || a == c) {
			return 2;

			}		
			else {
			return 3;

			}
	}
}
