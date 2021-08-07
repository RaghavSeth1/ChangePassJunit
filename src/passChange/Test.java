package passChange;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public void  changePass(String oldPassword,String newPassword) {
		String systemPass="Asdf1234@#qwerttyy";		
		/* Characters should not be repeated more than 4 times	 */

		//Pattern pattern = Pattern.compile(".*([a-zA-Z])\\1{3,}.*");
		//Matcher matcher = pattern.matcher(newPassword);		
		//boolean matches = matcher.matches();
		//System.out.print(matches);
		String pattern_chars=".*([a-zA-Z])\\1{4,}.*" ;
		if(newPassword.matches(pattern_chars)==true) {
			System.out.println("Incorrect pass");
		}
		else {
			System.out.println("Password Ok");
		}
		
		

	
	}
	public static void main(String... args) {
		Test t=new Test();
		t.changePass("Asdf1234@#qwerttyy", "BBlkh9876!@uirqrewqqqq");
		
		
	}




}
