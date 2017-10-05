package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Are you happy say something don't waste my time");
		if (a.equals("yes")) {

			JOptionPane.showMessageDialog(null, "keep doing whatever your doing");
		}
		if (a.equals("no")) {
			String r = JOptionPane.showInputDialog("Do you want to be happy");
			if (r.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what your doing");

			}
			if (r.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");

			}
		}
	}
}
