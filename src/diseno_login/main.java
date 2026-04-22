package diseno_login;

import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ventana miniventana = new ventana();
		miniventana.setSize(400, 400);
		
		//miniventana.getContentPane().removeAll();
		miniventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miniventana.menu();
		//miniventana.register();
		miniventana.setVisible(true);
		
		/*ventana v = new ventana();
		v.getContentPane().removeAll();
		v.users();
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

	}

}
