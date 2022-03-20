import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main  extends Application {
    @Override
    public void start(Stage primaryStage){
       
        Rooms rooms=new Rooms();
        HBox hBox = new HBox();
        hBox.setStyle("-fx-padding: 15, 13, 16, 15 ");
        hBox.setSpacing(6);
        
      // Menu menu= new Menu();
        
        Menu file = new Menu("file");
         Menu edit = new Menu("edit");
         Menu formart = new Menu("format");
          Menu view = new Menu("view");
           Menu help = new Menu("help");
           MenuBar menuBar=new MenuBar();
        
        menuBar.getMenus().addAll(file, edit, formart, view, help);
        hBox.setAlignment(Pos.CENTER);
        
        Button allRooms=new Button("AllRooms ON/OFF");
        allRooms.setOnAction(new LightsOn(rooms));
        Button twoRoom=new Button("Room1&2 ON/OFF");
        Button room1=new Button("Room1 ON/OFF");
        room1.setOnAction(new Room1(rooms));
        Button room2=new Button("Room2 ON/OFF");
        room2.setOnAction(new Room2(rooms));
        Button room3=new Button("Room3 ON/OFF");
        room3.setOnAction(new Room3(rooms));
        Button room4=new Button("Room4 ON/OFF");
        room4.setOnAction(new Room4(rooms));
        Button room5=new Button("Room5 ON/OFF");
        room5.setOnAction(new Room5(rooms));
        Button room6=new Button("Room6 ON/OFF");
        room6.setOnAction(new Room6(rooms));
        Button room7=new Button("Room7 ON/OFF");
        room7.setOnAction(new Room7(rooms));
        HBox buttons1=new HBox();
        buttons1.setPadding(new Insets(50,5,5,30));
        buttons1.setSpacing(30);
        buttons1.setAlignment(Pos.CENTER);
        HBox buttons2=new HBox();
        buttons2.setPadding(new Insets(10,5,5,30));
        buttons2.setSpacing(30);
        buttons2.setAlignment(Pos.CENTER);
        HBox buttons3=new HBox();
        buttons3.setPadding(new Insets(10,5,5,30));
        buttons3.setSpacing(30);
        buttons3.setAlignment(Pos.CENTER);

        buttons1.getChildren().addAll(allRooms,room2,room5);
        buttons2.getChildren().addAll(twoRoom,room3,room6);
        buttons3.getChildren().addAll(room1,room4,room7);
        VBox flow=new VBox(5);
        BorderPane borderPane=new BorderPane();
        borderPane.setTop(menuBar);
        flow.setPadding(new Insets(10,5,5,30));
        flow.setAlignment(Pos.CENTER);
        flow.getChildren().addAll(hBox,rooms,buttons1,buttons2,buttons3);
        

        primaryStage.setTitle("myhouse");
        borderPane.setCenter(flow);
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setResizable(false);
        primaryStage.show();
        }
    }

