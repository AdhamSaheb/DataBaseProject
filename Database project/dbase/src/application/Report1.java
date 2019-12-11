package application;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Report1 implements Initializable {

    @FXML
    private TableView<Lane> table;

    @FXML
    private TableColumn<Lane,String > name;

    @FXML
    private TableColumn<Lane,String > start;

    @FXML
    private TableColumn<Lane,String > finish;

    @FXML
    private TableColumn<Lane,String > price;

    @FXML
    private TableColumn<Lane,String > duration;

    @FXML
    private Button backButton;

    @FXML
    private Button refresh;

    @FXML
    void Back(ActionEvent event) {
Main.PrimaryStage.setScene(Main.Report);            // SET IT BACK TO REPORTS SCENE
Main.PrimaryStage.centerOnScreen();
    }
URL arg0;
ResourceBundle arg1;
    @FXML
    void refresh(ActionEvent event) {
    	initialize(arg0,arg1);
    }
    
    ObservableList<Lane> list =  FXCollections.observableArrayList() ; 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		list.clear();
		try {	
			ResultSet rs = DataBaseConnection.read("SELECT * FROM mydb.lane L WHERE L.LName LIKE '%BZU%'") ; 
			
			while (rs.next()) { 
				
				list.add(new Lane(rs.getString("LName") ,rs.getString("Starting_Point"),rs.getString("Final_Destination"),rs.getFloat("Price"),rs.getFloat("Av_trip_duration"))); 
			}
		}
	 catch(Exception e) {
		e.printStackTrace();
	}
		name.setCellValueFactory(new PropertyValueFactory<>("name") );
		start.setCellValueFactory(new PropertyValueFactory<>("start") );
		finish.setCellValueFactory(new PropertyValueFactory<>("des") );
		price.setCellValueFactory(new PropertyValueFactory<>("price") );
		duration.setCellValueFactory(new PropertyValueFactory<>("duration") );


		table.setItems(list) ; 
		
	}
		
	}


