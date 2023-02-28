package exemple_array;

public class StringManger {
	public static String StringReverse(String str) {
		String res= "";
		for(int i=str.length()-1; i>=0; i--) {
		res+=str.charAt(i);
		}
		return res;
		}
}
