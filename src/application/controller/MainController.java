package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class MainController implements EventHandler<ActionEvent>{

	public void handle(ActionEvent event) {
		
	}
	
	
	public void healthinsurance(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/Insurance.fxml"));
			
			// AnchorPane layout = (AnchorPane)loader.load();
			
			Scene scene = new Scene(loader.load());
			
			Main.stage.setScene(scene);
			Main.stage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void records(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/Records.fxml"));
			
			// AnchorPane layout = (AnchorPane)loader.load();
			
			Scene scene = new Scene(loader.load());
			
			Main.stage.setScene(scene);
			Main.stage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void physician(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/Physicians.fxml"));
			
			// AnchorPane layout = (AnchorPane)loader.load();
			
			Scene scene = new Scene(loader.load());
			
			Main.stage.setScene(scene);
			Main.stage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void transactions(ActionEvent event) {
		
	}
	
	public void settings(ActionEvent event) {
		
	}
}
