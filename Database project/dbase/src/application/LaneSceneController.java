package application;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LaneSceneController implements Initializable {

	private static int clicks;
	@FXML
    private TextField name;

    @FXML
    private Button insert;

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
    private TextField startingpoint;

    @FXML
    private TextField finaldestination;

    @FXML
    private TextField price;

    @FXML
    private TextField duration;
    
    @FXML
    void delete(ActionEvent event) {
    	String id  = name.getText() ; 
    	try {
			DataBaseConnection.delete("Delete from mydb.lane where LName =  '" + id + "'  ");
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
    void insert(ActionEvent event) {
    	String id  = name.getText() ; 
    	String start = startingpoint.getText() ; 
    	String finish = finaldestination.getText() ; 
    	String price1=price.getText();
    	String duration1=duration.getText();
    	
    	try {
			DataBaseConnection.write(" Insert into mydb.lane values('" + id + "','" +duration1+ "','" + price1 +"','"+finish+ "','" +start+  "')" );
			Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Success !");
	    	alert.setContentText("Another Lane has been added");
	    	alert.showAndWait() ; 
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("Error!");
	    	alert.setContentText("May be a dublicate or Wrong format !");
	    	alert.showAndWait() ; 
		}
    }

    @FXML
    void reset(ActionEvent event) {
name.clear();
startingpoint.clear();
finaldestination.clear();
price.clear();
duration.clear();
clicks=0;
    }

    String idf;
    @FXML
    void update(ActionEvent event) throws SQLException {
    	clicks++;
    	if(clicks==1)
    	{
        	String id  = name.getText() ; 
        	idf=id;
ResultSet r=DataBaseConnection.read("Select * from mydb.lane WHERE LName='"+id+"'");
if(!r.next())
{
	
}
else
{
	startingpoint.setText(r.getString("Starting_Point"));
	finaldestination.setText(r.getString("Final_Destination"));
	price.setText(Float.toString(r.getFloat("Price")));
	duration.setText(Float.toString(r.getFloat("Av_Trip_Duration")));
}
    	}
    	
    	else if(clicks==2)
    	{
    	
    	String id  = name.getText() ; 
    	
    	if(!idf.equals(id))
    	{
    		Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("Error!");
	    	
	    	alert.setContentText("You cannot change the key!");
	    	
	    	alert.showAndWait() ; 
	    	clicks--;
    	}
    	else {
    	String start = startingpoint.getText() ; 
    	String finish = finaldestination.getText() ; 
    	String price1=price.getText();
    	String duration1=duration.getText();
    	
    	try {
			DataBaseConnection.update("update mydb.lane set LName= '" +name+ "' ,Starting_Point = '" +start+"' ,Av_trip_duration = '"+duration1+"' ,Final_Destination = '"+finish+"' ,Price = '" +price1+ "' "+ "   where LName= '"+name+"'  ");
				
			
			Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Success !");
	    	
	    	alert.setContentText(id +" Has been Updated (if exists)");
	    	
	    	alert.showAndWait() ; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("Error!");
	    	
	    	alert.setContentText("An unexpected error has occured !");
	    	
	    	alert.showAndWait() ; 
		} 
    	clicks=0;
    	}}
    }
    
    @FXML
    void view(ActionEvent event) {
Main.PrimaryStage.setScene(Main.lanetablescene);
Main.PrimaryStage.centerOnScreen();

    }
    @FXML
    void back(ActionEvent event) {
Main.PrimaryStage.setScene(Main.catagory);
Main.PrimaryStage.centerOnScreen();

    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
clicks=0;		
	}
}



