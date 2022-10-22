package application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InsuranceController implements EventHandler<ActionEvent> {
	@FXML
	Label insuranceinfo;
	
	public void handle(ActionEvent event) {
		
	}
	
	public void provider(ActionEvent event) {
		insuranceinfo.setText("loading provider info....");
	}

}
