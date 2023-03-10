package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class inputOrder {
private static boolean loggedIn;
	
	public static boolean display(String employees) {
		
		Stage window = new Stage();
		
		//Verticle box
		VBox leftMenu = new VBox();
		Button Drinks = new Button("Drinks");
		Drinks.setOnAction(e->{
			drinks.display();
		});
		Button Beer = new Button("Beer");
		Beer.setOnAction(e->{
			beer.display();
		});
		Button Liquor = new Button("Liquor");
		Liquor.setOnAction(e->{
			drinks.display();
		});
		Button Wine = new Button("Wine");
		Wine.setOnAction(e->{
			wine.display();
		});
		Button Appetizers = new Button("Appetizers");
		Appetizers.setOnAction(e->{
			appetizers.display();
		});
		
		Button Entrees = new Button("Entrees");
		Entrees.setOnAction(e->{
			drinks.display();
		});
		Button Burgers = new Button("Burgers");
		Burgers.setOnAction(e->{
			drinks.display();
		});
		Button Sides = new Button("Sides");
		Sides.setOnAction(e->{
			drinks.display();
		});
		Button Desserts = new Button("Desserts");
		Desserts.setOnAction(e->{
			drinks.display();
		});
		
		leftMenu.getChildren().addAll(Drinks, Beer, Liquor, Wine, Appetizers, Entrees, Burgers, Sides, Desserts);
		
		
	
		
		///
		BorderPane borderPane = new BorderPane();
		
		borderPane.setLeft(leftMenu);
		///
		
		Scene scene = new Scene(borderPane, 300,250);
		window.setTitle("Input Order");
		window.setScene(scene);
		window.show();	
		return loggedIn;
		
		
	}
}
