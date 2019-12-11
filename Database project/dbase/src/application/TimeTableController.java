package application;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class TimeTableController implements Initializable {

    @FXML
    public ComboBox<String> daybox = new ComboBox<String>();

    @FXML
    public ComboBox<String> timebox = new ComboBox<String>()  ;

    @FXML
    private TextField namefield;

    @FXML
    private TextField platefield;

    @FXML
    private TextField driverfield;

    @FXML
    private TextField numberfield;

    @FXML
    private Button add;

    @FXML
    private Button delete;

    @FXML
    private Button update;

    @FXML
    private Button reset;
    @FXML
    private Button table;
    @FXML
    private ImageView image2 ;

    @FXML
    void add(ActionEvent event) {

    	String day = daybox.getValue() ; 
    	String Time = timebox.getValue(); 
    	
    	int nr = Integer.parseInt( numberfield.getText()  ) ; 
    	String Lname = namefield.getText() ; 
    	String plate = platefield.getText() ; 
    	
    	String did = driverfield.getText(); 
    	
    	
    	
    	
    	
    	try {
			int a  = DataBaseConnection.write(" Insert into mydb.timetable values('" + day + "','" + Time + "','" + nr + "' , '"+did+"','"+Lname+"' ,'"+plate+"'  )" );
			Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Success !");
	    	
	    	alert.setContentText("Another TimeTable has been added");
	    	
	    	alert.showAndWait() ; 
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("Error!");
	    	
	    	alert.setContentText("May be a dublicate or Wrong format or no such DID ");
	    	
	    	alert.showAndWait() ; 
	    	
	    	e.printStackTrace();

			
		}
    	
    }
    
    @FXML
    void show(ActionEvent event) {
    	
    	String name = namefield.getText().toString() ; 
    	try {
			ResultSet rs = DataBaseConnection.read("SELECT * FROM mydb.timetable where Lname = '" +name+"' ") ;
			
			
			if (! rs.next()) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error!");
				    	
				    	alert.setContentText("No such Lane found !");
				    	
				    	alert.showAndWait() ; 
			}
			
			else {

		    	String day = rs.getString("Day") ; 
		    	String Time = rs.getString("Clock") ; 
		    	
		    	int nr = rs.getInt("Vehicles_Passing_per_hr") ; 
		    	String Lname =  rs.getString("Lname") ; 
		    	String plate = rs.getString("Plate_Num") ; 
		    	
		    	String did = rs.getString("DriverID");
		    	
		    	
		    	
			

		    	 daybox.setValue(day );
		    	 timebox.setValue(Time);
		    	
		    numberfield.setText(""+nr); 
		    namefield.setText(Lname);
		    	platefield.setText(plate); ; 
		    	
		    	driverfield.setText(did); 
		    	
		    	
		    	
			
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
	
		
    	
			
			e.printStackTrace() ; 
    	
		}

    }

    @FXML
    void delete(ActionEvent event) { 
    	
    	String Lname = namefield.getText() ; 
	try {
		DataBaseConnection.delete("Delete from mydb.timetable where Lname =  '" + Lname + "'  ");
		Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Success !");
    	
    	alert.setContentText(  Lname  +" Has been Deleted (if exists) ");
    	
    	alert.showAndWait() ; 
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Error!");
    	
    	alert.setContentText("An unexpected error has occured !");
    	
    	alert.showAndWait() ; 
	}

    }

    @FXML
    void reset(ActionEvent event) {
    	
 daybox.getSelectionModel().clearSelection(); ; 
    	timebox.getSelectionModel().clearSelection();
    	
    	 numberfield.clear();
    	namefield.clear();
    	 platefield.clear();
    	
    	driverfield.clear(); 
    	
    	

    }

    @FXML
    void update(ActionEvent event) {
    	
    	String day = daybox.getValue() ; 
    	String Time = timebox.getValue(); 
    	
    	int nr = Integer.parseInt( numberfield.getText()  ) ; 
    	String Lname = namefield.getText() ; 
    	String plate = platefield.getText() ; 
    	
    	String did = driverfield.getText(); 
    	
    	
    	try {
			DataBaseConnection.update("update mydb.timetable set Day = '" +day+ "' ,Clock = '" +Time+ "' "
					+ " ,  Vehicles_Passing_per_hr = '" +nr +  "' ,  Plate_Num = '" +plate +"' ,   DriverID = '" +did+ "'   where Lname = '" +Lname+ "' ") ;
			
			Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Success !");
	    	
	    	alert.setContentText(  Lname +" Has been Updated (if exists)");
	    	
	    	alert.showAndWait() ; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("Error!");
	    	
	    	alert.setContentText("An unexpected error has occured !");
	    	
	    	alert.showAndWait() ; 
	    	
	    
		} 
    	

    }
    
    @FXML
    void view(ActionEvent event) {
    	
    	Main.PrimaryStage.setScene(Main.TimeTableTable);

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		daybox.getItems().addAll("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"); 
		timebox.getItems().addAll("7:00 AM","8:00 AM","9:00AM","10:00 AM","11:00 AM ","12:00 AM","01:00 PM","02:00 PM","3:00 PM","4:00 PM","5:00 PM ");
		image2.setOnMouseClicked(e-> Main.PrimaryStage.setScene(Main.catagory)  ) ; 
		
	}

}
