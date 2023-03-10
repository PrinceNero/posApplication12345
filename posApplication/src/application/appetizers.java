package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class appetizers {

	public static void display() {
		Stage window = new Stage();
		HBox openDrinks = new HBox();
		Button a = new Button("Chips and Queso");
		a.setOnAction(e-> {inputOrder.display("Input Order");});
		Button b = new Button("Pretzel Sticks");
		b.setOnAction(e-> {inputOrder.display("Input Order");});

		Button c = new Button("Mozzerella Sticks");
		c.setOnAction(e-> {inputOrder.display("Input Order");});

		Button d = new Button("Brussle Sprouts");
		d.setOnAction(e-> {inputOrder.display("Input Order");});

		Button f = new Button("Chips and Salsa");
		f.setOnAction(e-> {inputOrder.display("Input Order");});

		Button g = new Button("Sliders");
		g.setOnAction(e-> {inputOrder.display("Input Order");});

		openDrinks.getChildren().addAll(a,b,c,d,f,g);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(openDrinks);
		Scene scene = new Scene(borderPane, 300,250);
		window.setTitle("Input Order");
		window.setScene(scene);
		window.show();	
	}
}
