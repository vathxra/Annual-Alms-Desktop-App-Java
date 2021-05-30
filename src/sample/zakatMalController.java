package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class zakatMalController {
    @FXML
    private Button emasButton;
    @FXML
    private Button perakButton;
    @FXML
    private Button binatangButton;
    @FXML
    private Button bdagangButton;
    @FXML
    private Button hPertanianButton;
    @FXML
    private Button mataUangButton;
    @FXML
    public void emasButtonONAction(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("emas.fxml"));
        Scene emasScene = new Scene(root);
        Stage emasStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        emasStage.hide();
        emasStage.setScene(emasScene);
        emasStage.show();
    }

    @FXML
    public void perakButtonONAction(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("perak.fxml"));
        Scene perakScene = new Scene(root);
        Stage perakStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        perakStage.hide();
        perakStage.setScene(perakScene);
        perakStage.show();
    }

    @FXML
    public void binatangButtonONAction(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("binatang.fxml"));
        Scene binatangScene = new Scene(root);
        Stage binatangStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        binatangStage.hide();
        binatangStage.setScene(binatangScene);
        binatangStage.show();
    }

    @FXML
    public void mataUangButtonONAction(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mataUang.fxml"));
        Scene mataUangScene = new Scene(root);
        Stage mataUangStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        mataUangStage.hide();
        mataUangStage.setScene(mataUangScene);
        mataUangStage.show();
    }

    @FXML
    public void barangDaganganButtonONAction(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("barangDagangan.fxml"));
        Scene brgDagangScene = new Scene(root);
        Stage brgDagangStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        brgDagangStage.hide();
        brgDagangStage.setScene(brgDagangScene);
        brgDagangStage.show();
    }

    @FXML
    public void pertanianButtonONAction(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hasilPertanian.fxml"));
        Scene pertanianScene = new Scene(root);
        Stage pertanianStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        pertanianStage.hide();
        pertanianStage.setScene(pertanianScene);
        pertanianStage.show();
    }
}