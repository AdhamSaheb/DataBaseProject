package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class catagory implements Initializable {

    @FXML
    private Button licensebutton;

    @FXML
    private Button timetablebutton;

    @FXML
    private Button lanesbutton;

    @FXML
    private Button busesbutton;

    @FXML
    private Button driversbutton;

    @FXML
    private Button fordsbutton;

    @FXML
    private ImageView backimage;
    
    @FXML
    private Circle c1;

    @FXML
    private Circle c2;

    @FXML
    private Circle c3;


    

    @FXML
    void driverspressed(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.driverscene);
    	Main.PrimaryStage.centerOnScreen(); 

    }

    @FXML
    void fordspressed(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.VehicleScene);
    	Main.PrimaryStage.centerOnScreen(); 

    }

    @FXML
    void lanespressed(ActionEvent event) {
    	
    	Main.PrimaryStage.setScene(Main.lanescene);
    	Main.PrimaryStage.centerOnScreen(); 
    }

    @FXML
    void licensespressed(ActionEvent event) {
Main.PrimaryStage.setScene(Main.LicenseScene);
Main.PrimaryStage.centerOnScreen(); 
    }

    @FXML
    void timepressed(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.TimeTable);
    	Main.PrimaryStage.centerOnScreen(); 
    }

    
    void setRotation (Circle c , int angel , int duration) {
    	RotateTransition rotate = new RotateTransition(Duration.seconds(duration) , c) ; 
    	rotate.setAutoReverse(true);
    	rotate.setByAngle(angel); 
    	rotate.setCycleCount(Animation.INDEFINITE);
    	rotate.setRate(3);
    	rotate.play();
    	
    	
    } 
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		backimage.setOnMouseClicked(e-> {Main.PrimaryStage.setScene(Main.MenuScene) ; 
		Main.PrimaryStage.centerOnScreen(); 
		}
		
		
				);
		
		setRotation(c1 , 360 , 10) ;
		setRotation(c2 , 180 , 18) ;
		setRotation(c3 , 145 , 24) ;
		
	}

}
