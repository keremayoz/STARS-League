package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import model.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class StatisticController implements Initializable {

	int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
	int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

	@FXML
	private GridPane scorer;
	@FXML
	private GridPane assister;
	@FXML
	private GridPane yellow;
	@FXML
	private GridPane red;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Tournament c = Tournament.getInstance();
		String[] scorers = c.getTopGoals();
		String[] assisters = c.getTopAssists();
		String[] redCards = c.getTopRedCards();
		String[] yellowCards = c.getTopYellowCards();

		String style = "-fx-text-fill: black;" + "-fx-background-color: white;" + "-fx-font: Gill Sans;"
				+ "-fx-font-family: Gill Sans;" + "-fx-font-weight: bold;" + "-fx-font-size: 18;";

		for (int i = 0; i < 5; i++) {
			Text t1 = new Text();
			t1.setText(scorers[i]);
			t1.setStyle(style);
			scorer.add(t1, 0, i);
			Text t2 = new Text();
			t2.setText(assisters[i]);
			t2.setStyle(style);
			assister.add(t2, 0, i);
			Text t3 = new Text();
			t3.setText(redCards[i]);
			t3.setStyle(style);
			red.add(t3, 0, i);
			Text t4 = new Text();
			t4.setText(yellowCards[i]);
			t4.setStyle(style);
			yellow.add(t4, 0, i);
		}

	}
}
