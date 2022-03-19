import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main  extends Application {
    @Override
    public void start(Stage primaryStage){
        Rooms room=new Rooms();


        HBox hBox = new HBox();
      
        hBox.setAlignment(Pos.CENTER);

        Button allRooms=new Button("AllRooms ON/OFF");
        allRooms.setOnAction(new LightsOn(room));
        Button twoRoom=new Button("Room1&2 ON/OFF");
        twoRoom.setOnAction(new TwoRooms(room) {
            @Override
            public void handle(ActionEvent event) {
            
            }
        });
        Button room1=new Button("Room1 ON/OFF");
        room1.setOnAction(new Room1(room));
        Button room2=new Button("Room2 ON/OFF");
        room2.setOnAction(new Room2(room));
        Button room3=new Button("Room3 ON/OFF");
        room3.setOnAction(new Room3(room));
        Button room4=new Button("Room4 ON/OFF");
        room4.setOnAction(new Room4(room));
        Button room5=new Button("Room5 ON/OFF");
        room5.setOnAction(new Room5(room));
        Button room6=new Button("Room6 ON/OFF");
        room6.setOnAction(new Room6(room));
        Button room7=new Button("Room7 ON/OFF");
        room7.setOnAction(new Room7(room));

        HBox btns=new HBox();
        

       // btns.setPadding(new Insets(154,5,5,30));
        btns.setSpacing(300);
       // btns.setAlignment(Pos.CENTER);
        HBox buttons1=new HBox();
        buttons1.setPadding(new Insets(10,5,5,30));
        buttons1.setSpacing(20);
        buttons1.setAlignment(Pos.CENTER);
        HBox buttons2=new HBox();
        buttons2.setPadding(new Insets(10,5,5,30));
        buttons2.setSpacing(20);
        buttons2.setAlignment(Pos.CENTER);

        btns.getChildren().addAll(allRooms,room2,room5);
        buttons1.getChildren().addAll(twoRoom,room3,room6);
        buttons2.getChildren().addAll(room1,room4,room7);
        VBox flow=new VBox(5);
        flow.setPadding(new Insets(8,7,9,7));
        flow.setAlignment(Pos.CENTER);
        flow.getChildren().addAll(hBox,room,btns,buttons1,buttons2);

        primaryStage.setTitle("my house");
        primaryStage.setScene(new Scene(flow));
        primaryStage.show();
    }

}