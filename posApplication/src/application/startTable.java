package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class startTable {

	private static boolean newTable = false;
	public static boolean display(boolean newTable) {
		//is a new table
		
		
		
		Stage window = new Stage();
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(8);
		
		HBox hbox = new HBox();
		Label guestCount = new Label("Enter the amount of guests: ");
		GridPane.setConstraints(guestCount,0, 0);
		TextField inputGuestCount = new TextField();
		GridPane.setConstraints(inputGuestCount,0,2);
		Button enterTable = new Button("Enter");
		GridPane.setConstraints(enterTable, 1, 0);
		enterTable.setOnAction(e->{
			inputOrder.display("Input Order");
			return;
		});
		Button cancel = new Button("Cancel");
		GridPane.setConstraints(cancel, 2, 0);
		
		cancel.setOnAction(e-> Tables.display("Tables"));
		grid.getChildren().addAll(guestCount, inputGuestCount,enterTable, cancel);
		
		//BorderPane borderPane = new BorderPane();
		Scene scene = new Scene(grid, 300,250);
		window.setTitle("Tables");
		window.setScene(scene);
		window.show();	
		
		return newTable;
	}
}
