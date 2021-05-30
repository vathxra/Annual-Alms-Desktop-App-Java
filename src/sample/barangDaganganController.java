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

public class barangDaganganController {

    @FXML
    private Button hitungZakatButton;
    @FXML
    private TextField nilaiBarangField;
    @FXML
    private TextField uangDagangField;
    @FXML
    private TextField piutangField;
    @FXML
    private TextField utangJatuhTempoField;
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

    private barangDagangan bd1 = new barangDagangan(0,0,0,0);

    @FXML
    public void hitungZakatButtonOnAction(ActionEvent event)
    {
        double nilaiBarang = Double.parseDouble(nilaiBarangField.getText());
        double piutang = Double.parseDouble(piutangField.getText());
        double uangDagang = Double.parseDouble(uangDagangField.getText());
        double utangJatuhTempo = Double.parseDouble(utangJatuhTempoField.getText());

        if (nilaiBarangField.getText().isEmpty() || piutangField.getText().isEmpty()||uangDagangField.getText().isEmpty()|| utangJatuhTempoField.getText().isEmpty()||
                nilaiBarang<5355000 || piutang<5355000 || uangDagang<5355000 || utangJatuhTempo<5355000) {
            resultZakatField.setText("all field must be entered and above Rp.5355000");
        } else {
            bd1.setNilaiBarang(nilaiBarang);
            bd1.setPiutang(piutang);
            bd1.setUangDagang(uangDagang);
            bd1.setUtangJatuhTempo(utangJatuhTempo);
            resultZakatField.setText("Total Zakat Yang Harus Dibayarkan : Rp. " + bd1.hitungZakat());
        }
    }
}