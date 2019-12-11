package application;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class loginController implements Initializable {

    @FXML
    private JFXTextField joinid;

    @FXML
    private JFXTextField joinpassword;

    @FXML
    private JFXTextField loginid;

    @FXML
    private JFXPasswordField loginpassword;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton join;

    @FXML
    private JFXComboBox<String> type;

    @FXML
    void join(ActionEvent event) {
    	
    	String id = joinid.getText() ; 
        String pass = joinpassword.getText() ; 
        String actype = type.getValue().toString() ; 
        
        
    	try {
			int a  = DataBaseConnection.write(" Insert into mydb.users values('" + id + "','" + pass+ "','" + actype + "'   )" );
			Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Success !");
	    	
	    	alert.setContentText("You have been Signed up ! , Please Login ");
	    	
	    	alert.showAndWait() ; 
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("Error!");
	    	
	    	alert.setContentText("Try Another ID please");
	    	
	    	alert.showAndWait() ; 

			
		}

    }

    @FXML
    void login(ActionEvent event) {
    	
    String id = loginid.getText() ; 
    String pass = loginpassword.getText() ; 
    
    try {
		ResultSet rs = DataBaseConnection.read("SELECT * FROM mydb.users where LID = '" +id+"' ") ;
		
		
		if (! rs.next()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error!");
			    	
			    	alert.setContentText("No such ID found !");
			    	
			    	alert.showAndWait() ; 
		}
		
		else {
			
			if (pass.equals(rs.getString("Password")) )  {
				
				if (rs.getString("Type").equals("Admin")) Main.PrimaryStage.setScene(Main.MenuScene);
				else 
					Main.PrimaryStage.setScene(Main.transScene);
				
				
				
				
				
				
				
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				       alert.setTitle("Error!");
				      
				    	
				    	alert.setContentText("Wrong Password , Please Try Again!");
				    	
				    	alert.showAndWait() ; 
				
			}
				
    
			
			
			
			
		}

    
	} catch (SQLException e) {
		// TODO Auto-generated catch block

	
	
		
		e.printStackTrace() ; 
	

}
    }
  
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		type.getItems().addAll("Admin","Student") ; 
	}

}
