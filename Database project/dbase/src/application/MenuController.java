package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private Button tables;

    @FXML
    private Button transactions;

    @FXML
    private Button reports;
    
    @FXML
    private ImageView image;
    
    @FXML
    void reports(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.Report);
    	Main.PrimaryStage.centerOnScreen(); 

    }

    @FXML
    void tables(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.catagory);
    	Main.PrimaryStage.centerOnScreen(); 
    	
    }

    @FXML
    void transactions(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.transScene);
    	Main.PrimaryStage.centerOnScreen(); 

    }



    @FXML
    void exit(MouseEvent event) {

    	Main.PrimaryStage.setScene(Main.FirstScene);
    	Main.PrimaryStage.centerOnScreen(); 
    }


}
