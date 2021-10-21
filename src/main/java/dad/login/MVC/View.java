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
		
		 
		HBox H1=new HBox(2,user, Username);
		HBox H2=new HBox(2,contraseña, password);
		HBox H3=new HBox(2,LDAP, UsarLD);
		HBox H4=new HBox(2,acceder, cancelar);
			
		setFillWidth(false);
		
		setAlignment(Pos.CENTER);
		getChildren().addAll(H1,H2,H3,H4);
	}

}
