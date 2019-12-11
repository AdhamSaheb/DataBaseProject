package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;

public class TransScene implements Initializable{

	public static String daySelected;
	public static String timeSelected;
	public static String laneSelected;
    @FXML
    private ComboBox<String> day;

    @FXML
    private ComboBox<String> clock;

    @FXML
    private Button view;
    
    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;
    @FXML
    private Button back;

    @FXML
    private ComboBox<String> lane;

    @FXML
    private ImageView lanepic;

    @FXML
    void view(ActionEvent event) {
  daySelected=day.getValue();
  timeSelected=clock.getValue();
  laneSelected=lane.getValue();
Main.PrimaryStage.setScene(Main.transTableScene);
Main.PrimaryStage.centerOnScreen();

    }
    @FXML
    void c(ActionEvent event) {
img2.setVisible(false);
    }

    @FXML
    void d(ActionEvent event) {
img1.setVisible(false);
    }
    
    @FXML
    void lane(ActionEvent event) {
lanepic.setVisible(false);
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> days = 
			    FXCollections.observableArrayList(
			        "Saturday",
			        "Monday",
			        "Tuesday",
			        "Wednesday",
			        "Thursday"
			    );
		ObservableList<String> hrs = 
			    FXCollections.observableArrayList(
			        "8:00",
			        "9:00",
			        "10:00",
			        "11:00",
			        "12:00",
			        "13:00",
			        "14:00",
			        "15:00"
			    );
		ObservableList<String> lanes = 
			    FXCollections.observableArrayList(
			        "Birzeit-BZU",
			        "Ramallah-Irsal-AbuQash-BZU-Birzeit",
			        "Surda-BZU"
			    );
		day.getItems().addAll(days);
		clock.getItems().addAll(hrs);
		lane.getItems().addAll(lanes);
	}
	@FXML
	void back (ActionEvent event) {
Main.PrimaryStage.setScene(Main.MenuScene);
Main.PrimaryStage.centerOnScreen();}

}
