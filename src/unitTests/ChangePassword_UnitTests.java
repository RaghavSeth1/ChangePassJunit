package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import passChange.ChangePasswords;

/**
 * @author Raghav Seth
 *
 */
class ChangePassword_UnitTests {
	//ChangePasswords unit_tests=new  ChangePasswords();

	@Test
	@DisplayName("Validate the function return TRUE for valid password")
	void valid_Password() {	
		
		assertEquals(true, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Blkh9876!@uirqrewq"));
	}
	
	@Test
	@DisplayName("Validate the function return FALSE for Invalid length password")
	void invalid_Length() {
		
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Blkh9"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when User entered old password not equal to System Password")
	void system_Password_DoesNotMatch() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234", "Blkh9876!@uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE more than 4 special chars")
	void only_four_special_Chars() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234", "Blkh9876!@#@#@rewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE other than defined special char")
	void only_allowed_special_Chars() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234", "Blkh9876!@ui~~~)qrewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when no special character provided")
	void no_special_Chars() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234", "Blkh987665uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when no UPPER case character provided")
	void no_upperCase_Chars() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234", "blkh9876!@uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when no LOWER case character provided")
	void no_lowerCase_Chars() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234", "BUYR9876!@RIZXCLMJ"));
	}
	@Test
	@DisplayName("Validate the function return FALSE when no NUMERICS provided")
	void no_numerics() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234", "BlkhpQWE!@uirqrewq"));
	}
	
	@Test
	@DisplayName("Validate the levenshtien logic return FALSE for similar password")
	//Distance comes out less than 8.0 --> Similar Passwords
	void similar_password() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Asdf5678@#qwerttyy1"));
	}
	@Test
	@DisplayName("Validate the levenshtien logic for return TRUE -Boundary test")
	//Distance comes out more than 8.0 --> Not similar Passwords
	void similar_password_boundary() {
		
		assertEquals(true, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Asdf1234@$lkjhgfda"));
	}
	
	@Test
	@DisplayName("Validate the function returnd TRUE when less than half of password is numeric-EVEN Length-18 ")
	//18/2 =9 ==> Only 8 digits so should return true
	void numeric_validation_EVEN() {
		
		assertEquals(true, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Blkh!@ui88765433qe"));
	}
	
	@Test
	@DisplayName("Validate the function returns TRUE when less than half of password is numeric-ODD Length-19 ")
	//19/2 =9 ==> Only 8 digits so should return true
	void numeric_validation_ODD() {
		
		assertEquals(true, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Blkh!@ui88765433qew"));
	}
	@Test
	@DisplayName("Validate the function returns False when more than half of password is numeric Length-19 ")
	//19/2 =9 ==> 10 digits so should return FALSE
	void numeric_validation_negative() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Blkh!@ui8876543347w"));
	}
	
	@Test
	@DisplayName("Validate the function returns TRUE when repeated chars exactly 4 (BBBB) ")
	
	void repeated_Chars_Validation_caps() {
		
		assertEquals(true, ChangePasswords.changePass("Asdf1234@#qwerttyy", "BBBBl876!@uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function returns TRUE when repeated chars exactly 4 (pppp) ")

	void repeated_Chars_Validation() {
		
		assertEquals(true, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Bpppp876!@uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function returns TRUE when repeated chars exactly 4 (pppp) ")

	void repeated_Chars_Validation_negative1() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Bppppp876!@uirqrewq"));
	}
	@DisplayName("Validate the function returns TRUE when repeated chars multiple but not at one place (pppp) ")

	void repeated_Chars_Validation_negative2() {
		
		assertEquals(true, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Bp8p7p6!@uirprepqp"));
	}
	
	
	
	
	
	
	
	/* ---------------MORE NEGATIVE SCENARIOS--------------------- */
	@Test
	@DisplayName("Validate the function returns FALSE for BLANK NEW PASSWORD")
	
	void blank_new_password() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234@#qwerttyy", ""));
	}
	@Test
	@DisplayName("Validate the function returns FALSE for BLANK OLD PASSWORD")
	
	void blank_old_password() {
		
		assertEquals(false, ChangePasswords.changePass("", "Blkh9876!@uirqrewq"));
	}
	@Test
	@DisplayName("Validate the function returns FALSE for BLANK OLD & NEW PASSWORD")
	
	void blank_both_password() {
		
		assertEquals(false, ChangePasswords.changePass("", ""));
	}
	
	@Test
	@DisplayName("Validate the function returns FALSE for ALL SPACES in new Password")
	
	void allSpaces_new_password() {
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234@#qwerttyy", "                     "));
	}
	@Test
	@DisplayName("Validate the function return FALSE for length of password =17")
	void password_Length_Boundary() {	
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Blkh9876!@uirqrew"));
	}
	@Test
	@DisplayName("Validate the function return FALSE for password containing few WHITESPACES")
	void password_contains_Spaces() {	
		
		assertEquals(false, ChangePasswords.changePass("Asdf1234@#qwerttyy", "Blkh9876!@ui  qrew"));
	}


}
