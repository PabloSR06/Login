package dad.login.ui;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.beans.property.BooleanProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

public class LoginController {

	private LoginModel model = new LoginModel();
	private LoginView view = new LoginView();
	

	public LoginController() {
		view.getAceptarButton().setOnAction(e -> onAceptarAction(e));
		view.getCancelarButton().setOnAction(e -> onCancelarAction(e));
	}	
	

	private void onCancelarAction(ActionEvent e) {
		Stage stage = (Stage) view.getCancelarButton().getScene().getWindow();
	    stage.close();
	}


	private void onAceptarAction(ActionEvent e){
		model.setUser(view.getUserField().getText());
		model.setPassword(view.getPasswordField().getText());
		BooleanProperty useLdap =  view.getLapdCheckBox().selectedProperty();
		
		Boolean correcto = false;
		AuthService auth = useLdap.get() ? new LdapAuthService() : new FileAuthService();
		try {
			correcto = auth.login(model.getUser(), model.getPassword());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if (correcto == true) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Iniciar Sesion");
			alert.setHeaderText("Acceso permitido");
			alert.setContentText("Las credenciales de acceso son validas");
			alert.showAndWait();
		}else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Iniciar Sesion");
			alert.setHeaderText("Acceso denegado");
			alert.setContentText("El usuario y/o contraseña no son validos");

			alert.showAndWait();
		}
		
		
		
		
	}

	public LoginModel getModel() {
		return model;
		
	}

	public LoginView getView() {
		return view;
	}

}
