package diseno_login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
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
                String email = vista.username.getText();
                String pass = vista.contraseña.getText();

                if (email.trim().isEmpty() || pass.trim().isEmpty()) {
                    vista.username.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    vista.contraseña.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    JOptionPane.showMessageDialog(null, "Llene todos los campos", "Validación", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                boolean esValido = modelo.login(email, pass);

                if (esValido) {
                    vista.username.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    vista.contraseña.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    JOptionPane.showMessageDialog(null, "¡Acceso concedido!", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                    
                    vista.frameLogin.dispose();
                    
                    ventana home = new ventana();
                    home.setSize(1200, 700);
                    home.setLocation(200, 200);
                    home.getContentPane().setBackground(Color.GREEN);
                    home.menu();
                    home.setVisible(true);
                    
                } else {
                    vista.username.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    vista.contraseña.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
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
                String newUser = vista.reg_username.getText();
                String newEmail = vista.reg_email.getText();
                String newPass = vista.reg_password.getText();
                
                if (newUser.trim().isEmpty() || newEmail.trim().isEmpty() || newPass.trim().isEmpty()) {
                    vista.reg_username.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    vista.reg_email.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    vista.reg_password.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    JOptionPane.showMessageDialog(null, "Por favor, llene los datos de la cuenta.", "Validación", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                if (!vista.accept_terms.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debe aceptar los términos y condiciones para crear una cuenta.", "Términos", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                boolean registrado = modelo.registrar(newUser, newEmail, newPass);
                
                if(registrado) {
                    vista.reg_username.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    vista.reg_email.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    vista.reg_password.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    JOptionPane.showMessageDialog(null, "¡Registro exitoso!");
                    vista.frameRegistro.dispose();
                    showLogin();
                } else {
                    vista.reg_username.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    vista.reg_email.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    vista.reg_password.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    JOptionPane.showMessageDialog(null, "Error al registrar en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}