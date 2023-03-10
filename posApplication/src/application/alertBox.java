package application;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class alertBox {
	
	
	
	public static void display(String title, String message) {
		
		//creates a new window...
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		//this will block user interaction within other windows. 
		
		window.setTitle(title);
		window.setMinWidth(250);

		Label label = new Label();
		label.setText(message);
		//buttons
		Button closeButton = new Button("Close the window");
		closeButton.setOnAction(e-> window.close());
		Button confirmButton= new Button("Tables");
		confirmButton.setOnAction(e-> confirmBox.display("Tables", "Show Tables"));
		//layout
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton, confirmButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
	}
	
}
