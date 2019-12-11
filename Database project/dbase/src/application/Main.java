package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	
	public static Stage PrimaryStage ;
	public static Scene FirstScene ;
	public static Scene VehicleScene ;
	public static Scene Fordtable ;
	public static Scene Bustable ;
	public static Scene driverscene;
	public static Scene drivertable ;
	public static Scene lanescene ;
	public static Scene lanetablescene ;
	public static Scene transScene;
	public static Scene transTableScene;
	public static Scene Report1;
public static Scene Report2;
public static Scene Report;
public static Scene MenuScene;
public static Scene catagory;
public static Scene TimeTableTable;
public static Scene TimeTable;
public static Scene LicenseScene;
public static Scene LicenseTableScene;
public static Scene LicenseReport;
public static Scene DriverReport1;
public static Scene DriverReport2;
public static Scene login;




	@Override	
	public void start(Stage primaryStage) {
		try {
			PrimaryStage = primaryStage ; 
			
			AnchorPane root2 = (AnchorPane)FXMLLoader.load(getClass().getResource("FirstScene.fxml"));
			FirstScene = new Scene(root2,800,600);
			FirstScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			AnchorPane root4 = (AnchorPane)FXMLLoader.load(getClass().getResource("VehicleScene.fxml"));
			VehicleScene = new Scene(root4,800,600);
			VehicleScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root5 = (AnchorPane)FXMLLoader.load(getClass().getResource("FordtableScene.fxml"));
			Fordtable = new Scene(root5,800,600);
			Fordtable.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root6 = (AnchorPane)FXMLLoader.load(getClass().getResource("BustableScene.fxml"));
			Bustable = new Scene(root6,800,600);
			Bustable.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root7 = (AnchorPane)FXMLLoader.load(getClass().getResource("driverscene.fxml"));
			driverscene = new Scene(root7,800,600);
			driverscene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			AnchorPane root8 = (AnchorPane)FXMLLoader.load(getClass().getResource("drivertable.fxml"));
			drivertable = new Scene(root8,800,600);
			drivertable.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root9 = (AnchorPane)FXMLLoader.load(getClass().getResource("LaneScene.fxml"));
			lanescene = new Scene(root9,800,600);
			lanescene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root10 = (AnchorPane)FXMLLoader.load(getClass().getResource("lanetablescene.fxml"));
			lanetablescene = new Scene(root10,800,600);
			lanetablescene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root11 = (AnchorPane)FXMLLoader.load(getClass().getResource("TransactionsScene.fxml"));
			transScene = new Scene(root11,800,600);
			transScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root12 = (AnchorPane)FXMLLoader.load(getClass().getResource("TransTable.fxml"));
			transTableScene = new Scene(root12,800,600);
			transTableScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root13 = (AnchorPane)FXMLLoader.load(getClass().getResource("Report1.fxml"));
			Report1 = new Scene(root13,800,600);
			Report1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root14 = (AnchorPane)FXMLLoader.load(getClass().getResource("Report2.fxml"));
			Report2 = new Scene(root14,800,600);
			Report2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root15 = (AnchorPane)FXMLLoader.load(getClass().getResource("ReportsScene.fxml"));
			Report = new Scene(root15,800,600);
			Report.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root16 = (AnchorPane)FXMLLoader.load(getClass().getResource("MenuScene.fxml"));
			MenuScene = new Scene(root16,800.0,600.0);
			MenuScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root17 = (AnchorPane)FXMLLoader.load(getClass().getResource("CatagoryScene.fxml"));
			catagory = new Scene(root17,800.0,600.0);
			catagory.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root18 = (AnchorPane)FXMLLoader.load(getClass().getResource("TableTable.fxml"));
			TimeTableTable = new Scene(root18,800.0,600.0);
			TimeTableTable.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root19 = (AnchorPane)FXMLLoader.load(getClass().getResource("TimeTableScene.fxml"));
			TimeTable = new Scene(root19,800.0,600.0);
			TimeTable.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root20 = (AnchorPane)FXMLLoader.load(getClass().getResource("LicenseScene.fxml"));
			LicenseScene = new Scene(root20,800.0,600.0);
			LicenseScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root21 = (AnchorPane)FXMLLoader.load(getClass().getResource("LicenseTableScene.fxml"));
			LicenseTableScene = new Scene(root21,800.0,600.0);
			LicenseTableScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			

			AnchorPane root22 = (AnchorPane)FXMLLoader.load(getClass().getResource("LicenseReportController.fxml"));
			LicenseReport = new Scene(root22,800.0,600.0);
			LicenseReport.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root23 = (AnchorPane)FXMLLoader.load(getClass().getResource("DriverReportScene1.fxml"));
			DriverReport1 = new Scene(root23,800.0,600.0);
			DriverReport1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root24 = (AnchorPane)FXMLLoader.load(getClass().getResource("DriverReportScene2.fxml"));
			DriverReport2 = new Scene(root24,800.0,600.0);
			DriverReport2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			AnchorPane root25 = (AnchorPane)FXMLLoader.load(getClass().getResource("loginscene.fxml"));
			login = new Scene(root25,1010.0,522.0);
			login.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//------------------------------------------------------------------------------------
			//primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setScene(FirstScene);
			
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	 

	public static void main(String[] args) throws Exception {
		
		launch(args);
		


		
     
	}
	
	
	

}
