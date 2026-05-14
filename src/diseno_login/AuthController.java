package diseno_login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
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

                if (modelo.login(email, pass)) {
                    vista.username.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    vista.contraseña.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    JOptionPane.showMessageDialog(null, "¡Acceso concedido!", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                    
                    vista.frameLogin.dispose(); 
                    
                    abrirDashboard(); 
                    
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

    private void abrirDashboard() {
        ventana home = new ventana();
        home.setSize(1200, 700);
        home.setLocation(200, 200);
        home.getContentPane().setBackground(Color.GREEN);
        home.menu();
        
        mostrarUsuariosRegistrados(home);
        
        home.setVisible(true);
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
                    JOptionPane.showMessageDialog(null, "Por favor, llene los datos de la cuenta.", "Validación", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                if (!vista.accept_terms.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debe aceptar los términos.", "Términos", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                if(modelo.registrar(newUser, newEmail, newPass)) {
                    JOptionPane.showMessageDialog(null, "¡Registro exitoso!");
                    vista.frameRegistro.dispose();
                    showLogin();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    private void mostrarUsuariosRegistrados(ventana home) {
        List<String[]> usuarios = modelo.obtenerUsuarios();
        int total = modelo.contarUsuarios();
        
        vista.usersView(home, usuarios, total);
        
        vista.btnAddUserFromList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.dispose(); 
                showAddNewUser(); 
            }
        });
    }

    public void showAddNewUser() {
        vista.addNewUserView();

        vista.btnCancelNewUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.frameAddNewUser.dispose(); 
                abrirDashboard(); 
            }
        });

        vista.btnSubmitNewUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newUser = vista.new_reg_username.getText();
                String newEmail = vista.new_reg_email.getText();
                String newPass = vista.new_reg_password.getText();
                
                if (newUser.trim().isEmpty() || newEmail.trim().isEmpty() || newPass.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos.", "Validación", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                if(modelo.registrar(newUser, newEmail, newPass)) {
                    JOptionPane.showMessageDialog(null, "¡Usuario agregado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    
                    vista.frameAddNewUser.dispose(); 
                    abrirDashboard(); 
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}