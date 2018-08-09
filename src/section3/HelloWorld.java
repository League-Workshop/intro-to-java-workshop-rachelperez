package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"Wanna Play A Game");
	String Bob = JOptionPane.showInputDialog("Enter name");
	JOptionPane.showMessageDialog(null,Bob);
	if(Bob.equalsIgnoreCase("Bob")) {
	JOptionPane.showMessageDialog(null,"Hello Dumbnut");
    }else{
    JOptionPane.showMessageDialog(null, "You're name sucks!!");
}
}
}