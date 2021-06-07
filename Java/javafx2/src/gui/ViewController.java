package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button bt;
	
	@FXML
	public void onBtAction() {
		System.out.println("click");
	}

}
