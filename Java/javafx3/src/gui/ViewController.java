package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button bt;
	
	@FXML
	public void onBtAction() {
		Alerts.showAlert("Teste", "Teste2", "Hello", AlertType.INFORMATION);
	}

}
