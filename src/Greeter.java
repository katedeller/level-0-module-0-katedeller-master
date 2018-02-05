import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hi " + answer);
	}

}
