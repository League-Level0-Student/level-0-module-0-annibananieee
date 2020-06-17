package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("Hello World");
	JOptionPane.showMessageDialog(null, "Hi");
	
		String input = JOptionPane.showInputDialog("How are you");
		JOptionPane.showMessageDialog(null, input);
		
		String input1 = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Hello "+input1);
}
}
