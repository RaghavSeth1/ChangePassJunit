package systemUtils;

import info.debatty.java.stringsimilarity.Levenshtein;

/**
 * @author Raghav Seth
 *
 */
public class LavenshteinDistAlgo {
	
	/**
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	public float levenshtien(String oldPassword , String newPassword) {
		Levenshtein l = new Levenshtein();
		return (int) l.distance(oldPassword, newPassword);	
		
	}


	
}
