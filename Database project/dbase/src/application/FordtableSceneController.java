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

public class FordtableSceneController implements Initializable {

	 @FXML
	    private Button Refresh;
    @FXML
    private TableView <Ford> fordtable;
    
    @FXML
    private TableColumn<Ford, String> platenum;

    @FXML
    private TableColumn<Ford, String> symbol;

    @FXML
    private TableColumn<Ford, String> capacity;

    @FXML
    private TableColumn<Ford, String> asslane;

    @FXML
    private Button homebutton;

    @FXML
    void gohome(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.VehicleScene);//change it to entities scene
    	Main.PrimaryStage.centerOnScreen();

    }
    ObservableList<Ford> list =  FXCollections.observableArrayList() ; 

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		list.clear();
		try {	
			ResultSet rs = DataBaseConnection.read("SELECT * FROM mydb.ford") ; 
			
			while (rs.next()) { 
				
				list.add(new Ford(rs.getString("Plate_Num") ,rs.getString("Symbol"), rs.getInt("Passengers_Capacity") , rs.getString("Original_Assigned_Lane"))) ; 
			}
		}
	 catch(Exception e) {
		e.printStackTrace();
	}
		
		platenum.setCellValueFactory(new PropertyValueFactory<>("platenum") );
		symbol.setCellValueFactory(new PropertyValueFactory<>("Symbol") );
		capacity.setCellValueFactory(new PropertyValueFactory<>("capacity") );
		asslane.setCellValueFactory(new PropertyValueFactory<>("asslane") );
		fordtable.setItems(list);
	}
	URL arg0;
	ResourceBundle arg1;
	 @FXML
	    void refresh(ActionEvent event) {
		 initialize(arg0, arg1);
	    }

}
