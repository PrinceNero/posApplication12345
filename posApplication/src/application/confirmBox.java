package application;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class confirmBox {

	//we need a boolean to store the variable
	static boolean answer;
	
	
	public static boolean display(String title, String message) {
		
		//creates a new window...
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		//this will block user interaction within other windows. 
		
		window.setTitle(title);
		window.setMinWidth(250);

		Label label = new Label();
		label.setText(message);
		
		//create two buttons
		
		Button yesButton = new Button("Yes");
		
		yesButton.setOnAction(e->{
			//this creates a method
			Tables.display("Tables");
			window.close();
		});
		
		Button noButton = new Button("No");
		noButton.setOnAction(e->{
			//this creates a method
			answer = false;
			window.close();
		});
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, yesButton, noButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		return answer;
	}
	
}
