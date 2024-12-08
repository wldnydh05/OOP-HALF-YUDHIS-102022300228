import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {

    @FXML
    private TableColumn<Album, String> artis;

    @FXML
    private TableColumn<Album, Integer> avail;

    @FXML
    private TextField idjudulalbum;

    @FXML
    private TextField idjumlahrented;

    @FXML
    private TextField idjumlahtotal;

    @FXML
    private TextField idnamaartis;

    @FXML
    private TableColumn<Album, String> namealbum;

    @FXML
    private TableView<Album> table;

    @FXML
    private TableColumn<Album, Integer> total;

    @FXML
    void initialize() {

        namealbum.setCellValueFactory(new PropertyValueFactory<>("judul"));
        artis.setCellValueFactory(new PropertyValueFactory<>("artis"));
        total.setCellValueFactory(new PropertyValueFactory<>("total"));
        avail.setCellValueFactory(new PropertyValueFactory<>("rented"));
    }

    @FXML
    void btnhps(ActionEvent event) {
        int selectedIndex = table.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            table.getItems().remove(selectedIndex);
            showAlert("Album Di hapus", "Album telah di hapus");
        }
    }

    @FXML
    void btnrent(ActionEvent event) {
    }

    @FXML
    void btntmbh(ActionEvent event) {
        String judul = idjudulalbum.getText();
        String rentedStr = idjumlahrented.getText();
        String totalStr = idjumlahtotal.getText();
        String artis = idnamaartis.getText();

        int rented = Integer.parseInt(rentedStr);
        int total = Integer.parseInt(totalStr);

        Album newAlbum = new Album(judul, artis, total, rented);
        table.getItems().add(newAlbum);

        idjudulalbum.clear();
        idjumlahrented.clear();
        idjumlahtotal.clear();
        idnamaartis.clear();

        showAlert("Data Added", "Album \"" + judul + "\" Berhasil di tambahkan.");
    }

    @FXML
    void btnupdt(ActionEvent event) {
        Album selectedAlbum = table.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            selectedAlbum.setJudul(idjudulalbum.getText());
            selectedAlbum.setArtis(idnamaartis.getText());
            selectedAlbum.setTotal(Integer.parseInt(idjumlahtotal.getText()));
            selectedAlbum.setRented(Integer.parseInt(idjumlahrented.getText()));

            table.refresh();
            showAlert("Data Updated", "The selected album has been updated.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
