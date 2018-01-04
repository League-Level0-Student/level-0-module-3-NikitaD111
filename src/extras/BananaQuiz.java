//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String b = JOptionPane.showInputDialog("DOES YOU LIKE BANANAS");
		// 2. if they say no,
		if (b.equals("No") || b.equals("no") || b.equals("nej")) {
			JOptionPane.showMessageDialog(null, "YOU S CRAZY");
		} else if (b.equals("Yes") || b.equals("yes") || b.equals("ды")) {
			String a = JOptionPane.showInputDialog("WHAT IS YOUR FAVORITE HOPPY");
			JOptionPane.showMessageDialog(null, a + " IS MUCH BETTER WITH BANANAS");
		} else {
			JOptionPane.showMessageDialog(null, "YOU ARE BANANAS");

		}
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}
}
