package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class beer {
	public static void display() {
		Stage window = new Stage();
		HBox openDrinks = new HBox();
		
		Button budLight = new Button("Bud Light");
		budLight.setOnAction(e-> {inputOrder.display("Input Order");});
		Button coorsLight = new Button("Coors Light");
		coorsLight.setOnAction(e-> {inputOrder.display("Input Order");});

		Button michUltra = new Button("Mich Ultra");
		michUltra.setOnAction(e-> {inputOrder.display("Input Order");});

		Button sierra = new Button("Sierra Hazy");
		sierra.setOnAction(e-> {inputOrder.display("Input Order");});

		Button guiness = new Button("Guiness");
		guiness.setOnAction(e-> {inputOrder.display("Input Order");});

		Button metazoaNap = new Button("Metazoa Hammock");
		metazoaNap.setOnAction(e-> {inputOrder.display("Input Order");});

		openDrinks.getChildren().addAll(budLight,coorsLight,michUltra,sierra,guiness,metazoaNap);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(openDrinks);
		Scene scene = new Scene(borderPane, 300,250);
		window.setTitle("Input Order");
		window.setScene(scene);
		window.show();	
	}
}
