package application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PhysiciansController implements EventHandler<ActionEvent> {
	@FXML
	Label addto;
	
	public void handle(ActionEvent event) {
		
	}
	
	public void add(ActionEvent event) {
		addto.setText("add to records here");
	}

}
