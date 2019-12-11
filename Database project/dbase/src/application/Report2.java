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

public class Report2 implements Initializable
{

    @FXML
    private TableView<TimeTableClass> table;

    @FXML
    private TableColumn<TimeTableClass, String> day;

    @FXML
    private TableColumn<TimeTableClass, String>clock;

    @FXML
    private TableColumn<TimeTableClass, String> DID;

    @FXML
    private TableColumn<TimeTableClass, String> Plate_Num;

    @FXML
    private TableColumn<TimeTableClass, String> LName;

    @FXML
    private TableColumn<TimeTableClass, String> passing;

    @FXML
    private Button back;

    @FXML
    private Button refresh;

    @FXML
    void Back(ActionEvent event) {
Main.PrimaryStage.setScene(Main.Report);   
Main.PrimaryStage.centerOnScreen();

    }

    ObservableList<TimeTableClass> list =  FXCollections.observableArrayList() ; 
URL arg1;
ResourceBundle arg2;
    @FXML
    void refresh(ActionEvent event) {
    	initialize(arg1,arg2);		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		list.clear();
    	String s="SELECT * \r\n" + 
    			"FROM mydb.timetable WHERE (`Vehicles_Passing_per_hr`) IN \r\n" + 
    			"( SELECT  min(`Vehicles_Passing_per_hr`)\r\n" + 
    			"  FROM mydb.timetable\r\n" + 
    			")";
		try {	
			
			ResultSet rs = DataBaseConnection.read(s);
			while (rs.next()) { 
				
				list.add(new TimeTableClass(rs.getString("Day") ,rs.getString("DriverID"),rs.getString("LName"),rs.getString("PlateNum"),rs.getInt("Vehicles_Passing_per_hr"),rs.getString("Clock"))); 
			}
		}
	 catch(Exception e) {
		e.printStackTrace();
	}
		LName.setCellValueFactory(new PropertyValueFactory<>("Lname") );
		DID.setCellValueFactory(new PropertyValueFactory<>("Dname") );
		passing.setCellValueFactory(new PropertyValueFactory<>("ratio") );
		clock.setCellValueFactory(new PropertyValueFactory<>("Time") );
		Plate_Num.setCellValueFactory(new PropertyValueFactory<>("Pnum") );
		day.setCellValueFactory(new PropertyValueFactory<>("day") );
		table.setItems(list) ; 		
	}
    }




