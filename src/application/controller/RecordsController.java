package application.controller;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RecordsController implements EventHandler<ActionEvent> {
	@FXML
	Label displayID;
	
	public void handle(ActionEvent event) {
		
	}
	
	public void twentytotwentynine(ActionEvent event) {
		displayID.setText("information loading...");
	}
}
