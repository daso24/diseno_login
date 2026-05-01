package diseno_login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AuthView {

    public JTextField username;
    public JTextField contraseña;
    public JButton acceder;
    public JFrame frameLogin;
    public JFrame frameRegistro;
    public JButton btnIrRegistro;
    public JButton btnCrearCuenta;
    public JButton btnCancelarRegistro;
    public JTextField reg_username;
    public JTextArea bio_text;

    public AuthView() {

    }

    public void loginView() {
        frameLogin = new JFrame();
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon iconoBarra = new ImageIcon("C:/Users/PC/Downloads/f.jfif"); 
        frameLogin.setIconImage(iconoBarra.getImage());

        frameLogin.setSize(1200, 700);
        frameLogin.setMinimumSize(new Dimension(1200, 700));
        frameLogin.setMaximumSize(new Dimension(1200, 700));
        frameLogin.setTitle("Mi ventana");
        frameLogin.setLocation(200, 200);
        frameLogin.setLayout(null);

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

        JPanel contenedor = new JPanel();
        contenedor.setOpaque(true);
        contenedor.setBackground(Color.lightGray); 
        contenedor.setSize(1160, 610);
        contenedor.setLayout(null);
        contenedor.setLocation(20, 20);

        frameLogin.add(contenedor);

        JLabel logo_empresa = new JLabel();
        logo_empresa.setBounds(75, 0, 1000, 100); 
        ImageIcon img_logo = new ImageIcon("C:/Users/PC/Downloads/Fortnite.png"); 
        Icon esc_logo = new ImageIcon(img_logo.getImage().getScaledInstance(300, 90, Image.SCALE_SMOOTH));
        logo_empresa.setIcon(esc_logo);
        contenedor.add(logo_empresa);

        JLabel title_login = new JLabel();
        title_login.setText("ACCEDER");
        title_login.setSize(350, 60);
        title_login.setOpaque(true);
        title_login.setLocation(50, 100);
        title_login.setBackground(Color.white);
        title_login.setFont(new Font("Arial", Font.BOLD, 28));
        title_login.setHorizontalAlignment(JLabel.CENTER);
        contenedor.add(title_login);

        JLabel icono_user = new JLabel();
        icono_user.setBounds(20, 205, 25, 25);
        ImageIcon img_user = new ImageIcon("C:/Users/PC/Downloads/candado.jfif"); 
        Icon esc_user = new ImageIcon(img_user.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        icono_user.setIcon(esc_user);
        contenedor.add(icono_user);

        JLabel etq_user = new JLabel();
        etq_user.setText("NOMBRE DE USUARIO:");
        etq_user.setSize(350, 100);
        etq_user.setLocation(50, 135);
        etq_user.setFont(new Font("Arial", Font.BOLD, 14));
        contenedor.add(etq_user);

        username = new JTextField();
        username.setSize(350, 40);
        username.setLocation(50, 200);
        username.setFont(new Font("Arial", Font.BOLD, 18));
        contenedor.add(username);

        JLabel icono_pass = new JLabel();
        icono_pass.setBounds(20, 275, 25, 25);
        ImageIcon img_pass = new ImageIcon("C:/Users/PC/Downloads/user.jfif"); 
        Icon esc_pass = new ImageIcon(img_pass.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        icono_pass.setIcon(esc_pass);
        contenedor.add(icono_pass);

        JLabel etq_contra = new JLabel();
        etq_contra.setText("CONTRASEÑA:");
        etq_contra.setSize(350, 30);
        etq_contra.setLocation(50, 240);
        etq_contra.setFont(new Font("Arial", Font.BOLD, 14));
        contenedor.add(etq_contra);

        contraseña = new JTextField();
        contraseña.setSize(350, 40);
        contraseña.setLocation(50, 270);
        contraseña.setFont(new Font("Arial", Font.BOLD, 18));
        contenedor.add(contraseña);

        JLabel casilla = new JLabel();
        casilla.setSize(20, 20);
        casilla.setOpaque(true);
        casilla.setLocation(50, 330);
        casilla.setBackground(Color.white);
        contenedor.add(casilla);

        JLabel recordarme = new JLabel();
        recordarme.setText("Recordarme");
        recordarme.setSize(100, 20);
        recordarme.setLocation(80, 330);
        recordarme.setFont(new Font("Arial", Font.BOLD, 14));
        contenedor.add(recordarme);

        JLabel olvido_contra = new JLabel();
        olvido_contra.setText("¿Olvidó su contraseña?");
        olvido_contra.setSize(180, 20);
        olvido_contra.setLocation(230, 330);
        olvido_contra.setFont(new Font("Arial", Font.BOLD, 14));
        contenedor.add(olvido_contra);

        acceder = new JButton();
        acceder.setText("Entrar");
        acceder.setLocation(50, 410);
        acceder.setSize(350, 50);
        acceder.setFont(new Font("Arial", Font.BOLD, 22));
        contenedor.add(acceder);

        contenedor.repaint();
        contenedor.revalidate();

        JPanel panel_imagen = new JPanel();
        panel_imagen.setSize(465, 600);
        panel_imagen.setLocation(450, 0);
        panel_imagen.setLayout(null);
        frameLogin.add(panel_imagen);

        JLabel imagen_grande = new JLabel();
        imagen_grande.setSize(465, 600);
        imagen_grande.setLocation(0, 0);
        ImageIcon img_fondo = new ImageIcon("C:/Users/PC/Downloads/welcome2.png"); 
        Icon esc_fondo = new ImageIcon(img_fondo.getImage().getScaledInstance(465, 460, Image.SCALE_SMOOTH));
        imagen_grande.setIcon(esc_fondo);
        panel_imagen.add(imagen_grande);

        btnIrRegistro = new JButton("aun no tienes cuenta?");
        btnIrRegistro.setText("Registrarse");
        btnIrRegistro.setLocation(50, 470);
        btnIrRegistro.setSize(350, 50);
        btnIrRegistro.setFont(new Font("Arial", Font.BOLD, 22));
        contenedor.add(btnIrRegistro);

        frameLogin.setVisible(true);
    }

    public void registerView() {
        frameRegistro = new JFrame();
        frameRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon iconoBarra = new ImageIcon("C:/Users/PC/Downloads/f.jfif"); 
        frameRegistro.setIconImage(iconoBarra.getImage());

        frameRegistro.setSize(1200, 700);
        frameRegistro.setMinimumSize(new Dimension(1200, 700));
        frameRegistro.setMaximumSize(new Dimension(1200, 700));
        frameRegistro.setTitle("Mi ventana");
        frameRegistro.setLocation(200, 200);
        frameRegistro.setLayout(null);

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

        JPanel register_container = new JPanel();
        register_container.setOpaque(true);
        register_container.setBackground(Color.lightGray); 
        register_container.setSize(450, 600);
        register_container.setLayout(null);
        register_container.setLocation(450, 0); 
        frameRegistro.add(register_container);

        JLabel title_register = new JLabel();
        title_register.setText("REGISTRO");
        title_register.setSize(350, 60);
        title_register.setOpaque(true);
        title_register.setLocation(50, 40);
        title_register.setBackground(Color.white); 
        title_register.setFont(new Font("Arial", Font.BOLD, 28));
        title_register.setHorizontalAlignment(JLabel.CENTER);
        register_container.add(title_register);

        JLabel reg_user_tag = new JLabel("NOMBRE DE USUARIO:");
        reg_user_tag.setBounds(50, 115, 350, 25);
        reg_user_tag.setBackground(Color.lightGray);
        reg_user_tag.setOpaque(true);
        reg_user_tag.setHorizontalAlignment(JLabel.CENTER);
        reg_user_tag.setFont(new Font("Arial", Font.BOLD, 14));
        register_container.add(reg_user_tag);

        reg_username = new JTextField();
        reg_username.setBounds(50, 140, 350, 35);
        reg_username.setFont(new Font("Arial", Font.BOLD, 18));
        register_container.add(reg_username);

        JLabel bio_tag = new JLabel("BIO");
        bio_tag.setBounds(50, 185, 350, 25);
        bio_tag.setHorizontalAlignment(JLabel.CENTER);
        bio_tag.setFont(new Font("Arial", Font.BOLD, 14));
        register_container.add(bio_tag);

        bio_text = new JTextArea();
        bio_text.setBounds(50, 210, 350, 60);
        bio_text.setFont(new Font("Arial", Font.PLAIN, 14));
        bio_text.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        register_container.add(bio_text);

        JLabel pref_tag = new JLabel("PREFERENCIAS");
        pref_tag.setBounds(50, 280, 350, 25);
        pref_tag.setHorizontalAlignment(JLabel.CENTER);
        pref_tag.setFont(new Font("Arial", Font.BOLD, 14));
        register_container.add(pref_tag);

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

        JLabel terms_tag = new JLabel("TÉRMINOS");
        terms_tag.setBounds(50, 340, 350, 25);
        terms_tag.setBackground(Color.lightGray);
        terms_tag.setOpaque(true);
        terms_tag.setHorizontalAlignment(JLabel.CENTER);
        terms_tag.setFont(new Font("Arial", Font.BOLD, 14));
        register_container.add(terms_tag);

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

        ButtonGroup terms_group = new ButtonGroup();
        terms_group.add(accept_terms);
        terms_group.add(reject_terms);

        String[] colonias = {"Camino Real", "La Fuente", "Villas Del Encanto"};
        JComboBox<String> list = new JComboBox<>(colonias);
        list.setBounds(50, 410, 350, 30);
        list.setFont(new Font("Arial", Font.BOLD, 12));
        register_container.add(list);

        btnCrearCuenta = new JButton();
        btnCrearCuenta.setText("Crear cuenta");
        btnCrearCuenta.setLocation(50, 460);
        btnCrearCuenta.setSize(350, 50);
        btnCrearCuenta.setFont(new Font("Arial", Font.BOLD, 22));
        register_container.add(btnCrearCuenta);

        btnCancelarRegistro = new JButton("Cancelar");
        btnCancelarRegistro.setLocation(50, 520);
        btnCancelarRegistro.setSize(350, 50);
        btnCancelarRegistro.setFont(new Font("Arial", Font.BOLD, 22));
        register_container.add(btnCancelarRegistro);

        register_container.repaint();
        register_container.revalidate();

        frameRegistro.setVisible(true);
    }
}