import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Login {

    @FXML
    private TextField idname;

    @FXML
    private TextField idpassword;

    @FXML
    void btnclick(ActionEvent event) throws IOException {
        String username = idname.getText();
        String password = idpassword.getText();
        
        if (username.equals("Yudhis") && password.equals("12345")) {
            Parent root = FXMLLoader.load(getClass().getResource("invensen.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Kesalahan Dalam Input Data");
            alert.setContentText("Silahkan cek data yang anda masukan.");
            alert.showAndWait();
        }
    }
}
