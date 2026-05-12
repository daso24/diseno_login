package diseno_login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
    public JTextField reg_email;
    public JTextField reg_password;
    public JTextArea bio_text;
    public JCheckBox sweet_opcion, salty_option, healthy_option;
    public JRadioButton accept_terms, reject_terms;

    public AuthView() {
    }

    public void loginView() {
        frameLogin = new JFrame();
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon iconoBarra = new ImageIcon("C:/Users/PC/Downloads/f.jfif"); 
        frameLogin.setIconImage(iconoBarra.getImage());

        frameLogin.setSize(1200, 700);
        frameLogin.setLocation(200, 200);
        frameLogin.setLayout(null);

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

        JLabel title_login = new JLabel("ACCEDER");
        title_login.setSize(350, 60);
        title_login.setOpaque(true);
        title_login.setLocation(50, 100);
        title_login.setBackground(Color.white);
        title_login.setFont(new Font("Arial", Font.BOLD, 28));
        title_login.setHorizontalAlignment(JLabel.CENTER);
        contenedor.add(title_login);

        JLabel etq_user = new JLabel("Correo electronico:");
        etq_user.setSize(350, 30);
        etq_user.setLocation(50, 170);
        etq_user.setFont(new Font("Arial", Font.BOLD, 14));
        contenedor.add(etq_user);

        username = new JTextField();
        username.setSize(350, 40);
        username.setLocation(50, 200);
        username.setFont(new Font("Arial", Font.BOLD, 18));
        contenedor.add(username);

        JLabel etq_contra = new JLabel("Contraseña:");
        etq_contra.setSize(350, 30);
        etq_contra.setLocation(50, 240);
        etq_contra.setFont(new Font("Arial", Font.BOLD, 14));
        contenedor.add(etq_contra);

        contraseña = new JTextField();
        contraseña.setSize(350, 40);
        contraseña.setLocation(50, 270);
        contraseña.setFont(new Font("Arial", Font.BOLD, 18));
        contenedor.add(contraseña);

        acceder = new JButton("Entrar");
        acceder.setLocation(50, 350);
        acceder.setSize(350, 50);
        acceder.setFont(new Font("Arial", Font.BOLD, 22));
        contenedor.add(acceder);

        btnIrRegistro = new JButton("Registrarse");
        btnIrRegistro.setLocation(50, 420);
        btnIrRegistro.setSize(350, 50);
        btnIrRegistro.setFont(new Font("Arial", Font.BOLD, 22));
        contenedor.add(btnIrRegistro);

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

        frameLogin.setVisible(true);
    }

    public void registerView() {
        frameRegistro = new JFrame();
        frameRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameRegistro.setSize(1200, 700);
        frameRegistro.setLocation(200, 200);
        frameRegistro.setLayout(null);

        JPanel left_panel = new JPanel();
        left_panel.setBounds(50, 50, 500, 550);
        left_panel.setBackground(Color.lightGray);
        left_panel.setLayout(null);
        frameRegistro.add(left_panel);

        JLabel title_reg = new JLabel("Registro");
        title_reg.setBounds(50, 20, 400, 50);
        title_reg.setOpaque(true);
        title_reg.setBackground(Color.white);
        title_reg.setFont(new Font("Arial", Font.BOLD, 24));
        title_reg.setHorizontalAlignment(JLabel.CENTER);
        left_panel.add(title_reg);

        JLabel lbl_u = new JLabel("Nombre de usuario:");
        lbl_u.setBounds(50, 100, 400, 25);
        lbl_u.setFont(new Font("Arial", Font.BOLD, 14));
        left_panel.add(lbl_u);
        reg_username = new JTextField();
        reg_username.setFont(new Font("Arial", Font.BOLD, 18));
        reg_username.setBounds(50, 125, 400, 40);
        left_panel.add(reg_username);

        JLabel lbl_e = new JLabel("Correo electronico:");
        lbl_e.setBounds(50, 180, 400, 25);
        lbl_e.setFont(new Font("Arial", Font.BOLD, 14));
        left_panel.add(lbl_e);
        reg_email = new JTextField();
        reg_email.setFont(new Font("Arial", Font.BOLD, 18));
        reg_email.setBounds(50, 205, 400, 40);
        left_panel.add(reg_email);

        JLabel lbl_p = new JLabel("Contraseña:");
        lbl_p.setBounds(50, 260, 400, 25);
        lbl_p.setFont(new Font("Arial", Font.BOLD, 14));
        left_panel.add(lbl_p);
        reg_password = new JTextField();
        reg_password.setFont(new Font("Arial", Font.BOLD, 18));
        reg_password.setBounds(50, 285, 400, 40);
        left_panel.add(reg_password);

        btnCrearCuenta = new JButton("Crear cuenta");
        btnCrearCuenta.setBounds(50, 380, 400, 50);
        btnCrearCuenta.setFont(new Font("Arial", Font.BOLD, 20));
        left_panel.add(btnCrearCuenta);

        btnCancelarRegistro = new JButton("Cancelar");
        btnCancelarRegistro.setBounds(50, 450, 400, 50);
        btnCancelarRegistro.setFont(new Font("Arial", Font.BOLD, 20));
        left_panel.add(btnCancelarRegistro);

        JPanel right_panel = new JPanel();
        right_panel.setBounds(600, 50, 500, 550);
        right_panel.setBackground(Color.lightGray);
        right_panel.setLayout(null);
        frameRegistro.add(right_panel);

        JLabel lbl_bio = new JLabel("Bio:");
        lbl_bio.setBounds(50, 20, 400, 25);
        right_panel.add(lbl_bio);
        bio_text = new JTextArea();
        bio_text.setBounds(50, 45, 400, 100);
        bio_text.setBorder(BorderFactory.createLineBorder(Color.gray));
        right_panel.add(bio_text);

        JLabel lbl_pref = new JLabel("Sabores preferidos:");
        lbl_pref.setBounds(50, 160, 400, 25);
        right_panel.add(lbl_pref);
        sweet_opcion = new JCheckBox("Dulce");
        sweet_opcion.setBounds(50, 185, 100, 25);
        sweet_opcion.setOpaque(false);
        right_panel.add(sweet_opcion);
        salty_option = new JCheckBox("Salado");
        salty_option.setBounds(160, 185, 100, 25);
        salty_option.setOpaque(false);
        right_panel.add(salty_option);
        healthy_option = new JCheckBox("Saludable");
        healthy_option.setBounds(270, 185, 120, 25);
        healthy_option.setOpaque(false);
        right_panel.add(healthy_option);

        JLabel lbl_terms = new JLabel("Terminos y condiciones:");
        lbl_terms.setBounds(50, 230, 400, 25);
        right_panel.add(lbl_terms);
        accept_terms = new JRadioButton("Acepto los terminos");
        accept_terms.setBounds(50, 255, 200, 25);
        accept_terms.setOpaque(false);
        reject_terms = new JRadioButton("No acepto los términos");
        reject_terms.setBounds(260, 255, 200, 25);
        reject_terms.setOpaque(false);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(accept_terms);
        grupo.add(reject_terms);
        
        right_panel.add(accept_terms);
        right_panel.add(reject_terms);

        frameRegistro.setVisible(true);
    }
    
    public void usersView(JFrame ventanaPrincipal, List<String[]> datosUsuarios, int totalUsuarios) {
        JPanel users = new JPanel();
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        users.setSize(1200, 700);
        users.setLocation(0, 0);
        users.setLayout(null);
        users.setBackground(Color.lightGray);
        ventanaPrincipal.add(users);
        
        JLabel users_title = new JLabel("USUARIOS REGISTRADOS");
        users_title.setBounds(282, 40, 400, 60);
        users_title.setOpaque(true);
        users_title.setBackground(Color.white);
        users_title.setFont(new Font("Arial", Font.BOLD, 28));
        users_title.setHorizontalAlignment(JLabel.CENTER);
        users.add(users_title);
        
        JPanel total_panel = new JPanel();
        total_panel.setBounds(50, 120, 250, 80);
        total_panel.setBackground(Color.white);
        total_panel.setLayout(null);
        users.add(total_panel);
        
        JLabel total_tag = new JLabel("Total de usuarios");
        total_tag.setBounds(0, 15, 250, 20);
        total_tag.setFont(new Font("Arial", Font.BOLD, 14));
        total_tag.setHorizontalAlignment(JLabel.CENTER);
        total_panel.add(total_tag);
        
        JLabel total_num = new JLabel(String.valueOf(totalUsuarios));
        total_num.setBounds(0, 40, 250, 30);
        total_num.setFont(new Font("Arial", Font.BOLD, 28));
        total_num.setHorizontalAlignment(JLabel.CENTER);
        total_panel.add(total_num);
        
        String[] title_head = {"ID", "Nombre de Usuario", "Email"};
        
        String[][] table_content = new String[datosUsuarios.size()][3];
        for (int i = 0; i < datosUsuarios.size(); i++) {
            table_content[i] = datosUsuarios.get(i);
        }
        
        JTable users_table = new JTable(table_content, title_head);
        users_table.setFont(new Font("Arial", Font.PLAIN, 12));
        users_table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        
        JScrollPane scrollpane = new JScrollPane(users_table);
        scrollpane.setBounds(50, 220, 800, 400);
        users.add(scrollpane);
        
        users.repaint();
        users.revalidate(); 
    }
}