
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 4th";
		String dadsBirthday = "June 27th";
		String myBirthday = "August 16th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String a = JOptionPane.showInputDialog("Which birthday do you want.");
		// 3. Print out what the user typed
		System.out.println(a);
		// 4. if user asked for "mom"
		if (a.equals("mom")) {
			System.out.println(momsBirthday);
		}
		// print mom's birthday
		/// if(a.equals(*))
		// 5. if user asked for "dad"
		else if (a.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		// print dad's birthday
		// 6. if user asked for your name
		else if (a.equals("TAQUITO")) {
			System.out.println(myBirthday);
		}
		// print myBirthday
		// 7. otherwise print "Sorry, I don't remember that person's birthday!"
		else {
			System.out.println("Soryy, I don't remember that person's birthday!");
		}
	}
}
