package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Apuri_UI.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Apuri Control Center v1.0 alpa");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
