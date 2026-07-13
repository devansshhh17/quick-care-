import java.lang.*;
import javax.swing.SwingUtilities;
import Classes.*;
import Frames.*;
import Interfaces.*;

public class Start{
	public static void main(String []args){
		SwingUtilities.invokeLater(() -> {
			Login login = new Login();
			login.setVisible(true);
		});
	}
}
