package passChange;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ChangePassword_UnitTests {
	ChangePasswords unit_tests=new  ChangePasswords();
	@Test
	@DisplayName("Validate the function return TRUE for valid password")
	void valid_Password() {
		
		
		assertEquals(true, unit_tests.changePass("Asdf1234@#qwerttyy", "Blkh9876!@uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE for Invalid length password")
	void invalid_Length() {
		
		
		assertEquals(false, unit_tests.changePass("Asdf1234@#qwerttyy", "Blkh9"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when User entered old password not equal to System Password")
	void system_Password_DoesNotMatch() {
		
		assertEquals(false, unit_tests.changePass("Asdf1234", "Blkh9876!@uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE more than 4 special chars")
	void only_four_special_Chars() {
		
		assertEquals(false, unit_tests.changePass("Asdf1234", "Blkh9876!@#@#@rewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE other than defined special char")
	void only_allowed_special_Chars() {
		
		assertEquals(false, unit_tests.changePass("Asdf1234", "Blkh9876!@ui)qrewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when no special character provided")
	void no_special_Chars() {
		
		assertEquals(false, unit_tests.changePass("Asdf1234", "Blkh987665uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when no UPPER case character provided")
	void no_upperCase_Chars() {
		
		assertEquals(false, unit_tests.changePass("Asdf1234", "blkh9876!@uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when no LOWER case character provided")
	void no_lowerCase_Chars() {
		
		assertEquals(false, unit_tests.changePass("Asdf1234", "BUYR9876!@RIZXCLMJ"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when no NUMERICS provided")
	void no_numerics() {
		
		assertEquals(false, unit_tests.changePass("Asdf1234", "BlkhpQWE!@uirqrewq"));
	}
	
	
	//More than 50% password in numeric
	//SPACE validation - Enter only spaces in new password of 18 length
	//blank password new
	//blank password old
	//both blank 

}
