package diseno_login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventana extends JFrame {
	public ventana() {
		
		// ventana principal
		this.setSize(915, 600);
		this.setMinimumSize(new Dimension(915, 600));
		this.setMaximumSize(new Dimension(915, 600));
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
		
		// pabel lado derecho
		JPanel register_container = new JPanel();
		register_container.setOpaque(true);
		register_container.setBackground(Color.lightGray); 
		register_container.setSize(450, 600);
		register_container.setLayout(null);
		register_container.setLocation(450, 0); 
		this.add(register_container);
		
		// titulo Registro
		JLabel title_register = new JLabel();
		title_register.setText("REGISTRO");
		title_register.setSize(350, 60);
		title_register.setOpaque(true);
		title_register.setLocation(50, 40);
		title_register.setBackground(Color.white); 
		title_register.setFont(new Font("Arial", Font.BOLD, 28));
		title_register.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(title_register);
		
		// etiqueta nombre de usuario
		JLabel reg_user_tag = new JLabel("NOMBRE DE USUARIO:");
		reg_user_tag.setBounds(50, 115, 350, 25);
		reg_user_tag.setBackground(Color.lightGray);
		reg_user_tag.setOpaque(true);
		reg_user_tag.setHorizontalAlignment(JLabel.CENTER);
		reg_user_tag.setFont(new Font("Arial", Font.BOLD, 14));
		register_container.add(reg_user_tag);
		
		// campo de texto nombre de usuario
		JTextField reg_username = new JTextField();
		reg_username.setBounds(50, 140, 350, 35);
		reg_username.setFont(new Font("Arial", Font.BOLD, 18));
		register_container.add(reg_username);
		
		// etiqueta bio
		JLabel bio_tag = new JLabel("BIO");
		bio_tag.setBounds(50, 185, 350, 25);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setFont(new Font("Arial", Font.BOLD, 14));
		register_container.add(bio_tag);
		
		// area de texto bio
		JTextArea bio_text = new JTextArea();
		bio_text.setBounds(50, 210, 350, 60);
		bio_text.setFont(new Font("Arial", Font.PLAIN, 14));
		bio_text.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		register_container.add(bio_text);
		
		// etiqueta preferencias
		JLabel pref_tag = new JLabel("PREFERENCIAS");
		pref_tag.setBounds(50, 280, 350, 25);
		pref_tag.setHorizontalAlignment(JLabel.CENTER);
		pref_tag.setFont(new Font("Arial", Font.BOLD, 14));
		register_container.add(pref_tag);
		
		// opciones de preferencias
		JCheckBox sweet_opcion = new JCheckBox("Dulces");
		sweet_opcion.setBounds(60, 305, 80, 25);
		sweet_opcion.setOpaque(false); 
		sweet_opcion.setFont(new Font("Arial", Font.BOLD, 12));
		register_container.add(sweet_opcion);
		
		JCheckBox salty_option = new JCheckBox("Salado");
		salty_option.setBounds(160, 305, 80, 25);
		salty_option.setOpaque(false);
		salty_option.setFont(new Font("Arial", Font.BOLD, 12));
		register_container.add(salty_option);
		
		JCheckBox healthy_option = new JCheckBox("Saludable");
		healthy_option.setBounds(260, 305, 100, 25);
		healthy_option.setOpaque(false);
		healthy_option.setFont(new Font("Arial", Font.BOLD, 12));
		register_container.add(healthy_option);
		
		// etiqueta terminos
		JLabel terms_tag = new JLabel("TÉRMINOS");
		terms_tag.setBounds(50, 340, 350, 25);
		terms_tag.setBackground(Color.lightGray);
		terms_tag.setOpaque(true);
		terms_tag.setHorizontalAlignment(JLabel.CENTER);
		terms_tag.setFont(new Font("Arial", Font.BOLD, 14));
		register_container.add(terms_tag);
		
		// radiobuttons de terminos
		JRadioButton accept_terms = new JRadioButton("Acepto los términos");
		accept_terms.setBounds(60, 370, 160, 25);
		accept_terms.setOpaque(false);
		accept_terms.setFont(new Font("Arial", Font.BOLD, 12));
		register_container.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("No acepto los términos");
		reject_terms.setBounds(230, 370, 170, 25);
		reject_terms.setOpaque(false);
		reject_terms.setFont(new Font("Arial", Font.BOLD, 12));
		register_container.add(reject_terms);
		
		// condicion de radiobuttons para que solo se seleccione uno
		ButtonGroup terms_group = new ButtonGroup();
		terms_group.add(accept_terms);
		terms_group.add(reject_terms);
		
		// jcombobox de colonias
		String[] colonias = {"Camino Real", "La Fuente", "Villas Del Encanto"};
		JComboBox<String> list = new JComboBox<>(colonias);
		list.setBounds(50, 410, 350, 30);
		list.setFont(new Font("Arial", Font.BOLD, 12));
		register_container.add(list);
		
		// boton crear cuenta inferior
		JButton btn_crear = new JButton();
		btn_crear.setText("Crear cuenta");
		btn_crear.setLocation(50, 460);
		btn_crear.setSize(350, 50);
		btn_crear.setFont(new Font("Arial", Font.BOLD, 22));
		register_container.add(btn_crear);
		
		contenedor.repaint();
		contenedor.revalidate();
		register_container.repaint();
		register_container.revalidate();
	}
	
	

}
