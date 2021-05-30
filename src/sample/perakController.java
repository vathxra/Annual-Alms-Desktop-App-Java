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

public class perakController {

    @FXML
    private Button hitungZakatButton;
    @FXML
    private TextField beratField;
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

    private Perak perak1 = new Perak(0);

    @FXML
    public void hitungZakatButtonOnAction(ActionEvent event)
    {
        double berat = Double.parseDouble(beratField.getText());
        if (beratField.getText().isEmpty() || berat<595) {
            resultZakatField.setText("Berat must be entered and above 595");
        } else {
            perak1.setBerat(Double.parseDouble(beratField.getText()));
            resultZakatField.setText("Total Zakat Yang Harus Dibayarkan : Rp. " + perak1.hitungZakat());
        }
    }
}