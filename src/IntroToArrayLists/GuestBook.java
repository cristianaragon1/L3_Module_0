package IntroToArrayLists;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook {
	public static void main(String[] args) {
		GuestBook guestbook = new GuestBook();
		guestbook.createUI();
	}
	JFrame newframe = new JFrame("Guest Book");
	JPanel newpanel = new JPanel();
	JButton addname = new JButton("Add Name");
	JButton viewnames = new JButton("View Names");
	public void createUI() {
		newframe.setVisible(true);
		newframe.add(newpanel);
		newpanel.add(addname);
		newpanel.add(viewnames);
		if (addname) {
			JOptionPane.showInputDialog("Enter a Name");
		}
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
