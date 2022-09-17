package Springcoffin;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.SequentialTransition;
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
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

public class pilingController implements Initializable, EventHandler<KeyEvent>{
	
	@FXML
	public Button _btnBack;

	@FXML
	public Pane _all;
	
	@FXML
	public Pane _field;
	
	@FXML
	public ImageView _bottom;
	
	@FXML
	public Image bottomCoffin = new Image("bottomCoffin.png");
	
	// load coffins
	@FXML
	public Image coffin1 = new Image("coffin1.png");	// 25 * 50
	public Image coffin2 = new Image("coffin2.png");	// 50 * 50
	public Image coffin3 = new Image("coffin3.png");	// 75 * 50
	public Image coffin4 = new Image("coffin4.png");	// 100 * 50
	
	// load captain
	@FXML
	final static Image captain_appear0 = new Image("captain_appear0.png");
	final static Image captain_appear1 = new Image("captain_appear1.png");
	final static Image captain_appear2 = new Image("captain_appear2.png");
	final static Image captain_appear3 = new Image("captain_appear3.png");
	final static Image captain_appear4 = new Image("captain_appear4.png");
	final static Image captain_appear5 = new Image("captain_appear5.png");
	final static Image captain_appear6 = new Image("captain_appear6.png");
	final static Image captain_roll7 = new Image("captain_roll7.png");
	
	@FXML
	final static Image captain_appear1V2 = new Image("captainV2_appear1.png");
	final static Image captain_appear2V2 = new Image("captainV2_appear2.png");
	final static Image captain_appear3V2 = new Image("captainV2_appear3.png");
	final static Image captain_appear4V2 = new Image("captainV2_appear4.png");
	final static Image captain_appear5V2 = new Image("captainV2_appear5.png");
	final static Image captain_appear6V2 = new Image("captainV2_appear6.png");
	final static Image captain_roll7V2 = new Image("captainV2_roll7.png");
	
	@FXML
	final static Image captain_appear1V3 = new Image("captainV3_appear1.png");
	final static Image captain_appear2V3 = new Image("captainV3_appear2.png");
	final static Image captain_appear3V3 = new Image("captainV3_appear3.png");
	final static Image captain_appear4V3 = new Image("captainV3_appear4.png");
	final static Image captain_appear5V3 = new Image("captainV3_appear5.png");
	final static Image captain_appear6V3 = new Image("captainV3_appear6.png");
	final static Image captain_roll7V3 = new Image("captainV3_roll7.png");
	
	@FXML
	final static Image captain_appear1V4 = new Image("captainV4_appear1.png");
	final static Image captain_appear2V4 = new Image("captainV4_appear2.png");
	final static Image captain_appear3V4 = new Image("captainV4_appear3.png");
	final static Image captain_appear4V4 = new Image("captainV4_appear4.png");
	final static Image captain_appear5V4 = new Image("captainV4_appear5.png");
	final static Image captain_appear6V4 = new Image("captainV4_appear6.png");
	final static Image captain_roll7V4 = new Image("captainV4_roll7.png");
	
	@FXML
	final static Image captain_appear1V5 = new Image("captainV5_appear1.png");
	final static Image captain_appear2V5 = new Image("captainV5_appear2.png");
	final static Image captain_appear3V5 = new Image("captainV5_appear3.png");
	final static Image captain_appear4V5 = new Image("captainV5_appear4.png");
	final static Image captain_appear5V5 = new Image("captainV5_appear5.png");
	final static Image captain_appear6V5 = new Image("captainV5_appear6.png");
	final static Image captain_roll7V5 = new Image("captainV5_roll7.png");
	
	// create group nodes
	private Group captain;
	
	@FXML
	public Timeline Hfps;
	
	@FXML
	public Timeline Vfps;
	
	@FXML
	public Timeline removeFps;
	
	@FXML
	public Text _score = new Text();
	
	LinkedList<ImageView> _movingCoffins = new LinkedList<ImageView>();
	
	LinkedList<ImageView> _droppingCoffins = new LinkedList<ImageView>();
	
	LinkedList<ImageView> _droppedCoffins = new LinkedList<ImageView>();
	
	LinkedList<ImageView> _trashCoffins = new LinkedList<ImageView>();
	
	private double dX = 1;
	
	private double dY = 1;
	
	private int score = 0;
	
	private double rate = 5;
	
	private int dropCount = 0;
	
	@FXML
	public void OnBackInPilingPressed() throws IOException {
		// set saving
		Saving s = new Saving();
		int income = score / 10;
		s.setSaving(income);
		
		// reset dropCount & rate
		rate = 5;
		dropCount = 0;
		
		/** reset controls*/
		// remove all the coffins
		_field.getChildren().clear();
		_movingCoffins.clear();
		_droppingCoffins.clear();
		_droppedCoffins.clear();
		
		//reset bottom
		ImageView new_bottom = new ImageView(bottomCoffin);
		new_bottom.setFitHeight(50);
		new_bottom.setFitWidth(240);
		new_bottom.setLayoutX(55);
		new_bottom.setLayoutY(350);
		_droppedCoffins.push(new_bottom);
		
		// reset moving coffin
		ImageView new_coffin = new ImageView(coffin4);
		new_coffin.setFitHeight(50);
		new_coffin.setFitWidth(100);
		new_coffin.setLayoutX(0);
		new_coffin.setLayoutY(100);
		_movingCoffins.push(new_coffin);
		Hfps = new Timeline(new KeyFrame(Duration.millis(rate),(e)->moveCoffin()));
		Hfps.setCycleCount(Timeline.INDEFINITE);
		Hfps.play();
		
		// reset score
		score = 0;
		String Sscore = "" + score;
		_score.setText(Sscore);
		
		// add controls to field
		_field.getChildren().addAll(new_bottom, new_coffin);
		
		Parent game = FXMLLoader.load(getClass().getResource("game.fxml"));
		Scene gameScene = new Scene(game);
		main.currentStage.setScene(gameScene);
	}
	
	@Override
	public void handle(KeyEvent arg0) {		
		if(arg0.getCode() == KeyCode.DOWN) {
			
			// calculate the numbers of pressing DOWN
			dropCount++;
			
			// change the elements of sets
			Hfps.pause();
			_droppingCoffins.push(_movingCoffins.get(0));
			_movingCoffins.remove(0);
			
			// add score
			double DL = _droppingCoffins.get(0).getLayoutX();	// dropping Coffin Left layout X
			double DR = _droppingCoffins.get(0).getLayoutX() + _droppingCoffins.get(0).getFitWidth();	// dropping Coffin Right layout X
			double HL = _droppedCoffins.get(0).getLayoutX();	// Highest dropped Coffin Left layout X
			double HR = _droppedCoffins.get(0).getLayoutX() + _droppedCoffins.get(0).getFitWidth();	// Highest dropped Coffin Right layout X
			
			if(!(DL > HR || DR < HL)) setScore();
			else captainAnima();

			// play the dropping animation
			Vfps = new Timeline(new KeyFrame(Duration.millis(2),(e)->dropCoffin()));
			Vfps.setCycleCount(Timeline.INDEFINITE);
			Vfps.play();
			
		}
		
		/** remove a dropped coffin*/
		if(_droppedCoffins.size() >= 3) {
			removeFps = new Timeline(new KeyFrame(Duration.millis(5),(e)->removeCoffin()));
			removeFps.setCycleCount(50);
			removeFps.play();
			if(_trashCoffins.size() != 0)
			_field.getChildren().remove(_trashCoffins.get(0));
		}else removeFps.pause();
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		/** set controls*/
		// set _score's properties
		_score.setText("0");
		_score.setFont(new Font(20));
		_score.setTextAlignment(TextAlignment.RIGHT);
		_score.setFill(Color.BLACK);
		_score.setStroke(Color.BROWN);
		_score.setStrokeWidth(2);
		_score.setLayoutX(550);
		_score.setLayoutY(25);
		_all.getChildren().add(_score);
		
		// set _field's properties
		_field = new Pane();
		_field.setStyle("-fx-background-color: lightblue;");
		_field.setPrefSize(350, 400);
		_field.setLayoutX(125);
		_field.setLayoutY(0);
		_all.getChildren().add(_field);
		
		// set Controls in _field
		_bottom = new ImageView(bottomCoffin);
		_bottom.setFitHeight(50);
		_bottom.setFitWidth(240);
		_bottom.setLayoutX(55);
		_bottom.setLayoutY(350);
		
		ImageView _coffin = new ImageView(coffin4);
		_coffin.setFitHeight(50);
		_coffin.setFitWidth(100);
		_coffin.setLayoutX(0);
		_coffin.setLayoutY(100);
		
		_field.getChildren().addAll(_bottom, _coffin);
		
		_movingCoffins.push(_coffin);
		_droppedCoffins.push(_bottom);
		
		/** set animation*/
		// animation for coffins
		Hfps = new Timeline(new KeyFrame(Duration.millis(rate),(e)->moveCoffin()));
		Hfps.setCycleCount(Timeline.INDEFINITE);
		Hfps.play();
		}
	
	protected void moveCoffin() {
		ArrayList<ImageView> tCoffins = new ArrayList<ImageView>(_movingCoffins);
		
		for(var b : tCoffins) {
			if(b.getLayoutX() < 0 || b.getLayoutX() > (350 - b.getFitWidth())) 
				dX *= -1;
			b.setLayoutX(b.getLayoutX() + dX);
		}}
	
	protected void dropCoffin() {
		double tempDY = dY;
		double highestPiled = _droppedCoffins.get(0).getLayoutY();
		
		for(var b : _droppingCoffins){
			double DL = _droppingCoffins.get(0).getLayoutX();	// dropping Coffin Left layout X
			double DR = _droppingCoffins.get(0).getLayoutX() + _droppingCoffins.get(0).getFitWidth();	// dropping Coffin Right layout X
			double HL = _droppedCoffins.get(0).getLayoutX();	// Highest dropped Coffin Left layout X
			double HR = _droppedCoffins.get(0).getLayoutX() + _droppedCoffins.get(0).getFitWidth();	// Highest dropped Coffin Right layout X

			/** case of miss coffins*/
			if(DL > HR || DR < HL){
				b.setLayoutY(b.getLayoutY() + tempDY);
				if(b.getLayoutY() >= _field.getHeight()) {
					_droppedCoffins.remove(b);
				}
				_btnBack.requestFocus();
				
			}

			/** case of successfully pile coffins*/
			else{
				if(b.getLayoutY() > highestPiled - 51) 
					tempDY *= 0;
				b.setLayoutY(b.getLayoutY() + tempDY);
			}
			
			/** events while the coffin has dropped*/
			if(tempDY == 0) {
				Vfps.pause();
				
				/** add new coffin*/
				ImageView newCoffin = getCoffin();
				
				// set the initial location
				int newX = 101 + (int)(Math.random() * 99);
				
				newCoffin.setLayoutX(newX);
				newCoffin.setLayoutY(100);
				_field.getChildren().add(newCoffin);
				_movingCoffins.push(newCoffin);
				
				_droppedCoffins.push(_droppingCoffins.get(0));
				_droppingCoffins.remove(0);
				
				// change the rate of Hfps and resume
				if(dropCount < 10) rate = 5;
				else if(dropCount >= 10 && dropCount < 20) rate = 4;
				else if(dropCount >= 20 && dropCount < 30) rate = 3;
				else rate = 2;
				
				Hfps = new Timeline(new KeyFrame(Duration.millis(rate),(e)->moveCoffin()));
				Hfps.setCycleCount(Timeline.INDEFINITE);
				Hfps.play();
				}}
		
	}
	
	protected void removeCoffin() {
		ArrayList<ImageView> tdroppedCoffins = new ArrayList<ImageView>(_droppedCoffins);
		double tempDY = dY;
		
		for(var b : tdroppedCoffins) {
			if(b.getLayoutY() >= _field.getHeight()) {
				_trashCoffins.push(b);
				_droppedCoffins.remove(b);
				tempDY *= 0;}
			b.setLayoutY(b.getLayoutY() + tempDY);
		}}
	
	protected ImageView getCoffin() {
		int random = 1 + (int)(Math.random() * 100);
		int type = 0;
		ImageView newC = null;
		
		if(dropCount < 10) {
			if(random >= 1 && random <= 15) type = 1;
			else if(random >= 16 && random <= 55) type = 2;
			else if(random >= 56 && random <= 80) type = 3;
			else type = 4;
		}else if(dropCount >= 10 && dropCount < 20) {
			if(random >= 1 && random <= 20) type = 1;
			else if(random >= 21 && random <= 65) type = 2;
			else if(random >= 66 && random <= 80) type = 3;
			else type = 4;
		}else if(dropCount >= 20 && dropCount < 30) {
			if(random >= 1 && random <= 25) type = 1;
			else if(random >= 26 && random <= 75) type = 2;
			else if(random >= 76 && random <= 90) type = 3;
			else type = 4;
		}else {
			if(random >= 1 && random <= 30) type = 1;
			else if(random >= 31 && random <= 85) type = 2;
			else if(random >= 86 && random <= 95) type = 3;
			else type = 4;
		}
		
		
		switch(type) {
		case 1:
			newC = new ImageView(coffin1);
			newC.setFitHeight(50);
			newC.setFitWidth(25);
			break;
		case 2:
			newC = new ImageView(coffin2);
			newC.setFitHeight(50);
			newC.setFitWidth(50);
			break;
		case 3:
			newC = new ImageView(coffin3);
			newC.setFitHeight(50);
			newC.setFitWidth(75);
			break;
		case 4:
			newC = new ImageView(coffin4);
			newC.setFitHeight(50);
			newC.setFitWidth(100);
			break;
		}
		return newC;
	}
	
	protected void setScore() {
		if(_droppedCoffins.get(0).getFitWidth() == 25 && _droppingCoffins.get(0).getFitWidth() == 25) score += 40;
		else if(_droppedCoffins.get(0).getFitWidth() == 25 && _droppingCoffins.get(0).getFitWidth() == 50) score += 35;
		else if(_droppedCoffins.get(0).getFitWidth() == 50 && _droppingCoffins.get(0).getFitWidth() == 25) score += 30;
		else if(_droppedCoffins.get(0).getFitWidth() == 50 && _droppingCoffins.get(0).getFitWidth() == 50) score += 20;
		else score += 10;
		
		String newScore = "" + score;
		_score.setText(newScore);
	}
	
	protected void captain_dropPath() {
			double tempDY = -1;
			for(; captain.getTranslateY() < 400;) {
				if(captain.getTranslateY() < (_droppedCoffins.get(0).getLayoutY() - 150))
					tempDY *= (-1);
				captain.setTranslateY(captain.getTranslateY() + tempDY);
			}
	}
	
	protected void captainAnima() {
		final ImageView appear0 = new ImageView(captain_appear0);
		final ImageView appear1 = new ImageView(captain_appear1);
		final ImageView appear2 = new ImageView(captain_appear2);
		final ImageView appear3 = new ImageView(captain_appear3);
		final ImageView appear4 = new ImageView(captain_appear4);
		final ImageView appear5 = new ImageView(captain_appear5);
		final ImageView appear6 = new ImageView(captain_appear6);
		final ImageView roll7 = new ImageView(captain_roll7);
		
		final ImageView appear1V2 = new ImageView(captain_appear1V2);
		final ImageView appear2V2 = new ImageView(captain_appear2V2);
		final ImageView appear3V2 = new ImageView(captain_appear3V2);
		final ImageView appear4V2 = new ImageView(captain_appear4V2);
		final ImageView appear5V2 = new ImageView(captain_appear5V2);
		final ImageView appear6V2 = new ImageView(captain_appear6V2);
		final ImageView roll7V2 = new ImageView(captain_roll7V2);
		
		final ImageView appear1V3 = new ImageView(captain_appear1V3);
		final ImageView appear2V3 = new ImageView(captain_appear2V3);
		final ImageView appear3V3 = new ImageView(captain_appear3V3);
		final ImageView appear4V3 = new ImageView(captain_appear4V3);
		final ImageView appear5V3 = new ImageView(captain_appear5V3);
		final ImageView appear6V3 = new ImageView(captain_appear6V3);
		final ImageView roll7V3 = new ImageView(captain_roll7V3);
		
		final ImageView appear1V4 = new ImageView(captain_appear1V4);
		final ImageView appear2V4 = new ImageView(captain_appear2V4);
		final ImageView appear3V4 = new ImageView(captain_appear3V4);
		final ImageView appear4V4 = new ImageView(captain_appear4V4);
		final ImageView appear5V4 = new ImageView(captain_appear5V4);
		final ImageView appear6V4 = new ImageView(captain_appear6V4);
		final ImageView roll7V4 = new ImageView(captain_roll7V4);
		
		final ImageView appear1V5 = new ImageView(captain_appear1V5);
		final ImageView appear2V5 = new ImageView(captain_appear2V5);
		final ImageView appear3V5 = new ImageView(captain_appear3V5);
		final ImageView appear4V5 = new ImageView(captain_appear4V5);
		final ImageView appear5V5 = new ImageView(captain_appear5V5);
		final ImageView appear6V5 = new ImageView(captain_appear6V5);
		final ImageView roll7V5 = new ImageView(captain_roll7V5);
		
		Timeline ApppearFps = new Timeline();
		ApppearFps.setCycleCount(1);
		
		captain = new Group(appear0);
		
		_field.getChildren().add(captain);
		
		captain.setTranslateX(_droppedCoffins.get(0).getLayoutX() + _droppedCoffins.get(0).getFitWidth() / 2 - 25);
		captain.setTranslateY(_droppedCoffins.get(0).getLayoutY() - 50);
		
		Style style = new Style();
		int type = style.getType();
		
		switch(type) {
		case 0:
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(500),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear1);
					}));
			
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(600),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear2);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(700),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear3);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear4);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(900),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear5);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1000),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear6);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1300),
					(ActionEvent event) -> {
						captain.getChildren().setAll(roll7);
					}));
			break;
			
		case 1:
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(500),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear1V2);
					}));
			
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(600),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear2V2);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(700),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear3V2);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear4V2);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(900),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear5V2);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1000),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear6V2);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1300),
					(ActionEvent event) -> {
						captain.getChildren().setAll(roll7V2);
					}));
			break;
		
		case 2:
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(500),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear1V3);
					}));
			
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(600),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear2V3);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(700),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear3V3);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear4V3);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(900),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear5V3);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1000),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear6V3);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1300),
					(ActionEvent event) -> {
						captain.getChildren().setAll(roll7V3);
					}));
			break;
			
		case 3:
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(500),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear1V4);
					}));
			
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(600),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear2V4);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(700),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear3V4);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear4V4);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(900),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear5V4);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1000),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear6V4);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1300),
					(ActionEvent event) -> {
						captain.getChildren().setAll(roll7V4);
					}));
			break;
			
		case 4:
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(500),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear1V5);
					}));
			
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(600),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear2V5);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(700),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear3V5);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(800),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear4V5);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(900),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear5V5);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1000),
					(ActionEvent event) -> {
						captain.getChildren().setAll(appear6V5);
					}));
			ApppearFps.getKeyFrames().add(new KeyFrame(
					Duration.millis(1300),
					(ActionEvent event) -> {
						captain.getChildren().setAll(roll7V5);
					}));
			break;
		}
		
		TranslateTransition jump = new TranslateTransition();
		jump.setDuration(Duration.seconds(0.5));
		jump.setNode(captain);
		
		jump.setToY(_droppedCoffins.get(0).getLayoutY() - 115);
		
		TranslateTransition down = new TranslateTransition();
		down.setDuration(Duration.seconds(0.5));
		down.setNode(captain);
		
		down.setToY(400);
		
		SequentialTransition seqT = new SequentialTransition(captain, ApppearFps, jump, down);
		seqT.play();
	}

}
