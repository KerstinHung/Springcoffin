package Springcoffin;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class gameController implements Initializable{
	
	@FXML
	Pane _all = new Pane();
	
	@FXML
	Group dance;
	
	// load dancer image
	@FXML
	Image _dance1 = new Image("dance1.png");
	Image _dance2 = new Image("dance2.png");
	Image _dance3 = new Image("dance3.png");
	Image _dance4 = new Image("dance4.png");
	Image _dance5 = new Image("dance5.png");
	Image _dance6 = new Image("dance6.png");
	Image _dance7 = new Image("dance7.png");
	Image _dance8 = new Image("dance8.png");
	Image _dance9 = new Image("dance9.png");
	
	@FXML
	Image _dance1V2 = new Image("dance1V2.png");
	Image _dance2V2 = new Image("dance2V2.png");
	Image _dance3V2 = new Image("dance3V2.png");
	Image _dance4V2 = new Image("dance4V2.png");
	Image _dance5V2 = new Image("dance5V2.png");
	Image _dance6V2 = new Image("dance6V2.png");
	Image _dance7V2 = new Image("dance7V2.png");
	Image _dance8V2 = new Image("dance8V2.png");
	Image _dance9V2 = new Image("dance9V2.png");
	
	@FXML
	Image _dance1V3 = new Image("dance1V3.png");
	Image _dance2V3 = new Image("dance2V3.png");
	Image _dance3V3 = new Image("dance3V3.png");
	Image _dance4V3 = new Image("dance4V3.png");
	Image _dance5V3 = new Image("dance5V3.png");
	Image _dance6V3 = new Image("dance6V3.png");
	Image _dance7V3 = new Image("dance7V3.png");
	Image _dance8V3 = new Image("dance8V3.png");
	Image _dance9V3 = new Image("dance9V3.png");
	
	@FXML
	Image _dance1V4 = new Image("dance1V4.png");
	Image _dance2V4 = new Image("dance2V4.png");
	Image _dance3V4 = new Image("dance3V4.png");
	Image _dance4V4 = new Image("dance4V4.png");
	Image _dance5V4 = new Image("dance5V4.png");
	Image _dance6V4 = new Image("dance6V4.png");
	Image _dance7V4 = new Image("dance7V4.png");
	Image _dance8V4 = new Image("dance8V4.png");
	Image _dance9V4 = new Image("dance9V4.png");
	
	@FXML
	Image _dance1V5 = new Image("dance1V5.png");
	Image _dance2V5 = new Image("dance2V5.png");
	Image _dance3V5 = new Image("dance3V5.png");
	Image _dance4V5 = new Image("dance4V5.png");
	Image _dance5V5 = new Image("dance5V5.png");
	Image _dance6V5 = new Image("dance6V5.png");
	Image _dance7V5 = new Image("dance7V5.png");
	Image _dance8V5 = new Image("dance8V5.png");
	Image _dance9V5 = new Image("dance9V5.png");
	
	@FXML
	public void onHomePressed() {
		main.currentStage.setScene(main.menuScene);
	}
	
	@FXML
	public void onSkinPressed() throws IOException {
		Parent skin = FXMLLoader.load(getClass().getResource("skin.fxml"));
		Scene skinScene = new Scene(skin);
		skinScene.getRoot().requestFocus();
		main.currentStage.setScene(skinScene);
	}
	
	@FXML
	public void onStartPressed() {
		main.pilingScene.getRoot().requestFocus();
		main.currentStage.setScene(main.pilingScene);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setDancer();
	}
	
	private void setDancer() {
		final ImageView dance1 = new ImageView(_dance1);
		final ImageView dance2 = new ImageView(_dance2);
		final ImageView dance3 = new ImageView(_dance3);
		final ImageView dance4 = new ImageView(_dance4);
		final ImageView dance5 = new ImageView(_dance5);
		final ImageView dance6 = new ImageView(_dance6);
		final ImageView dance7 = new ImageView(_dance7);
		final ImageView dance8 = new ImageView(_dance8);
		final ImageView dance9 = new ImageView(_dance9);
		
		final ImageView dance1V2 = new ImageView(_dance1V2);
		final ImageView dance2V2 = new ImageView(_dance2V2);
		final ImageView dance3V2 = new ImageView(_dance3V2);
		final ImageView dance4V2 = new ImageView(_dance4V2);
		final ImageView dance5V2 = new ImageView(_dance5V2);
		final ImageView dance6V2 = new ImageView(_dance6V2);
		final ImageView dance7V2 = new ImageView(_dance7V2);
		final ImageView dance8V2 = new ImageView(_dance8V2);
		final ImageView dance9V2 = new ImageView(_dance9V2);
		
		final ImageView dance1V3 = new ImageView(_dance1V3);
		final ImageView dance2V3 = new ImageView(_dance2V3);
		final ImageView dance3V3 = new ImageView(_dance3V3);
		final ImageView dance4V3 = new ImageView(_dance4V3);
		final ImageView dance5V3 = new ImageView(_dance5V3);
		final ImageView dance6V3 = new ImageView(_dance6V3);
		final ImageView dance7V3 = new ImageView(_dance7V3);
		final ImageView dance8V3 = new ImageView(_dance8V3);
		final ImageView dance9V3 = new ImageView(_dance9V3);
		
		final ImageView dance1V4 = new ImageView(_dance1V4);
		final ImageView dance2V4 = new ImageView(_dance2V4);
		final ImageView dance3V4 = new ImageView(_dance3V4);
		final ImageView dance4V4 = new ImageView(_dance4V4);
		final ImageView dance5V4 = new ImageView(_dance5V4);
		final ImageView dance6V4 = new ImageView(_dance6V4);
		final ImageView dance7V4 = new ImageView(_dance7V4);
		final ImageView dance8V4 = new ImageView(_dance8V4);
		final ImageView dance9V4 = new ImageView(_dance9V4);
		
		final ImageView dance1V5 = new ImageView(_dance1V5);
		final ImageView dance2V5 = new ImageView(_dance2V5);
		final ImageView dance3V5 = new ImageView(_dance3V5);
		final ImageView dance4V5 = new ImageView(_dance4V5);
		final ImageView dance5V5 = new ImageView(_dance5V5);
		final ImageView dance6V5 = new ImageView(_dance6V5);
		final ImageView dance7V5 = new ImageView(_dance7V5);
		final ImageView dance8V5 = new ImageView(_dance8V5);
		final ImageView dance9V5 = new ImageView(_dance9V5);
		
		Style style = new Style();
		int type = style.getType();
		
		Timeline danceFps = new Timeline();
		danceFps.setCycleCount(Timeline.INDEFINITE);
		
		switch(type) {
		case 0:
			dance = new Group(dance1);
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance2);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance3);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance4);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1600),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance5);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2000),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance6);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance7);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance8);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(3200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance9);
					}));
			break;
		case 1:
			dance = new Group(dance1V2);
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance2V2);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance3V2);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance4V2);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1600),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance5V2);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2000),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance6V2);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance7V2);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance8V2);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(3200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance9V2);
					}));
			break;
		case 2:
			dance = new Group(dance1V3);
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance2V3);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance3V3);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance4V3);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1600),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance5V3);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2000),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance6V3);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance7V3);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance8V3);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(3200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance9V3);
					}));
			break;
		case 3:
			dance = new Group(dance1V4);
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance2V4);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance3V4);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance4V4);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1600),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance5V4);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2000),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance6V4);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance7V4);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance8V4);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(3200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance9V4);
					}));
			break;
			
		case 4:
			dance = new Group(dance1V5);
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance2V5);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance3V5);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance4V5);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1600),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance5V5);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2000),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance6V5);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2400),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance7V5);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(2800),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance8V5);
					}));
			danceFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(3200),
					(ActionEvent event) -> {
						dance.getChildren().setAll(dance9V5);
					}));
			break;
		}
		
		
		_all.getChildren().add(dance);
		
		dance.setTranslateX(175);
		dance.setTranslateY(80);
		
		danceFps.play();

		
	}
}
