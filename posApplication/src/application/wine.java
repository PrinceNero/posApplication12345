package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class wine {
	public static void display() {
		Stage window = new Stage();
		HBox openDrinks = new HBox();
		Button chab = new Button("Cabernet");
		chab.setOnAction(e-> {inputOrder.display("Input Order");});
		Button moscatto = new Button("Moscatto");
		moscatto.setOnAction(e-> {inputOrder.display("Input Order");});

		Button pinoGrigio = new Button("Pino Grigio");
		pinoGrigio.setOnAction(e-> {inputOrder.display("Input Order");});

		

		openDrinks.getChildren().addAll(chab,moscatto,pinoGrigio);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(openDrinks);
		Scene scene = new Scene(borderPane, 300,250);
		window.setTitle("Input Order");
		window.setScene(scene);
		window.show();	
	}
}
