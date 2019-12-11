package application;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LicenseSceneController {

    @FXML
    private TextField idfield;
    
    @FXML
    private TextField didfield ;


    @FXML
    private DatePicker issuefield;

    @FXML
    private DatePicker expiryfield;
    @FXML
    private Button add;

    @FXML
    private Button delete;

    @FXML
    private Button update;

    @FXML
    private Button reset;

    @FXML
    private Button back;

    @FXML
    private Button view;

    @FXML
    private Label label1;

  
    @FXML
    void back(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.catagory);
    	Main.PrimaryStage.centerOnScreen(); 

    }

    @FXML
    void reset(ActionEvent event) {
    	idfield.clear();
    	issuefield.getEditor().clear();
    	expiryfield.getEditor().clear(); 
    	didfield.clear();
    	

    }
    
    @FXML
    void info(ActionEvent event) {
    	String id  = idfield.getText().toString() ; 
    	try {
			ResultSet rs = DataBaseConnection.read("SELECT * FROM mydb.license where LID = '" +id+"' ") ;
			
			
			if (! rs.next()) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error!");
				    	
				    	alert.setContentText("No such id found !");
				    	
				    	alert.showAndWait() ; 
			}
			
			else {
			String id1 = rs.getString("LID") ; 
		LocalDate date1 = rs.getDate("Date_Of_Issue").toLocalDate();
	  LocalDate date2 = rs.getDate("Expiry_Date").toLocalDate();
			
			String did= rs.getString("DID") ; 
			
			issuefield.setValue(date1);

			expiryfield.setValue(date2);
			didfield.setText(did); 
			
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
	
		
    	
			
			e.printStackTrace() ; 
    	

    }}

    @FXML
    void view(ActionEvent event) {
    	Main.PrimaryStage.setScene(Main.LicenseTableScene);

    }
    
    @FXML
    void add(ActionEvent event) {
    	String id  = idfield.getText() ; 
    	LocalDate issuedate = issuefield.getValue();; 
    	LocalDate expirydate = expiryfield.getValue(); ; 
    	String did1 = didfield.getText(); 
    	
    	try {
    		System.out.println( "Insert into mydb.license values('" + id + "','" + issuedate+ "','" + expirydate + "' , '"+did1+"'  )");
			int a  = DataBaseConnection.write(" Insert into mydb.license values('" + id + "','" + issuedate+ "','" + expirydate + "' , '"+didfield.getText()+"'  )" );
			Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Success !");
	    	
	    	alert.setContentText("Another License has been added");
	    	
	    	alert.showAndWait() ; 
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			/*Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("Error!");
	    	
	    	alert.setContentText("May be a dublicate or Wrong format or no such DID ");
	    	
	    	alert.showAndWait() ; */
			e.printStackTrace();

			
		}
    	
    	
    	
    	
    }

    @FXML
    void delete(ActionEvent event) {
    	
    	String id = idfield.getText() ; 
    	try {
			DataBaseConnection.delete("Delete from mydb.license where LID =  '" + id + "'  ");
			Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Success !");
	    	
	    	alert.setContentText(  id +" Has been Deleted (if exists) ");
	    	
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
    void update(ActionEvent event) {
    	
    	LocalDate issuedate = issuefield.getValue();
    	LocalDate expirydate = expiryfield.getValue();
    	String id = idfield.getText() ;
  
    	
    	try {
			DataBaseConnection.update("update mydb.license set Date_Of_Issue = '" +issuedate+ "' ,Expiry_Date = '" +expirydate+ "' "
					+ " ,  DID = '" +didfield.getText()+ "'   where LID= '"+id+"'  ") ;
			
			Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Success !");
	    	
	    	alert.setContentText(  id +" Has been Updated (if exists)");
	    	
	    	alert.showAndWait() ; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("Error!");
	    	
	    	alert.setContentText("An unexpected error has occured !");
	    	
	    	alert.showAndWait() ; 
	    	
	    	e.printStackTrace();
		} 
    	
    	
    	
    	
    }
    	
    }

