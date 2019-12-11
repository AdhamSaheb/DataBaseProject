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
import javafx.scene.image.ImageView;



public class TableTable implements Initializable {

    @FXML
    private TableView<TimeTableClass> TimeTabel ;

    @FXML
    private TableColumn<TimeTableClass, String> lanecol;

    @FXML
    private TableColumn<TimeTableClass, String> daycol;

    @FXML
    private TableColumn<TimeTableClass, String> timecol;

    @FXML
    private TableColumn<TimeTableClass, String> drivercol;

    @FXML
    private TableColumn<TimeTableClass, String> platecol;

    @FXML
    private TableColumn<TimeTableClass, Integer> ratiocol;

    @FXML
    private Button refresh;

    @FXML
    private ImageView image = new ImageView( );
    URL arg0 ; 
    ResourceBundle arg1 ; 
    
    ObservableList<TimeTableClass> list =  FXCollections.observableArrayList() ; 

    @FXML
    void refill(ActionEvent event) {
    	
    	initialize(arg0 , arg1 );

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		image.setOnMouseClicked(e-> Main.PrimaryStage.setScene(Main.TimeTable) ) ; 
		
		list.clear();

		// TODO Auto-generated method stub
		
	
			
		try {	
			ResultSet rs = DataBaseConnection.read("SELECT * FROM mydb.timetable  ") ; 
			
			while (rs.next()) { 
				
				list.add(new TimeTableClass(rs.getString("Day") ,rs.getString("DriverID"), rs.getString("Lname"),rs.getString("PlateNum"),rs.getInt("Vehicles_Passing_per_hr") ,rs.getString("Clock") )  ); 
			}
		}
	 catch(Exception e) {
		e.printStackTrace();
	}
			
			
			
		
		
		
		lanecol.setCellValueFactory(new PropertyValueFactory<>("Lname") );
		daycol.setCellValueFactory(new PropertyValueFactory<>("day") );
		timecol.setCellValueFactory(new PropertyValueFactory<>("time") );
		drivercol.setCellValueFactory(new PropertyValueFactory<>("Dname") );
		platecol.setCellValueFactory(new PropertyValueFactory<>("Pnum") );
		ratiocol.setCellValueFactory(new PropertyValueFactory<>("ratio") );
		
		TimeTabel.setItems(list) ; 
		
		
		
		
		
	}


	

}
