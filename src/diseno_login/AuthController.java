package diseno_login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AuthController {
	
    private AuthView vista;
    private Authmodels modelo;
	
    public AuthController() {
        this.vista = new AuthView();
        this.modelo = new Authmodels();
    }
	
    public void showLogin() {
        vista.loginView();

        vista.acceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = vista.username.getText();
                String pass = vista.contraseña.getText();

                if (user.trim().isEmpty() || pass.trim().isEmpty()) {
                    vista.username.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    vista.contraseña.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    JOptionPane.showMessageDialog(null, "Llene todos los campos", "Validación", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                boolean esValido = modelo.login(user, pass);

                if (esValido) {
                    vista.username.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    vista.contraseña.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    JOptionPane.showMessageDialog(null, "¡Acceso concedido!", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                    
                    vista.frameLogin.dispose();
                    
                    ventana home = new ventana();
                    home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    home.setSize(1200, 700);
                    home.setLocation(200, 200);
                    home.getContentPane().setBackground(Color.GREEN);
                    home.menu();
                    home.setVisible(true);
                    
                } else {
                    vista.username.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    vista.contraseña.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        vista.btnIrRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.frameLogin.dispose(); 
                showRegister();             
            }
        });
    }

    public void showRegister() {
        vista.registerView();

        vista.btnCancelarRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.frameRegistro.dispose(); 
                showLogin();                   
            }
        });

        vista.btnCrearCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Funcionalidad de registro en construcción.");
            }
        });
    }
}