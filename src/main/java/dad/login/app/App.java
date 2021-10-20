package dad.login.app;
import dad.login.ui.LoginController;
import dad.login.ui.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private LoginController loginController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		loginController = new LoginController();
		Scene verScene = new Scene(loginController.getView(), 320, 200);
		
		Stage verStage = new Stage();
		verStage.setTitle("Login");
		verStage.setScene(verScene);
		verStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
