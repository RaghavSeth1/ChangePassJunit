package passChange;

public class ChangePasswords {
	//final public  String systemPass="Asdf1234@#qwerttyy";

	public static boolean changePass(String oldPassword,String newPassword) {
		String systemPass="Asdf1234@#qwerttyy";

		/*
		 * At least 1 Upper case, 1 lower case ,least 1 numeric, 1 special character
		 * List of special chars only !@#$&*
		 */

		String pattern_case =  "^(?=.*[a-z])(?=."
				+ "*[A-Z])(?=.*\\d)"
				+ "(?=.*[!@#$&*]).+$" ;

		/* At least 18 alphanumeric characters */
		String pattern_length="^.{18,}$";

		/* No more than 4 special characters */

		int count_special_chars = newPassword.replaceAll("[^!@#$&*]", "").length();

		/* 50 % of password should not be a number	 */
		int length_of_new_password=newPassword.length();
		int count_of_numerics_in_password=newPassword.replaceAll("[^0-9]", "").length();



		if (newPassword.matches(pattern_case)==true
				& newPassword.matches(pattern_length)==true
				& count_special_chars<=4 

				& count_of_numerics_in_password<length_of_new_password/2
				& oldPassword.equals(systemPass))
		{
			return true;
		}
		//System.out.println("Password Condition not matched , Please retry");
		return false;

	}




}
