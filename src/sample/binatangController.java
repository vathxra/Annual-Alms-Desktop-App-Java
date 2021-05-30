package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class binatangController {
    @FXML
    private TextField jumlahField;
    @FXML
    private RadioButton kambingRB;
    @FXML
    private RadioButton sapiRB;
    @FXML
    private Button hitungZakatButton;
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

    private Kambing Kambing1 = new Kambing(0);
    private Sapi Sapi1 = new Sapi(0);

    @FXML
    public void hitungZakatButtonOnAction(ActionEvent event){
        if(jumlahField.getText().isEmpty()){
            resultZakatField.setText("Jumlah harus diinput dan pilih jenis ternak");
        }
        else if(kambingRB.isSelected()){
            Kambing1.setJumlah(Integer.parseInt(jumlahField.getText()));
            resultZakatField.setText("Total Kambing Yang Harus Dizakatkan : " + Kambing1.hitungZakat());
        }
        else if(sapiRB.isSelected()) {
            Sapi1.setJumlah(Integer.parseInt(jumlahField.getText()));
            resultZakatField.setText("Total Sapi Yang Harus Dizakatkan : " + Sapi1.hitungZakat());
        }
    }
}
