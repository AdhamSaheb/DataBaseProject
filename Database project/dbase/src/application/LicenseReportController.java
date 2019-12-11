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

public class LicenseReportController implements Initializable {

    @FXML
    private TableView<License> table;

    @FXML
    private TableColumn<License, String> col_name;

    @FXML
    private TableColumn<License, String> col_issue;

    @FXML
    private TableColumn<License, String> col_expiry;
    @FXML
    private TableColumn<License, String> didcol;

    @FXML
    private ImageView image;
    
    @FXML
    private Button refresh;
    
    URL arg0 ; 
    ResourceBundle arg1 ; 
    
    ObservableList<License> list =  FXCollections.observableArrayList() ; 

  
    @FXML
    void refresh(ActionEvent event) {
    initialize(arg0 , arg1 );
		
	
			
			
			
		
		
		
		
		
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list.clear();

		// TODO Auto-generated method stub
		
	
			
		try {	
			ResultSet rs = DataBaseConnection.read("SELECT  * FROM mydb.license where Expiry_Date like '2019-%-%' ") ; 
			
			while (rs.next()) { 
				
				list.add(new License(rs.getString("LID") , rs.getDate("Date_Of_Issue") , rs.getDate("Expiry_Date") , rs.getString("DID")  )  ); 
			}
		}
	 catch(Exception e) {
		e.printStackTrace();
	}
			
			
			
		
		
		
		col_name.setCellValueFactory(new PropertyValueFactory<>("ID") );
		col_issue.setCellValueFactory(new PropertyValueFactory<>("dateOfIssue") );
		col_expiry.setCellValueFactory(new PropertyValueFactory<>("dateOfExpiry") );
		didcol.setCellValueFactory(new PropertyValueFactory<>("DID") );
		
		table.setItems(list) ; 
		
		image.setOnMouseClicked(e->{Main.PrimaryStage.setScene(Main.Report); });
		
		
		
	}
    
    
    
    
    

}
