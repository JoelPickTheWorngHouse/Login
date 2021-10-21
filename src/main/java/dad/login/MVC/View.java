package dad.login.MVC;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View extends Application {

	TextField Username;
	PasswordField password;
	CheckBox LDAP;
	Button acceder;
	Button cancelar;
	Label UsarLD; 
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label user=new Label("Usuario:");
		Username=new TextField();
		Username.setPrefColumnCount(14);
		Username.setPromptText("Nombre de usuario");
		
		
		Label contraseña=new Label("Contraseña:");
		password=new PasswordField();
		password.setPrefColumnCount(15);
		password.setPromptText("Contraseña del usuario");
		
		LDAP=new CheckBox();
		UsarLD=new Label("Usar LDPA");
		
		acceder=new Button("Acceder");
		cancelar=new Button("Cancelar");
		
		VBox root = new VBox(4, 
				new HBox(2,user, Username), 
				new HBox(2,contraseña, password),
				new HBox(2,LDAP, UsarLD),
				new HBox(2,acceder, cancelar)
			);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("Login");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
