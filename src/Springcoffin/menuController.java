package Springcoffin;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class menuController {
	
	@FXML
	public void onNewGamePressed() throws IOException {
		Parent game = FXMLLoader.load(getClass().getResource("game.fxml"));
		Scene gameScene = new Scene(game);
		main.currentStage.setScene(gameScene);
	}
	
	@FXML
	public void onExitPressed() {
		main.currentStage.close();
	}

}
