package passChange;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import systemUtils.LavenshteinDistAlgo;
import systemUtils.SystemPassMock;

/**
 * @author Raghav Seth
 *
 */
public class ChangePasswords extends SystemPassMock {

	/**
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	public static boolean changePass(String oldPassword,String newPassword) {

		/* Mock System Password */		
		String systemPass= systemPassMock();

//******************Future Code to read regex from properties file.**********************
		
		/*
		 * Properties prop = new Properties(); try { prop.load(new
		 * FileInputStream("regex.properties")); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
//***************************************************************************************
		
		/* At least 1 Upper case, 1 lower case ,least 1 numeric, 1 special character */
		/* List of special chars only !@#$&*   */
		
		String pattern_case =  "^(?=.*[a-z])(?=."
				+ "*[A-Z])(?=.*\\d)"
				+ "(?=.*[!@#$&*]).+$" ;

		/* At least 18 alphanumeric characters */
		String pattern_length="^.{18,}$";
		
		/* Check if more than 4 repeated digits coming at once */
		String pattern_chars=".*([a-zA-Z])\\1{4,}.*" ;
	

		/* No more than 4 special characters */
		int count_special_chars = newPassword.replaceAll("[^!@#$&*]", "").length();

		/* 50 % of password should not be a number	 */
		int length_of_new_password=newPassword.length();
		int count_of_numerics_in_password=newPassword.replaceAll("[^0-9]", "").length();

		/* Password should not be similar to old password - Levenshtein Algo Distancing	 */
		/*Download Jars from https://jar-download.com/artifacts/info.debatty/java-string-similarity/1.0.1/source-code */

		LavenshteinDistAlgo lda=new LavenshteinDistAlgo();
		float levDistance=lda.levenshtien(oldPassword,newPassword);
		
		/* Check if newPassword Contains WHITESPACES */
		Pattern whitespace = Pattern.compile("\\s");
		Matcher matcher = whitespace.matcher(newPassword);
		boolean found = matcher.find();
		
		

		if (newPassword.matches(pattern_case)==true
				& newPassword.matches(pattern_length)==true
				& newPassword.matches(pattern_chars)==false
				& count_special_chars<=4 
				& levDistance>8.0
				& count_of_numerics_in_password<length_of_new_password/2
				& oldPassword.equals(systemPass)
				& found==false)
		{
			return true;
		}

		return false;

	}

}
