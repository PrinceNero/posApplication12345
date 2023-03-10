package application;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class drinks {
	
	public static void display() {
		Stage window = new Stage();
		HBox openDrinks = new HBox();
		Button coke = new Button("Coke");
		coke.setOnAction(e-> {inputOrder.display("Input Order");});
		Button sprite = new Button("Sprite");
		sprite.setOnAction(e-> {inputOrder.display("Input Order");});

		Button dietCoke = new Button("Diet Coke");
		dietCoke.setOnAction(e-> {inputOrder.display("Input Order");});

		Button drPepper = new Button("Dr. Pepper");
		drPepper.setOnAction(e-> {inputOrder.display("Input Order");});

		Button sweetTea = new Button("Sweet Tea");
		sweetTea.setOnAction(e-> {inputOrder.display("Input Order");});

		Button unsweetTea = new Button("Unsweet Tea");
		unsweetTea.setOnAction(e-> {inputOrder.display("Input Order");});

		openDrinks.getChildren().addAll(coke, sprite, dietCoke, drPepper, sweetTea, unsweetTea);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(openDrinks);
		Scene scene = new Scene(borderPane, 300,250);
		window.setTitle("Input Order");
		window.setScene(scene);
		window.show();	
	}
	
}
