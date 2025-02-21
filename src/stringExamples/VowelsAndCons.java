/*
 * this program is to find the count number 
 * the vowels and consonants in the given string
 */

package stringExamples;

import java.util.Scanner;

public class VowelsAndCons {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		countVowelsAndConsonants(str);
		
	}

	private static void countVowelsAndConsonants(String str) {

		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		
		int vowelsCount = 0 , consonantsCount = 0;
		
		for(int i = 0; i<ch.length; i++) {
			if(ch[i] == 'a' || ch[i] == 'e' ||
			   ch[i] == 'i'	|| ch[i] == 'o'	||
			   ch[i] == 'u'	) {
				vowelsCount++;
			}else if(!Character.isDigit(ch[i]) && ch[i] != ' ' && ch[i] != '@' &&
					 ch[i] != '#' && ch[i] != '$' && ch[i] != '!' && ch[i] != '&') {
				consonantsCount++;
			}
		}
		
		System.out.println("vowels Count is " + vowelsCount );
		System.out.println("consonants Count is " + consonantsCount);
		
	}

}
