package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tables {
	private static boolean loggedIn;
	
	public static boolean display(String employees) {
		
		Stage window = new Stage();
		
		//horizontal menu
		HBox topMenu = new HBox();
		Button buttonA = new Button("1");
		Button buttonB = new Button("2");
		Button buttonC = new Button("3");
		topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
		//Verticle box
		VBox leftMenu = new VBox();
		Button buttonD = new Button("4");
		Button buttonE = new Button("5");
		Button buttonF = new Button("6");
		
		//
		buttonA.setOnAction(e->{
			startTable.display(true);
		});
		buttonB.setOnAction(e->{
			startTable.display(true);
		});
		buttonC.setOnAction(e->{
			startTable.display(true);
		});
		buttonD.setOnAction(e->{
			startTable.display(true);
		});
		buttonE.setOnAction(e->{
			startTable.display(true);
		});
		buttonF.setOnAction(e->{
			startTable.display(true);
		});
		//
		
		Button logOut = new Button("Sign Out");
		logOut.setOnAction(e ->{ 
			
			loggedIn = false;
			//loginInstance();
		});		
		leftMenu.getChildren().addAll(buttonD, buttonE, buttonF,logOut);
		
		
	
		
		///
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);
		///
		
		Scene scene = new Scene(borderPane, 300,250);
		window.setTitle("Tables");
		window.setScene(scene);
		window.show();	
		return loggedIn;
		
		
	}
	
	
}
