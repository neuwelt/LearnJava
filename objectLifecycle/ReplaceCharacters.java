/**
 * Author:		Isaac Neuwelt
 * Date:		29.04.2023
 * Description:	Program that reads a string from prompt, deletes, duplicates and replaces defined characters respectively
 * Update:		Can be modified to prompt the user to enter characters from console
 */

package LearnJava.objectLifecycle;

import java.util.Scanner;

public class ReplaceCharacters {

	public static void replace() {

		//	Scanner class method nextLine()
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();


		//	pass input String object to StringBuffer
		//	gives same as calling StringBuffer method append with -> sb.append(input);
		StringBuffer sb = new StringBuffer(input);


		for (int i = 0; i < sb.length()-1; i++) {

			while (sb.charAt(i) == 'a' || sb.charAt(i) == 'e') {

				//	delete character at index i if it's a or e
				//	tried using if here, but some instances of are not deleted
				sb.deleteCharAt(i);

			}

			if (sb.charAt(i) == 'i') {

				//	inserts char 'i' at offset index i+1
				//	increment index by 1
				sb.insert(i + 1, sb.charAt(i));
				i++;

			} else if (sb.charAt(i) == 'o') {

				//	inserts char 'o' at offset index i+1
				//	increment index by 1
				sb.insert(i + 1, sb.charAt(i));
				i++;

			} else if (sb.charAt(i) == 'u') {

				//	set character at index i as x
				sb.setCharAt(i, 'x');
			}
		}

		System.out.println("Output:	" + sb);
	}

}
