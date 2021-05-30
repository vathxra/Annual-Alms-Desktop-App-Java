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

public class mataUangController {

    @FXML
    private Button hitungZakatButton;
    @FXML
    private TextField simpananField;
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

    private mataUang duit = new mataUang(0);

    @FXML
    public void hitungZakatButtonOnAction(ActionEvent event)
    {
        double simpanan = Double.parseDouble(simpananField.getText());
        if (simpananField.getText().isEmpty() || simpanan<5355000) {
            resultZakatField.setText("tabungan must be entered and above Rp.5355000");
        } else {
            duit.setSimpanan(Double.parseDouble(simpananField.getText()));
            resultZakatField.setText("Total Zakat Yang Harus Dibayarkan : Rp. " + duit.hitungZakat());
        }
    }
}