package diseno_login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthController {
	private AuthView vista;
	private AuthModel modelo; 
	
	public AuthController() {
		vista = new AuthView();
		modelo = new AuthModel();
	}
	
	public void showLogin() {
		vista.loginView();
		
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
		
		vista.btnCrearCuenta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String usuarioForm = vista.reg_username.getText();
				String bioForm = vista.bio_text.getText();
				
				modelo.registro(usuarioForm, bioForm);
				vista.frameRegistro.dispose();
				showLogin();
			}
		});
		
		vista.btnCancelarRegistro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vista.frameRegistro.dispose();
				showLogin();                  
			}
		});
	}
}