package diseno_login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame {
	public ventana() {
		
		// ventana principal
		this.setSize(465, 600);
		this.setMinimumSize(new Dimension(465, 600));
		this.setMaximumSize(new Dimension(465, 600));
		this.setTitle("Mi ventana");
		this.setLocation(200, 200);
		this.setLayout(null);
				
		// panel 
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.lightGray); 
		contenedor.setSize(450, 600);
		contenedor.setLayout(null);
		contenedor.setLocation(0, 0);
				
		this.add(contenedor);
				
		// titulo centrado
		JLabel title_login = new JLabel();
		title_login.setText("ACCEDER");
		title_login.setSize(350, 60);
		title_login.setOpaque(true);
		title_login.setLocation(50, 40);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial", Font.BOLD, 28));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
				
		// etiqueta nombre de usuario
		JLabel etq_user = new JLabel();
		etq_user.setText("NOMBRE DE USUARIO:");
		etq_user.setSize(350, 30);
		etq_user.setLocation(50, 140);
		etq_user.setFont(new Font("Arial", Font.BOLD, 14));
		contenedor.add(etq_user);
				
		// campo de texto nombre de usuario
		JTextField username = new JTextField();
		username.setSize(350, 40);
		username.setLocation(50, 170);
		username.setFont(new Font("Arial", Font.BOLD, 18));
		contenedor.add(username);
				
		// etiqueta Contraseña
		JLabel etq_contra = new JLabel();
		etq_contra.setText("CONTRASEÑA:");
		etq_contra.setSize(350, 30);
		etq_contra.setLocation(50, 240);
		etq_contra.setFont(new Font("Arial", Font.BOLD, 14));
		contenedor.add(etq_contra);
				
		// campo de texto contraseña
		JTextField contraseña = new JTextField();
		contraseña.setSize(350, 40);
		contraseña.setLocation(50, 270);
		contraseña.setFont(new Font("Arial", Font.BOLD, 18));
		contenedor.add(contraseña);
				
		// casilla usando un JLabel
		JLabel casilla = new JLabel();
		casilla.setSize(20, 20);
		casilla.setOpaque(true);
		casilla.setLocation(50, 330);
		casilla.setBackground(Color.white);
		contenedor.add(casilla);
				
		// etiqueta recordarme
		JLabel recordarme = new JLabel();
		recordarme.setText("Recordarme");
		recordarme.setSize(100, 20);
		recordarme.setLocation(80, 330);
		recordarme.setFont(new Font("Arial", Font.BOLD, 14));
		contenedor.add(recordarme);
				
		// etiqueta olvido su contraseña
		JLabel olvido_contra = new JLabel();
		olvido_contra.setText("¿Olvidó su contraseña?");
		olvido_contra.setSize(180, 20);
		olvido_contra.setLocation(230, 330);
		olvido_contra.setFont(new Font("Arial", Font.BOLD, 14));
				contenedor.add(olvido_contra);
				
		// boton acceder inferior
		JButton acceder = new JButton();
		acceder.setText("Entrar");
		acceder.setLocation(50, 410);
		acceder.setSize(350, 50);
		acceder.setFont(new Font("Arial", Font.BOLD, 22));
		contenedor.add(acceder);
				
		contenedor.repaint();
		contenedor.revalidate();
	}
	

}
