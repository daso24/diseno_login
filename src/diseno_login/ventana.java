package diseno_login;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.SwingUtilities;

	public class ventana extends JFrame {
		private boolean turnoX = true; 
	    private String[] tableroLogico = new String[9]; 
	    private BotonGato[] botonesGato = new BotonGato[9];
	    private int victoriasX = 0;
	    private int victoriasO = 0;
	    private JLabel lblMarcadorX;
	    private JLabel lblMarcadorO;
	    
	    public class BotonGato extends JButton {
	        private int posicion;

	        public BotonGato(int posicion) {
	            this.posicion = posicion;
	            this.setFont(new Font("SansSerif", Font.BOLD, 60));
	            this.setBackground(Color.WHITE);
	            this.setFocusPainted(false);
	        }

	        public int getPosicion() {
	            return posicion;
	        }
	    }
		public ventana() {
			
			
			//this.setJMenuBar(barra);
			//this.calculadora_layaouts();
			//this.menu();
			//this.router("login");
			//this.setVisible(true);
			
	}
		public void menu() {
			JMenuBar barra = new JMenuBar();
			
			JMenu menuCuenta = new JMenu("Cuenta");
			
			JMenuItem itemLogin = new JMenuItem("Login");
			itemLogin.addActionListener(e -> this.router("login"));
			
			JMenuItem itemRegistro = new JMenuItem("Registro");
			itemRegistro.addActionListener(e -> this.router("registro"));
			
			JMenuItem itemRecuperacion = new JMenuItem("Recuperación de cuenta");
			itemRecuperacion.addActionListener(e -> this.router("recuperacion"));
			
			menuCuenta.add(itemLogin);
			menuCuenta.add(itemRegistro);
			menuCuenta.add(itemRecuperacion);
			
			JMenu menuUsuarios = new JMenu("Usuarios");
			
			JMenuItem itemAlta = new JMenuItem("Alta");
			itemAlta.addActionListener(e -> this.router("alta"));
			
			JMenuItem itemBaja = new JMenuItem("Baja");
			itemBaja.addActionListener(e -> this.router("baja"));
			
			JMenuItem itemConsultar = new JMenuItem("Consultar");
			itemConsultar.addActionListener(e -> this.router("consultar")); 
			
			menuUsuarios.add(itemAlta);
			menuUsuarios.add(itemBaja);
			menuUsuarios.add(itemConsultar);
			
			JMenu menuAyuda = new JMenu("Ayuda");
			
			JMenuItem ayudaCrear = new JMenuItem("¿Cómo crear un usuario?");
			ayudaCrear.addActionListener(e -> this.router("ayuda_crear"));
			
			JMenuItem ayudaAcceder = new JMenuItem("¿Cómo acceder al sistema?");
			ayudaAcceder.addActionListener(e -> this.router("ayuda_acceder"));
			
			JMenuItem ayudaPass = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
			ayudaPass.addActionListener(e -> this.router("ayuda_pass"));
			
			menuAyuda.add(ayudaCrear);
			menuAyuda.add(ayudaAcceder);
			menuAyuda.add(ayudaPass);
			
			barra.add(menuCuenta);
			barra.add(menuUsuarios);
			barra.add(menuAyuda);
			
			this.setJMenuBar(barra);
		}

		public void panelPlaceholder(String titulo) {
			JPanel panel = new JPanel();
			panel.setSize(1200, 700);
			panel.setLayout(null);
			panel.setBackground(Color.lightGray);
			this.add(panel);

			JLabel label = new JLabel(titulo + " (Próximamente)");
			label.setFont(new Font("Arial", Font.BOLD, 32));
			label.setBounds(0, 200, 1200, 50);
			label.setHorizontalAlignment(JLabel.CENTER);
			panel.add(label);
		}
	
		public void login() {
		
		}
	
		public void register() {
			
			
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
		
		public void router(String target) {
			this.getContentPane().removeAll();
		    
		    if(target.equals("login")) {
		        this.login();
		    } else if(target.equals("registro")) {
		        this.register(); 
		    } else if(target.equals("consultar")) {
		        this.users(); 
		    } else if(target.equals("recuperacion")) {
		        this.recuperacionView();
		    } else if(target.equals("alta")) {
		        this.altaUsuarioView();
		    } else if(target.equals("ayuda_crear")) {
		        this.ayudaCrearUsuarioView();
		    } else if(target.equals("ayuda_acceder")) {
		        this.ayudaAccesoSistemaView();
		    } else if(target.equals("ayuda_pass")) {
		        this.ayudaRecuperarContrasenaView();
		    } else if(target.equals("baja")) {
		        this.bajaUsuarioView();
		    }
		    
		    
		    this.revalidate();
		    this.repaint();
		}
		
		public void recuperacionView() {
			JPanel panel = new JPanel(null);
			panel.setSize(1200, 700);
			panel.setBackground(Color.lightGray);
			this.add(panel);

			JLabel titulo = new JLabel("Recuperación de Cuenta");
			titulo.setFont(new Font("Arial", Font.BOLD, 28));
			titulo.setBounds(50, 50, 400, 40);
			panel.add(titulo);

			JLabel lblCorreo = new JLabel("Ingresa tu correo electrónico para enviarte un enlace:");
			lblCorreo.setFont(new Font("Arial", Font.PLAIN, 16));
			lblCorreo.setBounds(50, 120, 400, 30);
			panel.add(lblCorreo);

			JTextField txtCorreo = new JTextField();
			txtCorreo.setBounds(50, 160, 350, 40);
			panel.add(txtCorreo);

			JButton btnEnviar = new JButton("Enviar Enlace");
			btnEnviar.setBounds(50, 230, 150, 40);
			panel.add(btnEnviar);

			JButton btnVolver = new JButton("Volver");
			btnVolver.setBounds(220, 230, 150, 40);
			btnVolver.addActionListener(e -> router("login"));
			panel.add(btnVolver);
		}

		public void altaUsuarioView() {
			JPanel panel = new JPanel(null);
			panel.setSize(1200, 700);
			panel.setBackground(Color.lightGray);
			this.add(panel);

			JLabel titulo = new JLabel("Alta de Nuevo Usuario");
			titulo.setFont(new Font("Arial", Font.BOLD, 28));
			titulo.setBounds(50, 50, 400, 40);
			panel.add(titulo);

			JLabel lblNombre = new JLabel("Nombre Completo:");
			lblNombre.setBounds(50, 120, 200, 30);
			panel.add(lblNombre);

			JTextField txtNombre = new JTextField();
			txtNombre.setBounds(50, 150, 300, 30);
			panel.add(txtNombre);

			JLabel lblRol = new JLabel("Rol del sistema:");
			lblRol.setBounds(50, 200, 200, 30);
			panel.add(lblRol);

			JComboBox<String> cmbRol = new JComboBox<>(new String[]{"Administrador", "Empleado", "Cliente"});
			cmbRol.setBounds(50, 230, 300, 30);
			panel.add(cmbRol);

			JButton btnGuardar = new JButton("Guardar Usuario");
			btnGuardar.setBounds(50, 300, 150, 40);
			panel.add(btnGuardar);

			JButton btnVolver = new JButton("Volver");
			btnVolver.setBounds(220, 300, 150, 40);
			btnVolver.addActionListener(e -> router("consultar"));
			panel.add(btnVolver);
		}
		
		public void bajaUsuarioView() {
			JPanel panel = new JPanel(null);
			panel.setSize(1200, 700);
			panel.setBackground(Color.lightGray);
			this.add(panel);

			JLabel titulo = new JLabel("Baja de Usuario");
			titulo.setFont(new Font("Arial", Font.BOLD, 28));
			titulo.setBounds(50, 50, 400, 40);
			panel.add(titulo);

			JLabel lblBuscar = new JLabel("Ingresa el No. de Control del usuario a eliminar:");
			lblBuscar.setFont(new Font("Arial", Font.PLAIN, 16));
			lblBuscar.setBounds(50, 120, 450, 30);
			panel.add(lblBuscar);

			JTextField txtBuscar = new JTextField();
			txtBuscar.setBounds(50, 160, 350, 40);
			panel.add(txtBuscar);

			JButton btnEliminar = new JButton("Eliminar Usuario");
			btnEliminar.setBounds(50, 230, 150, 40);
			btnEliminar.setBackground(new Color(220, 53, 69));
			btnEliminar.setForeground(Color.WHITE);
			panel.add(btnEliminar);

			JButton btnVolver = new JButton("Volver");
			btnVolver.setBounds(220, 230, 150, 40);
			btnVolver.addActionListener(e -> router("consultar")); 
			panel.add(btnVolver);
		}

		public void ayudaCrearUsuarioView() {
			crearPanelAyuda("¿Cómo crear un usuario?", 
				"1. Dirígete a la sección 'Cuenta' en el menú superior.\n" +
				"2. Selecciona la opción 'Registro'.\n" +
				"3. Llena todos los campos solicitados en el formulario.\n" +
				"4. Haz clic en el botón 'Crear cuenta'.");
		}

		public void ayudaAccesoSistemaView() {
			crearPanelAyuda("¿Cómo acceder al sistema?", 
				"1. Asegúrate de estar registrado en el sistema.\n" +
				"2. En el menú, ve a 'Cuenta' -> 'Login'.\n" +
				"3. Ingresa tu nombre de usuario y contraseña.\n" +
				"4. Haz clic en el botón 'Entrar'.");
		}

		public void ayudaRecuperarContrasenaView() {
			crearPanelAyuda("¿Qué pasa si olvidé mi contraseña?", 
				"1. Ve a la sección 'Cuenta' -> 'Recuperación de cuenta'.\n" +
				"2. Ingresa el correo electrónico asociado a tu usuario.\n" +
				"3. Revisa tu bandeja de entrada y sigue las instrucciones del correo.");
		}

		private void crearPanelAyuda(String tituloText, String contenido) {
			JPanel panel = new JPanel(null);
			panel.setSize(1200, 700);
			panel.setBackground(Color.white);
			this.add(panel);

			JLabel titulo = new JLabel(tituloText);
			titulo.setFont(new Font("Arial", Font.BOLD, 28));
			titulo.setBounds(50, 50, 600, 40);
			panel.add(titulo);

			JTextArea txtContenido = new JTextArea(contenido);
			txtContenido.setFont(new Font("Arial", Font.PLAIN, 18));
			txtContenido.setBounds(50, 120, 600, 150);
			txtContenido.setEditable(false);
			txtContenido.setBorder(BorderFactory.createLineBorder(Color.gray));
			panel.add(txtContenido);

			JButton btnVolver = new JButton("Volver al Inicio");
			btnVolver.setBounds(50, 300, 150, 40);
			btnVolver.addActionListener(e -> router("login"));
			panel.add(btnVolver);
		}
		
		public void mostrarTicTacToe() {
			this.getContentPane().removeAll();
	        this.setLayout(new BorderLayout());

	        // inicializa el tablero 
	        for (int i = 0; i < 9; i++) {
	            tableroLogico[i] = "";
	        }
	        turnoX = true;

	        // marcador y historial
	        JPanel panelMarcador = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));
	        panelMarcador.setBackground(Color.lightGray);
	        
	        lblMarcadorX = new JLabel("Victorias X: " + victoriasX);
	        lblMarcadorX.setFont(new Font("Arial", Font.BOLD, 20));
	        lblMarcadorX.setForeground(Color.BLUE);
	        
	        lblMarcadorO = new JLabel("Victorias O: " + victoriasO);
	        lblMarcadorO.setFont(new Font("Arial", Font.BOLD, 20));
	        lblMarcadorO.setForeground(Color.RED);
	        
	        JButton btnReiniciar = new JButton("Reiniciar Partida");
	        btnReiniciar.setFont(new Font("Arial", Font.BOLD, 16));
	        btnReiniciar.addActionListener(e -> reiniciarJuego());

	        panelMarcador.add(lblMarcadorX);
	        panelMarcador.add(btnReiniciar);
	        panelMarcador.add(lblMarcadorO);
	        this.add(panelMarcador, BorderLayout.NORTH);

	        // tablero 3x3
	        JPanel panelTablero = new JPanel();
	        panelTablero.setLayout(new GridLayout(3, 3));

	        ActionListener accionJugar = new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                BotonGato botonClickeado = (BotonGato) e.getSource();
	                int pos = botonClickeado.getPosicion();

	                if (tableroLogico[pos].equals("")) {
	                    String simbolo = turnoX ? "X" : "O";
	                    
	                    botonClickeado.setText(simbolo);
	                    botonClickeado.setForeground(turnoX ? Color.BLUE : Color.RED);
	                    
	                    tableroLogico[pos] = simbolo;

	                    if (verificarGanador(simbolo)) {
	                        if (turnoX) {
	                            victoriasX++;
	                            lblMarcadorX.setText("Victorias X: " + victoriasX);
	                        } else {
	                            victoriasO++;
	                            lblMarcadorO.setText("Victorias O: " + victoriasO);
	                        }
	                        bloquearTablero(); 
	                        JOptionPane.showMessageDialog(null, "El jugador " + simbolo + " ha ganado", "Tenemos un ganador", JOptionPane.INFORMATION_MESSAGE);
	                    } else if (verificarEmpate()) {
	                        JOptionPane.showMessageDialog(null, "Es un empate", "Tablero lleno", JOptionPane.WARNING_MESSAGE);
	                    } else {
	                        turnoX = !turnoX;
	                    }
	                }
	            }
	        };

	        // botones
	        for (int i = 0; i < 9; i++) {
	            botonesGato[i] = new BotonGato(i);
	            botonesGato[i].addActionListener(accionJugar);
	            panelTablero.add(botonesGato[i]);
	        }

	        this.add(panelTablero, BorderLayout.CENTER);
	        this.revalidate();
	        this.repaint();
	    }
		
		private boolean verificarGanador(String jugador) {
	        // valida filas horizontal
	        if (tableroLogico[0].equals(jugador) && tableroLogico[1].equals(jugador) && tableroLogico[2].equals(jugador)) return true;
	        if (tableroLogico[3].equals(jugador) && tableroLogico[4].equals(jugador) && tableroLogico[5].equals(jugador)) return true;
	        if (tableroLogico[6].equals(jugador) && tableroLogico[7].equals(jugador) && tableroLogico[8].equals(jugador)) return true;
	        
	        // valida columnas vertical
	        if (tableroLogico[0].equals(jugador) && tableroLogico[3].equals(jugador) && tableroLogico[6].equals(jugador)) return true;
	        if (tableroLogico[1].equals(jugador) && tableroLogico[4].equals(jugador) && tableroLogico[7].equals(jugador)) return true;
	        if (tableroLogico[2].equals(jugador) && tableroLogico[5].equals(jugador) && tableroLogico[8].equals(jugador)) return true;
	        
	        // valida diagonales
	        if (tableroLogico[0].equals(jugador) && tableroLogico[4].equals(jugador) && tableroLogico[8].equals(jugador)) return true;
	        if (tableroLogico[2].equals(jugador) && tableroLogico[4].equals(jugador) && tableroLogico[6].equals(jugador)) return true;

	        return false; 
	    }

	    private boolean verificarEmpate() {
	        for (String casilla : tableroLogico) {
	            if (casilla.equals("")) {
	                return false;
	            }
	        }
	        return true; 
	    }

	    private void bloquearTablero() {
	        for (int i = 0; i < 9; i++) {
	            if (tableroLogico[i].equals("")) {
	                tableroLogico[i] = "-"; 
	            }
	        }
	    }

	    private void reiniciarJuego() {
	        turnoX = true; 
	        for (int i = 0; i < 9; i++) {
	            tableroLogico[i] = ""; 
	            botonesGato[i].setText(""); 
	        }
	    }   
}
