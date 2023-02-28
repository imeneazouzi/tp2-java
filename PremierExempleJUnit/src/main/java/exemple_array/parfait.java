package exemple_array;

public class parfait {
	public static boolean nombreParfait(int a) {
	    int sommeDiviseurs = 0;
	    for (int i = 1; i <= a/2; i++) {
	        if (a % i == 0) {
	            sommeDiviseurs += i;
	        }
	    }
	    return sommeDiviseurs == a;
	}

}
