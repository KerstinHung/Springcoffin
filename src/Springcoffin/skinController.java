package Springcoffin;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import org.w3c.dom.events.MouseEvent;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class skinController implements Initializable {
	boolean x = true;
	
	@FXML
	ImageView _test;
	public void onTestPressed() {
			_test.setImage(Selectbtn);
			System.out.println("pressed");
	}
	public void onTestReleased() {
		_test.setImage(Buybtn);
	}
	
	
	@FXML
	Label _saving;
	
	@FXML
	Image CannotBuybtn = new Image("CANNOTBuyButton.png");
	Image Buybtn = new Image("BuyButton.png");
	Image Selectbtn = new Image("SelectButton.png");
	Image captainLock = new Image("captainLock.png");
	
	@FXML
	ImageView _btn1;
	@FXML
	ImageView _btn2;
	@FXML
	ImageView _btn3;
	@FXML
	ImageView _btn4;
	@FXML
	ImageView _btn5;
	@FXML
	ImageView _btn6;
	@FXML
	ImageView _btn7;
	
	Style style = new Style();
	Statement unlock = new Statement();
	Saving s = new Saving();
	
	@FXML
	public void on1Pressed() {
		style.setType(0);
	}
	
	@FXML
	public void on2Pressed() {
		if(s.getSaving() >= 50 && !(unlock.getCaptainUnlock(1))) {
			unlock.setCaptainUnlock(1);
			s.setSaving(-50);
			String tmp = "" + s.getSaving();
			_saving.setText(tmp);
			_btn2.setImage(Selectbtn);
			
			if(s.getSaving() < 50) {
				if(!(unlock.getCaptainUnlock(2))) _btn3.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(3))) _btn4.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(4))) _btn5.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(5))) _btn6.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(6))) _btn7.setImage(CannotBuybtn);
			}
		}else if(s.getSaving() < 50 && !(unlock.getCaptainUnlock(1))){
			
		}else if(unlock.getCaptainUnlock(1)) {
			style.setType(1);
		}
	}
	
	@FXML
	public void on3Pressed() {
		
		if(s.getSaving() >= 50 && !(unlock.getCaptainUnlock(2))) {
			unlock.setCaptainUnlock(2);
			s.setSaving(-50);
			String tmp = "" + s.getSaving();
			_saving.setText(tmp);
			_btn3.setImage(Selectbtn);
			
			if(s.getSaving() < 50) {
				if(!(unlock.getCaptainUnlock(1))) _btn2.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(3))) _btn4.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(4))) _btn5.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(5))) _btn6.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(6))) _btn7.setImage(CannotBuybtn);
			}
		}else if(s.getSaving() < 50 && !(unlock.getCaptainUnlock(2))){
			
		}else if(unlock.getCaptainUnlock(2)) {
			style.setType(2);
		}
	}
	
	@FXML
	public void on4Pressed() {
		if(s.getSaving() >= 50 && !(unlock.getCaptainUnlock(3))) {
			unlock.setCaptainUnlock(3);
			s.setSaving(-50);
			String tmp = "" + s.getSaving();
			_saving.setText(tmp);
			_btn4.setImage(Selectbtn);
			
			if(s.getSaving() < 50) {
				if(!(unlock.getCaptainUnlock(1))) _btn2.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(2))) _btn3.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(4))) _btn5.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(5))) _btn6.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(6))) _btn7.setImage(CannotBuybtn);
			}
		}else if(s.getSaving() < 50 && !(unlock.getCaptainUnlock(3))){
			
		}else if(unlock.getCaptainUnlock(3)) {
			style.setType(3);
		}
	}

	@FXML
	public void on5Pressed() {
		if(s.getSaving() >= 50 && !(unlock.getCaptainUnlock(4))) {
			unlock.setCaptainUnlock(4);
			s.setSaving(-50);
			String tmp = "" + s.getSaving();
			_saving.setText(tmp);
			_btn5.setImage(Selectbtn);
			
			if(s.getSaving() < 50) {
				if(!(unlock.getCaptainUnlock(1))) _btn2.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(2))) _btn3.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(3))) _btn4.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(5))) _btn6.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(6))) _btn7.setImage(CannotBuybtn);
			}
		}else if(s.getSaving() < 50 && !(unlock.getCaptainUnlock(4))){
			
		}else if(unlock.getCaptainUnlock(4)) {
			style.setType(4);
		}
	}

	@FXML
	public void on6Pressed() {
		if(s.getSaving() >= 50 && !(unlock.getCaptainUnlock(5))) {
			unlock.setCaptainUnlock(5);
			s.setSaving(-50);
			String tmp = "" + s.getSaving();
			_saving.setText(tmp);
			_btn6.setImage(Selectbtn);
			
			if(s.getSaving() < 50) {
				if(!(unlock.getCaptainUnlock(1))) _btn2.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(2))) _btn3.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(3))) _btn4.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(4))) _btn5.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(6))) _btn7.setImage(CannotBuybtn);
			}
		}else if(s.getSaving() < 50 && !(unlock.getCaptainUnlock(5))){
			
		}else if(unlock.getCaptainUnlock(5)) {
			style.setType(5);
		}
	}

	@FXML
	public void on7Pressed() {
		if(s.getSaving() >= 50 && !(unlock.getCaptainUnlock(6))) {
			unlock.setCaptainUnlock(6);
			s.setSaving(-50);
			String tmp = "" + s.getSaving();
			_saving.setText(tmp);
			_btn7.setImage(Selectbtn);
			
			if(s.getSaving() < 50) {
				if(!(unlock.getCaptainUnlock(1))) _btn2.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(2))) _btn3.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(3))) _btn4.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(4))) _btn5.setImage(CannotBuybtn);
				if(!(unlock.getCaptainUnlock(5))) _btn6.setImage(CannotBuybtn);
			}
		}else if(s.getSaving() < 50 && !(unlock.getCaptainUnlock(5))){
			
		}else if(unlock.getCaptainUnlock(6)) {
			style.setType(6);
		}	
	}
	
	@FXML
	public void onBackPressed() throws IOException {
		Parent game = FXMLLoader.load(getClass().getResource("game.fxml"));
		Scene gameScene = new Scene(game);
		main.currentStage.setScene(gameScene);
	}
	
	protected void setSavingLabel() {
		String Ssaving = "" + s.getSaving();
		_saving.setText(Ssaving);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setSavingLabel();
		
		if(unlock.getCaptainUnlock(1)) {
			_btn2.setImage(Selectbtn);
		}
		else if(s.getSaving() < 50) {
			_btn2.setImage(CannotBuybtn);
		}else {
			_btn2.setImage(Buybtn);
		}
		
		if(unlock.getCaptainUnlock(2)) {
			_btn3.setImage(Selectbtn);
		}
		else if(s.getSaving() < 50) {
			_btn3.setImage(CannotBuybtn);
		}else {
			_btn3.setImage(Buybtn);
		}
		
		if(unlock.getCaptainUnlock(3)) {
			_btn4.setImage(Selectbtn);
		}
		else if(s.getSaving() < 50) {
			_btn4.setImage(CannotBuybtn);
		}else {
			_btn4.setImage(Buybtn);
		}
		
		if(unlock.getCaptainUnlock(4)) {
			_btn5.setImage(Selectbtn);
		}
		else if(s.getSaving() < 50) {
			_btn5.setImage(CannotBuybtn);
		}else {
			_btn5.setImage(Buybtn);
		}
		
		if(unlock.getCaptainUnlock(5)) {
			_btn6.setImage(Selectbtn);
		}
		else if(s.getSaving() < 50) {
			_btn6.setImage(CannotBuybtn);
		}else {
			_btn6.setImage(Buybtn);
		}
		
		if(unlock.getCaptainUnlock(6)) {
			_btn7.setImage(Selectbtn);
		}
		else if(s.getSaving() < 50) {
			_btn7.setImage(CannotBuybtn);
		}else {
			_btn7.setImage(Buybtn);
		}
    }

}

