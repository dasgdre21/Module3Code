public class Module3Code {

	public static String reverse(String s) {
		
		if (s.length() <= 1) { //base case, terminates with 1 or less characters remaining
			
			return s;
		}
		
		//returns last character and calls method again with remainder of the String
		return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));	
	}	
}
