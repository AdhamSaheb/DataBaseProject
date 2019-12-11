package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ReportSceneController {

    @FXML
    private Button report0;

    @FXML
    private Button report3;

    @FXML
    private Button report4;

    @FXML
    private Button report1;

    @FXML
    private Button report2;

    @FXML
    private Button back;

    @FXML
    void back(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.MenuScene);
    	Main.PrimaryStage.centerOnScreen();

    }
    
    @FXML
    void rep0(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.LicenseReport);
    	Main.PrimaryStage.centerOnScreen();
    }

    @FXML
    void rep1(ActionEvent event) {
Main.PrimaryStage.setScene(Main.Report1);
Main.PrimaryStage.centerOnScreen();
    }

    @FXML
    void rep2(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.Report2);
    	Main.PrimaryStage.centerOnScreen();
    }

    @FXML
    void rep3(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.DriverReport1);
    	Main.PrimaryStage.centerOnScreen();
    }

    @FXML
    void rep4(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.DriverReport2);
    	Main.PrimaryStage.centerOnScreen();
    }

}
