package controller;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.*;

public class Main extends Application {
	private static Stage mainStage;

	private static final int DIFF_SCORE = 10;
	private static final int MIN_SCORE = 90;
	private static final int MAX_SCORE = 100;

	private static final int NUMBER_OF_PLAYERS = 11;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		mainStage = primaryStage;
		mainStage.setTitle("Stars League");
		mainStage.setResizable(true);
		Parent root = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
		
		mainStage.setFullScreenExitHint("");

		int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
		int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();
		
		root.setScaleX(screenWidth/1400.0);
		root.setScaleY(screenHeight/900.0);
		root.setLayoutX(301);
		root.setLayoutY(98);
		
		Scene scene = new Scene(root, screenWidth, screenHeight);

		mainStage.setScene(scene);
		mainStage.setFullScreen(true);
		mainStage.show();

	}

	
	public static int getOverall() {
		return MIN_SCORE + (int) (Math.random() * DIFF_SCORE + 1);
	}

	public static int[] getAttributes() {
		int[] attributes = new int[8];
		for (int i = 0; i < 8; i++)
			attributes[i] = MIN_SCORE + (int) (Math.random() * DIFF_SCORE + 1);
		return attributes;
	}

	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
		Tournament c = Tournament.getInstance();
		Database.saveCurrentGame(c);
		launch(args);
	}

	public static void setMainStage(Stage mainStage) {
		Main.mainStage = mainStage;
	}

	public static Stage getMainStage() {
		return mainStage;
	}

}
