import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Loginsen.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Zeppi's Listening Bar");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) throws Exception{
        launch(args);
    }
}