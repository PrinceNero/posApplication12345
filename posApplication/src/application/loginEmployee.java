package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class loginEmployee extends Application {
	Button button;
	Stage window;
	Scene loginEmployee;
	
	
	@Override
	public void start(Stage primaryStage) {
			
			window = primaryStage;

			
			//Gridpane
			
			GridPane grid = new GridPane();
			grid.setPadding(new Insets(10, 10, 10, 10));
			grid.setVgap(8);
			grid.setHgap(8);
			//
			//were making a login on how to make it
			//name label
			//
			Label nameLabel = new Label("Username : ");
			GridPane.setConstraints(nameLabel, 0, 0);
			//it will appear on the first column on the first ro wn
			
			//name input
			//
			TextField nameInput = new TextField("");
			nameInput.setPromptText("Username");
			GridPane.setConstraints(nameInput, 1, 0);
			//
			//Password label
			//
			Label passLabel = new Label("Password : ");
			GridPane.setConstraints(passLabel, 0, 1);
			//it will appear on the first column on the first ro wn
			
			//pass input
			//
			TextField passInput = new TextField();
			passInput.setPromptText("Password");
			GridPane.setConstraints(passInput, 1, 1);
			//
			//login button
			Button loginButton = new Button("Log in");
			GridPane.setConstraints(loginButton, 1,2);
			////////////////////////////////////////////////////
			//this will print the text information on the console..
			loginButton.setOnAction(e->{ 
				employeeValidation validate = new employeeValidation();
				validate.isSuccess(nameInput.getText(),passInput.getText());
			
			});
			//you want to validate the data in some type of way...
			//you want to verify it
			/////////////////////////////////////////////////////
			grid.getChildren().addAll(nameLabel, nameInput,passLabel, passInput,loginButton);
			///
			//BorderPane borderPane = new BorderPane();
			//borderPane.setTop(topMenu);
			//borderPane.setLeft(leftMenu);
			///
			
			Scene scene = new Scene(grid, 300,250);
			window.setTitle("Employee Login");
			window.setScene(scene);
			window.show();	
	}
	
	public static void main(String[] args) {
		launch(args);

	}
	
	private void closeProgram() {
		Boolean answer = confirmBox.display("Close?", "You sure you want to exit?");
		//what if they clicked the red close button
		if(answer)
			window.close();
	}
	
}
