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

public class View extends VBox {

	TextField Username;
	PasswordField password;
	CheckBox LDAP;
	Button acceder;
	Button cancelar;
	Label UsarLD; 
	
	public View() {
		super();
		
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
		GridPane formPane=new GridPane(); 
		formPane.addRow(0,user, Username);
		formPane.addRow(1,contraseña, password);
		formPane.addRow(2,LDAP, UsarLD);
		formPane.addRow(3,acceder, cancelar);
			
		formPane.setAlignment(Pos.CENTER);
			
		setFillWidth(false);
		
		setAlignment(Pos.CENTER);
		getChildren().addAll(formPane);
	}
	
	public TextField getUsernameText() {
		return Username;
	}
	public TextField getpasswordText() {
		return password;
	}

	public Button getaccederButton() {
		return acceder;
	}

	public Button getcancelarButton() {
		return cancelar;
	}

	public CheckBox getLDAP() {
		return LDAP;
	}

}
