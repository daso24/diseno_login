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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
				
			JMenuBar barra = new JMenuBar();
			JMenu archivo = new JMenu("Archivo");
			JMenuItem open = new JMenuItem("Abrir");
			JMenuItem close = new JMenuItem("Cerrar");
			JMenuItem save = new JMenuItem("Guardar");
			JMenuItem newfile = new JMenuItem("Nuevo");
			archivo.add(open);
			archivo.add(close);
			archivo.add(save);
			archivo.add(newfile);
			barra.add(archivo);
			
			JMenu submenu = new JMenu("otros");
			archivo.addSeparator();
			JMenuItem menuitem = new JMenuItem("un item al menu");
			submenu.add(menuitem);
			
			menuitem = new JMenuItem("otro item");
			submenu.add(menuitem);
			archivo.add(submenu);
			
			
			this.setJMenuBar(barra);
			
		
	}
	
		public void login() {
		
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
	
		public void register() {
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
				
			register_container.repaint();
			register_container.revalidate();
			
	}
	
		public void users() {
			// panel principal de usuarios
			JPanel users = new JPanel();
			users.setSize(915, 600);
			users.setLocation(0, 0);
			users.setLayout(null);
			users.setBackground(Color.lightGray);
			this.add(users);
			
			// titulo usuarios
			JLabel users_title = new JLabel("USUARIOS");
			users_title.setBounds(282, 40, 350, 60);
			users_title.setOpaque(true);
			users_title.setBackground(Color.white);
			users_title.setFont(new Font("Arial", Font.BOLD, 28));
			users_title.setHorizontalAlignment(JLabel.CENTER);
			users.add(users_title);
			
			// contenedor para el cuadro total de usuarios
			JPanel total_panel = new JPanel();
			total_panel.setBounds(50, 120, 250, 80);
			total_panel.setBackground(Color.white);
			total_panel.setLayout(null);
			users.add(total_panel);
			
			// etiqueta total de usuarios
			JLabel total_tag = new JLabel("Total de usuarios");
			total_tag.setBounds(0, 15, 250, 20);
			total_tag.setFont(new Font("Arial", Font.BOLD, 14));
			total_tag.setHorizontalAlignment(JLabel.CENTER);
			total_panel.add(total_tag);
			
			// numero de usuarios
			JLabel total_num = new JLabel("50");
			total_num.setBounds(0, 40, 250, 30);
			total_num.setFont(new Font("Arial", Font.BOLD, 28));
			total_num.setHorizontalAlignment(JLabel.CENTER);
			total_panel.add(total_num);
			
			// boton exportar
			JButton export = new JButton("Exportar");
			export.setBounds(630, 180, 100, 30);
			export.setFont(new Font("Arial", Font.BOLD, 14));
			users.add(export);
			
			// botón añadir
			JButton add = new JButton("Añadir");
			add.setBounds(750, 180, 100, 30);
			add.setFont(new Font("Arial", Font.BOLD, 14));
			users.add(add);
			
			// configuracion de la tabla
			String [] title_head = {"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"};
			String [][] table_conted = {
					{"2024012", "Roberto", "Martín", "8vo", "7.4", "Editar/Borrar"},
					{"2024013", "Víctor", "Martín", "5to", "8.4", "Editar/Borrar"},
					{"2024014", "Elena", "Romero", "9no", "8.2", "Editar/Borrar"},
					{"2024015", "Alba", "García", "1ro", "7.6", "Editar/Borrar"},
					{"2024016", "Carmen", "Alonso", "1ro", "8.3", "Editar/Borrar"},
					{"2024017", "Sara", "Martín", "9no", "6.7", "Editar/Borrar"},
					{"2024018", "Nerea", "Suárez", "1ro", "6.5", "Editar/Borrar"},
					{"2024019", "Juan", "Moreno", "7mo", "9.1", "Editar/Borrar"},
					{"2024020", "Clara", "Nuñez", "5to", "10.0", "Editar/Borrar"},
					{"2024021", "Nerea", "Gil", "7mo", "8.0", "Editar/Borrar"},
					{"2024022", "Daniel", "Iglesias", "1ro", "7.4", "Editar/Borrar"},
					{"2024023", "Irene", "Alonso", "2do", "9.8", "Editar/Borrar"},
					{"2024024", "Alba", "Iglesias", "5to", "6.8", "Editar/Borrar"},
					{"2024025", "Juan", "Martínez", "6to", "9.3", "Editar/Borrar"},
					{"2024026", "Fernando", "Álvarez", "8vo", "7.7", "Editar/Borrar"},
					{"2024027", "Javier", "Torres", "2do", "9.6", "Editar/Borrar"},
					{"2024028", "Silvia", "García", "4to", "8.1", "Editar/Borrar"},
					{"2024029", "Raúl", "Castro", "6to", "9.3", "Editar/Borrar"},
					{"2024030", "Roberto", "Suárez", "6to", "8.0", "Editar/Borrar"},
					{"2024031", "Rosa", "Serrano", "2do", "6.6", "Editar/Borrar"},
					{"2024032", "Julia", "Morales", "5to", "8.2", "Editar/Borrar"},
					{"2024033", "Marta", "Torres", "8vo", "7.8", "Editar/Borrar"},
					{"2024034", "Miguel", "Ortega", "8vo", "9.1", "Editar/Borrar"},
					{"2024035", "Sara", "López", "3ro", "9.3", "Editar/Borrar"},
					{"2024036", "Jorge", "Gil", "7mo", "9.3", "Editar/Borrar"},
					{"2024037", "Víctor", "Ramos", "5to", "8.6", "Editar/Borrar"},
					{"2024038", "Alba", "Serrano", "4to", "7.2", "Editar/Borrar"},
					{"2024039", "Daniel", "Ramos", "5to", "9.5", "Editar/Borrar"},
					{"2024040", "Sofía", "Ortiz", "6to", "6.7", "Editar/Borrar"},
					{"2024041", "Irene", "Iglesias", "7mo", "9.2", "Editar/Borrar"},
					{"2024042", "Teresa", "Sánchez", "2do", "9.8", "Editar/Borrar"},
					{"2024043", "Paula", "Ortega", "5to", "9.8", "Editar/Borrar"},
					{"2024044", "Paula", "Navarro", "2do", "6.6", "Editar/Borrar"},
					{"2024045", "Teresa", "Romero", "8vo", "8.7", "Editar/Borrar"},
					{"2024046", "Pablo", "Castro", "5to", "8.1", "Editar/Borrar"},
					{"2024047", "Teresa", "Torres", "5to", "9.3", "Editar/Borrar"},
					{"2024048", "Sergio", "Vázquez", "3ro", "9.0", "Editar/Borrar"},
					{"2024049", "Pedro", "Alonso", "6to", "8.8", "Editar/Borrar"},
					{"2024050", "Raúl", "Ramos", "9no", "8.3", "Editar/Borrar"},
					{"2024051", "Carmen", "Marín", "3ro", "7.9", "Editar/Borrar"},
					{"2024052", "Nerea", "Gutiérrez", "2do", "9.7", "Editar/Borrar"},
					{"2024053", "Roberto", "Navarro", "7mo", "8.8", "Editar/Borrar"},
					{"2024054", "Víctor", "Rodríguez", "2do", "8.0", "Editar/Borrar"},
					{"2024055", "Lucía", "Díaz", "2do", "6.7", "Editar/Borrar"},
					{"2024056", "Julia", "Rodríguez", "5to", "7.9", "Editar/Borrar"},
					{"2024057", "Alejandro", "Fernández", "8vo", "7.3", "Editar/Borrar"},
					{"2024058", "Beatriz", "Ortiz", "8vo", "6.8", "Editar/Borrar"},
					{"2024059", "Víctor", "Torres", "9no", "9.7", "Editar/Borrar"},
					{"2024060", "Sergio", "Álvarez", "4to", "7.7", "Editar/Borrar"},
					{"2024061", "Clara", "Gil", "9no", "9.2", "Editar/Borrar"}
			};
			
			JTable users_table = new JTable(table_conted, title_head);
			users_table.setFont(new Font("Arial", Font.PLAIN, 12));
			users_table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
			
			// JScrollPane para poder ver los encabezados y hacer scroll
			JScrollPane scrollpane = new JScrollPane(users_table);
			scrollpane.setBounds(50, 220, 800, 300);
			users.add(scrollpane);
			
			users.repaint();
			users.revalidate();
	}
		
		
	
	

}
