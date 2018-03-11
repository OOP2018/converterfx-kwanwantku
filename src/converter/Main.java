package converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * The main for running application.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 * @since 2018.03.09
 */
public class Main extends Application{

	/**
	 * This is start stage for running.
	 */
	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.sizeToScene();
			stage.show();
			
		} catch(Exception e) {
			System.out.println("Exception creating scene: "+e.getMessage());
		}
		
	}
	
	/**
	 * Running an application
	 * @param args to run command.
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
