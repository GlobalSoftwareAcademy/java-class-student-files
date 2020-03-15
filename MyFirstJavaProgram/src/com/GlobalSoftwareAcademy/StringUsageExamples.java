package com.GlobalSoftwareAcademy;

// This line is a comment that is ignored by Java
/* These two lines are ignored by Java
 * The second line.
 */
public class StringUsageExamples {

	public static void main(String[] args) {
		String theFirstWord = "Stocks";
		System.out.println("theFirstWord=" + theFirstWord);
		
		String theSecondWord = " Return Higher Profits Than Mutual Funds";
		System.out.println("theSecondWord=" + theSecondWord);
		
		String theCombinedSentence = theFirstWord + theSecondWord;
		System.out.println("theCombinedSentence is:" + theCombinedSentence);
		
		char theFirstLetter = theFirstWord.charAt(0);
		System.out.println("theFirstLetter=" + theFirstLetter);
		
		int length = theFirstWord.length();
		System.out.println("word length=" + length);
		
		String convertedToUppercase = theFirstWord.toUpperCase();
		System.out.println("convertedToUppercase="+convertedToUppercase);
	}
}
