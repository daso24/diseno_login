package diseno_login;

import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

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
			
			// icono esquina ventana
	        ImageIcon iconoBarra = new ImageIcon("C:/Users/PC/Downloads/f.jfif"); 
	        this.setIconImage(iconoBarra.getImage());
		
			// ventana principal
			this.setSize(625,500);
			this.setMinimumSize(new Dimension(625, 500));
			this.setMaximumSize(new Dimension(625, 500));
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
			
			
			//this.setJMenuBar(barra);
<<<<<<< Updated upstream
			this.calculadora_layaouts();

			this.setVisible(true);
=======
>>>>>>> Stashed changes
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
			
			// logo dentro de la interfaz
	        JLabel logo_empresa = new JLabel();
	        logo_empresa.setBounds(75, 0, 1000, 100); 
	        ImageIcon img_logo = new ImageIcon("C:/Users/PC/Downloads/Fortnite.png"); 
	        Icon esc_logo = new ImageIcon(img_logo.getImage().getScaledInstance(300, 90, Image.SCALE_SMOOTH));
	        logo_empresa.setIcon(esc_logo);
	        contenedor.add(logo_empresa);
						
			// titulo centrado
			JLabel title_login = new JLabel();
			title_login.setText("ACCEDER");
			title_login.setSize(350, 60);
			title_login.setOpaque(true);
			title_login.setLocation(50, 100);
			title_login.setBackground(Color.white);
			title_login.setFont(new Font("Arial", Font.BOLD, 28));
			title_login.setHorizontalAlignment(JLabel.CENTER);
			contenedor.add(title_login);
			
			// icono usuario
	        JLabel icono_user = new JLabel();
	        icono_user.setBounds(20, 205, 25, 25);
	        ImageIcon img_user = new ImageIcon("C:/Users/PC/Downloads/candado.jfif"); 
	        Icon esc_user = new ImageIcon(img_user.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
	        icono_user.setIcon(esc_user);
	        contenedor.add(icono_user);
						
			// etiqueta nombre de usuario
			JLabel etq_user = new JLabel();
			etq_user.setText("NOMBRE DE USUARIO:");
			etq_user.setSize(350, 100);
			etq_user.setLocation(50, 135);
			etq_user.setFont(new Font("Arial", Font.BOLD, 14));
			contenedor.add(etq_user);
						
			// campo de texto nombre de usuario
			JTextField username = new JTextField();
			username.setSize(350, 40);
			username.setLocation(50, 200);
			username.setFont(new Font("Arial", Font.BOLD, 18));
			contenedor.add(username);
			
			// icono contraseña
	        JLabel icono_pass = new JLabel();
	        icono_pass.setBounds(20, 275, 25, 25);
	        ImageIcon img_pass = new ImageIcon("C:/Users/PC/Downloads/user.jfif"); 
	        Icon esc_pass = new ImageIcon(img_pass.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
	        icono_pass.setIcon(esc_pass);
	        contenedor.add(icono_pass);
						
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
			
			// panel imagen grande
	        JPanel panel_imagen = new JPanel();
	        panel_imagen.setSize(465, 600);
	        panel_imagen.setLocation(450, 0);
	        panel_imagen.setLayout(null);
	        this.add(panel_imagen);

	        JLabel imagen_grande = new JLabel();
	        imagen_grande.setSize(465, 600);
	        imagen_grande.setLocation(0, 0);
	        ImageIcon img_fondo = new ImageIcon("C:/Users/PC/Downloads/welcome2.png"); 
	        Icon esc_fondo = new ImageIcon(img_fondo.getImage().getScaledInstance(465, 460, Image.SCALE_SMOOTH));
	        imagen_grande.setIcon(esc_fondo);
	        panel_imagen.add(imagen_grande);
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
		public void calculadora_layaouts() {
			// panel principal
			JPanel main_panel = new JPanel();
			main_panel.setSize(580, 670);
			main_panel.setLocation(0, 0);
			main_panel.setBackground(Color.DARK_GRAY); 
			main_panel.setLayout(new BorderLayout(10, 10)); 
			this.add(main_panel);
			
			// pantalla texto superior norte
			JTextField pant_sup = new JTextField();
			pant_sup.setFont(new Font("Arial", Font.BOLD, 70));
			pant_sup.setHorizontalAlignment(JLabel.RIGHT); 
			main_panel.add(pant_sup, BorderLayout.NORTH);
			
			// panel central
			JPanel panel_botones = new JPanel();
			panel_botones.setLayout(new BorderLayout(10, 10));
			panel_botones.setBackground(Color.DARK_GRAY);
			main_panel.add(panel_botones, BorderLayout.CENTER);
			
			// botones superiores
			JPanel panel_sup = new JPanel();
			panel_sup.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 0));
			panel_sup.setBackground(Color.DARK_GRAY);
			
			JButton boton_mc = new JButton("MC");
			boton_mc.setBackground(Color.WHITE);
			
			JButton boton_m = new JButton("M+");
			boton_m.setBackground(Color.WHITE);
			
			JButton boton_div2 = new JButton("/");
			boton_div2.setBackground(Color.WHITE);
			
			JButton boton_por = new JButton("*");
			boton_por.setBackground(Color.WHITE);
			
			panel_sup.add(boton_mc);
			panel_sup.add(boton_m);
			panel_sup.add(boton_div2);
			panel_sup.add(boton_por);
			
			panel_botones.add(panel_sup, BorderLayout.NORTH);
			
			// teclas de numeros
			JPanel panel_numeros = new JPanel();
			panel_numeros.setLayout(new GridLayout(4, 3, 10, 10)); 
			panel_numeros.setBackground(Color.DARK_GRAY);
			
			JButton boton7 = new JButton("7");
			boton7.setBackground(Color.WHITE);
			JButton boton8 = new JButton("8");
			boton8.setBackground(Color.WHITE);
			JButton boton9 = new JButton("9");
			boton9.setBackground(Color.WHITE);
			JButton boton6 = new JButton("6");
			boton6.setBackground(Color.WHITE);
			JButton boton5 = new JButton("5"); 
			boton5.setBackground(Color.WHITE);
			JButton boton4 = new JButton("4"); 
			boton4.setBackground(Color.WHITE);
			JButton boton3 = new JButton("3"); 
			boton3.setBackground(Color.WHITE);
			JButton boton2 = new JButton("2"); 
			boton2.setBackground(Color.WHITE);
			JButton boton1 = new JButton("1"); 
			boton1.setBackground(Color.WHITE);
			JButton boton0 = new JButton("0"); 
			boton0.setBackground(Color.WHITE);
			JButton boton_punto = new JButton("."); 
			boton_punto.setBackground(Color.WHITE);
			JButton boton_div = new JButton("/"); 
			boton_div.setBackground(Color.WHITE);
			
			panel_numeros.add(boton7); 
			panel_numeros.add(boton8); 
			panel_numeros.add(boton9);
			panel_numeros.add(boton6); 
			panel_numeros.add(boton5); 
			panel_numeros.add(boton4);
			panel_numeros.add(boton3); 
			panel_numeros.add(boton2); 
			panel_numeros.add(boton1);
			panel_numeros.add(boton0); 
			panel_numeros.add(boton_punto); 
			panel_numeros.add(boton_div);
			
			panel_botones.add(panel_numeros, BorderLayout.CENTER);
			
			// botones laterales derechos
			JPanel panel_derecho = new JPanel();
			panel_derecho.setLayout(new GridLayout(4, 1, 10, 10)); 
			panel_derecho.setBackground(Color.DARK_GRAY);
			
			JButton boton_mas = new JButton("+"); 
			boton_mas.setBackground(Color.WHITE);
			JButton boton_menos = new JButton("-"); 
			boton_menos.setBackground(Color.WHITE);
			JButton boton_igual1 = new JButton("="); 
			boton_igual1.setBackground(Color.WHITE);
			JButton boton_igual2 = new JButton("="); 
			boton_igual2.setBackground(Color.WHITE);
			
			panel_derecho.add(boton_mas);
			panel_derecho.add(boton_menos);
			panel_derecho.add(boton_igual1);
			panel_derecho.add(boton_igual2);
			
			panel_botones.add(panel_derecho, BorderLayout.EAST);
		}
		
		public void calc_int() {
			// panel principal
			JPanel calc = new JPanel();
			calc.setSize(1000, 500);
			calc.setLocation(0, 0);
			calc.setLayout(null);
			calc.setBackground(Color.WHITE);
			this.add(calc);
						
			// titulo principal
			JLabel title = new JLabel("Interés");
			title.setBounds(30, 10, 200, 40);
			title.setForeground(Color.RED);
			title.setFont(new Font("Arial", Font.BOLD, 32));
			calc.add(title);
						
			// panel verde
			JPanel panel_ver = new JPanel();
			panel_ver.setBounds(30, 60, 550, 200);
			panel_ver.setBackground(Color.blue);
			panel_ver.setLayout(null);
			calc.add(panel_ver);
						
			// subtitulo del panel verde
			JLabel subt = new JLabel("Calcular interés");
			subt.setBounds(10, 10, 200, 25);
			subt.setFont(new Font("Arial", Font.BOLD, 14));
			panel_ver.add(subt);
						
			// campo apital
			JLabel lbl_cap = new JLabel("Capital:");
			lbl_cap.setBounds(140, 40, 100, 25);
			lbl_cap.setFont(new Font("Arial", Font.BOLD, 16));
			lbl_cap.setHorizontalAlignment(JLabel.RIGHT);
			panel_ver.add(lbl_cap);
						
			JTextField text_cap = new JTextField("1500");
			text_cap.setBounds(250, 40, 100, 25);
			panel_ver.add(text_cap);
						
			// campo tiempo
			JLabel lbl_time = new JLabel("Tiempo:");
			lbl_time.setBounds(140, 75, 100, 25);
			lbl_time.setFont(new Font("Arial", Font.BOLD, 16));
			lbl_time.setHorizontalAlignment(JLabel.RIGHT);
			panel_ver.add(lbl_time);
						
			JTextField text_time = new JTextField("2");
			text_time.setBounds(250, 75, 100, 25);
			panel_ver.add(text_time);
						
			// campo tasa de interes
			JLabel lbl_tasa = new JLabel("Tasa interés:");
			lbl_tasa.setBounds(120, 110, 120, 25);
			lbl_tasa.setFont(new Font("Arial", Font.BOLD, 16));
			lbl_tasa.setHorizontalAlignment(JLabel.RIGHT);
			panel_ver.add(lbl_tasa);
						
			JTextField text_tasa = new JTextField("0.1");
			text_tasa.setBounds(250, 110, 100, 25);
			panel_ver.add(text_tasa);
						
			// boton calcular
			JButton boton_calc = new JButton("Calcular");
			boton_calc.setBounds(200, 150, 90, 30);
			boton_calc.setBackground(Color.DARK_GRAY);
			boton_calc.setForeground(Color.WHITE);
			panel_ver.add(boton_calc);
						
			// boton cancelar
			JButton boton_cancel = new JButton("Cancelar");
			boton_cancel.setBounds(300, 150, 90, 30);
			boton_cancel.setBackground(Color.DARK_GRAY);
			boton_cancel.setForeground(Color.WHITE);
			panel_ver.add(boton_cancel);
						
			// panel rojo
			JPanel panel_rojo = new JPanel();
			panel_rojo.setBounds(30, 290, 550, 90);
			panel_rojo.setBackground(new Color(255, 153, 153)); 
			panel_rojo.setLayout(null);
			calc.add(panel_rojo);
						
			// campo interes resultado
			JLabel lbl_resint = new JLabel("Interes:");
			lbl_resint.setBounds(140, 15, 100, 25);
			lbl_resint.setFont(new Font("Arial", Font.BOLD, 16));
			lbl_resint.setHorizontalAlignment(JLabel.RIGHT);
			panel_rojo.add(lbl_resint);
						
			JTextField text_res_int = new JTextField("315.0000000000002");
			text_res_int.setBounds(250, 15, 160, 25);
			panel_rojo.add(text_res_int);
						
			// campo monto resultado
			JLabel lbl_resmonto = new JLabel("Monto:");
			lbl_resmonto.setBounds(140, 50, 100, 25);
			lbl_resmonto.setFont(new Font("Arial", Font.BOLD, 16));
			lbl_resmonto.setHorizontalAlignment(JLabel.RIGHT);
			panel_rojo.add(lbl_resmonto);
						
			JTextField text_resmonto = new JTextField("1815.0000000000002");
			text_resmonto.setBounds(250, 50, 160, 25);
			panel_rojo.add(text_resmonto);
						
			calc.repaint();
			calc.revalidate();
			
		}
		
		
	
	

}
