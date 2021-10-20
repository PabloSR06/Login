package dad.login.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends VBox{
	
	
	private TextField userField;
	private PasswordField passwordField;
	
	private CheckBox lapdCheckBox;
	
	private Button aceptarButton;
	private Button cancelarButton;
	
	public LoginView() {
		
		
		userField = new TextField();
		userField.setPromptText("Nombre de usuario");
		passwordField = new PasswordField();
		passwordField.setPromptText("Constraseña de usuario");
		
		lapdCheckBox = new CheckBox();
		
		aceptarButton = new Button("Aceptar");
		cancelarButton = new Button("Cancelar");
			
		GridPane formPane = new GridPane();
		formPane.setGridLinesVisible(false);
		formPane.setHgap(7);
		formPane.setVgap(7);
		formPane.setPadding(new Insets(5));
		formPane.addRow(0, new Label("Usuario: "), userField);
		formPane.addRow(1, new Label("Contraseña: "), passwordField);
		
		HBox checkBox = new HBox(5, lapdCheckBox, new Label("Usar LDAP: "));
		HBox buttonBox = new HBox(5, aceptarButton, cancelarButton);
		
		setSpacing(5);
		setFillWidth(false);
		setAlignment(Pos.CENTER);
		getChildren().addAll(formPane, checkBox, buttonBox);

	}

	public TextField getUserField() {
		return userField;
	}

	public PasswordField getPasswordField() {
		return passwordField;
	}

	public CheckBox getLapdCheckBox() {
		return lapdCheckBox;
	}

	public Button getAceptarButton() {
		return aceptarButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}
	
	

}
