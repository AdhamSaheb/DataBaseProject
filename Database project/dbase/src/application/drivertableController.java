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

public class drivertableController implements Initializable {

    @FXML
    private TableView<Driver> table;

    @FXML
    private TableColumn<Driver, String> idcol;

    @FXML
    private TableColumn<Driver, String> namecol;

    @FXML
    private TableColumn<Driver, String> datecol;

    @FXML
    private ImageView back;
    @FXML
    private Button refresh;

    @FXML
    private Button home;

    @FXML
    void gohome(ActionEvent event) {
Main.PrimaryStage.setScene(Main.driverscene);//change to entity scene
Main.PrimaryStage.centerOnScreen();

    }
    URL arg0;
    ResourceBundle arg1;
    @FXML
    void refresh(ActionEvent event) {
initialize(arg0,arg1);
    }
    ObservableList<Driver> list =  FXCollections.observableArrayList() ; 

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		list.clear();
		try {	
			ResultSet rs = DataBaseConnection.read("SELECT * FROM mydb.driver") ; 
			
			while (rs.next()) { 
				
				list.add(new Driver(rs.getString("DID") ,rs.getString("DName"),rs.getDate("Start_Date"))); 
			}
		}
	 catch(Exception e) {
		e.printStackTrace();
	}
		idcol.setCellValueFactory(new PropertyValueFactory<>("DID") );
		namecol.setCellValueFactory(new PropertyValueFactory<>("DName") );
		datecol.setCellValueFactory(new PropertyValueFactory<>("startDate") );
		
		table.setItems(list) ; 
		
	}


}
