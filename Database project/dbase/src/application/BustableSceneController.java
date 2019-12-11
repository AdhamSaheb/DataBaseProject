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

public class BustableSceneController implements Initializable {

    @FXML
    private TableView<Bus> bustable;

    @FXML
    private TableColumn<Bus, String> platenum;

    @FXML
    private TableColumn<Bus, String> symbol;

    @FXML
    private TableColumn<Bus, String> capacity;

    @FXML
    private TableColumn<Bus, String> dicount;

    @FXML
    private TableColumn<Bus, String> ownerco;

    @FXML
    private Button homebutton;

    @FXML
    private Button Refresh;

    @FXML
    void gohome(ActionEvent event) {
Main.PrimaryStage.setScene(Main.VehicleScene); //change it to entities scene
    }
URL args0;
ResourceBundle args1;

    ObservableList<Bus> list =  FXCollections.observableArrayList() ; 
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list.clear();
		try {	
			ResultSet rs = DataBaseConnection.read("SELECT * FROM mydb.bus") ; 
			
			while (rs.next()) { 
				
				list.add(new Bus(rs.getString("Plate_Num") ,rs.getString("Owner_Company"),rs.getFloat("Dicounted_Price"),rs.getString("Symbol"), rs.getInt("Passengers_Capacity"))) ; 
			}
		}
	 catch(Exception e) {
		e.printStackTrace();
	}
		
		platenum.setCellValueFactory(new PropertyValueFactory<>("platenum") );
		symbol.setCellValueFactory(new PropertyValueFactory<>("Symbol") );
		capacity.setCellValueFactory(new PropertyValueFactory<>("capacity") );
		dicount.setCellValueFactory(new PropertyValueFactory<>("discount") );
		ownerco.setCellValueFactory(new PropertyValueFactory<>("ownerco") );
		
		bustable.setItems(list);
	
	}
	
	 @FXML
	    void refresh(ActionEvent event) {
	initialize(args0,args1);
	    }

}
