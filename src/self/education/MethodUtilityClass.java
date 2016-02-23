package self.education;

public class MethodUtilityClass {

	public String startWith(String string) {
		return String.valueOf(string.charAt(0));
	}
	
	public static String endWith(String string) {
		return upperCase(String.valueOf(string.charAt(string.length()-1)));
	}
	
	private static String upperCase(String string) {
		return string.toUpperCase();
	}

}
