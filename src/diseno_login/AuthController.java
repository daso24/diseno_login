package diseno_login;

public class AuthController {
	private AuthView vista;
	public AuthController() {
		vista = new AuthView();
	}
	
	public void showLogin() {
		vista.loginView();
	}

}
