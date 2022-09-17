package Springcoffin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application{
	public static Stage currentStage;	// to document current stage
	public static Scene menuScene;	// scene of menu
	public static Scene gameScene;
	public static Scene pilingScene;

	@Override
	public void start(Stage primaryStage) throws Exception {
		currentStage = primaryStage;
		Parent menu = FXMLLoader.load(getClass().getResource("menu.fxml"));
		Parent game = FXMLLoader.load(getClass().getResource("game.fxml"));
		Parent piling = FXMLLoader.load(getClass().getResource("piling.fxml"));
		menuScene = new Scene(menu, 600, 400);
		gameScene = new Scene(game, 600, 400);
		pilingScene = new Scene(piling, 600, 400);
		
		currentStage.setTitle("SpringCoffin");
		currentStage.setScene(menuScene);
		currentStage.show();
		
	}
	
	public static void main(String[] args) {
        launch(args);
    }
}
