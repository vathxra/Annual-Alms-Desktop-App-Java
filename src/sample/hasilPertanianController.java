package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class hasilPertanianController {

    @FXML
    private TextField beratField;
    @FXML
    private Button hitungZakatAlamiButton;
    @FXML
    private Button hitungZakatAlatButton;
    @FXML
    private TextArea resultZakatField;
    @FXML
    private Button kembaliButton;

    @FXML
    public void kembaliButtonOnAction(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("zakatMal.fxml"));
        Scene homeScene = new Scene(root);
        Stage homeStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        homeStage.hide();
        homeStage.setScene(homeScene);
        homeStage.show();
    }

    hasilPertanian hp1 = new hasilPertanian(0);

    @FXML
    public void hitungZakatAlamiOnAction(ActionEvent event)
    {
        double berat = Double.parseDouble(beratField.getText());
        if (beratField.getText().isEmpty() || berat<=900) {
            resultZakatField.setText("Berat must be entered and above 900");
        } else {
            hp1.setBerat(Double.parseDouble(beratField.getText()));
            resultZakatField.setText("Total Zakat Yang Harus Dibayarkan : " + hp1.hitungZakat2() + " kg");
        }
    }

    @FXML
    public void hitungZakatAlatOnAction(ActionEvent event)
    {
        double berat = Double.parseDouble(beratField.getText());
        if (beratField.getText().isEmpty() || berat<=900) {
            resultZakatField.setText("Berat must be entered and above 900");
        } else {
            hp1.setBerat(Double.parseDouble(beratField.getText()));
            resultZakatField.setText("Total Zakat Yang Harus Dibayarkan : " + hp1.hitungZakat() + " kg");
        }
    }
}
