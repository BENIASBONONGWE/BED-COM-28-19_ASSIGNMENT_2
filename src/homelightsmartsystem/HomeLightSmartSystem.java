/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homelightsmartsystem;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author STAR LIGHT COMP TECH
 */
public class HomeLightSmartSystem extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
         root.setPadding(new Insets(30, 30, 300, 300));
        root.setTop(getHBox());
 root.setLeft(getVBox());
        
       
        Scene scene = new Scene((root), 3000, 2500);
        
        primaryStage.setTitle("Smart home light system");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private Group getHBox() {
        Group group=new Group();
        
        Rectangle y1=new Rectangle(50,50,150,200);
        y1.setStroke(Color.BLACK);
y1.setFill(Color.YELLOW);

y1.setStyle("-fx-border-color: blue;");
         Rectangle y2=new Rectangle(200,50,100,120);
            y2.setStroke(Color.BLACK);
 y2.setFill(Color.RED);
          Rectangle y3=new Rectangle(300,50,100,120);
           y3.setStroke(Color.BLACK);
 y3.setFill(Color.RED);
           Rectangle y4=new Rectangle(200,170,200,40);
             y4.setStroke(Color.BLACK);
 y4.setFill(Color.GREEN);
            Rectangle y5=new Rectangle(400,50,120,160);
             y5.setStroke(Color.BLACK);
 y5.setFill(Color.YELLOW);
    Rectangle y6=new Rectangle(200,210,160,150);
              y6.setStroke(Color.BLACK);
 y6.setFill(Color.RED);
    Rectangle y7=new Rectangle(360,210,160,150);
             y7.setStroke(Color.BLACK);
 y7.setFill(Color.YELLOW);
           // Group group = new Group();
           
             
            group.getChildren().add(y1);
            group.getChildren().add(y2);
            group.getChildren().add(y3);
            group.getChildren().add(y4);
            group.getChildren().add(y5);
            group.getChildren().add(y6);
            group.getChildren().add(y7);
            
            Label label = new Label("Room1");
            label.setLayoutX(100);
            label.setLayoutY(150);
            //labeling room 2
            Label label4 = new Label("Room2");
            label4.setLayoutX(270);
            label4.setLayoutY(180);
            Label label2 = new Label("Room4");
            label2.setLayoutX(320);
            label2.setLayoutY(100);
            Label label3 = new Label("Room3");
            label3.setLayoutX(220);
            label3.setLayoutY(100);
            
            Label label5 = new Label("Room6");
            label5.setLayoutX(270);
            label5.setLayoutY(280);
            Label label6 = new Label("Room7");
            label6.setLayoutX(400);
            label6.setLayoutY(280);
             Label label7 = new Label("Room5");
            label7.setLayoutX(435);
            label7.setLayoutY(120);
 group.getChildren().addAll(label,label2,label3,label4,label5,label6,label7);
 return group;
    }

    private GridPane getVBox() {
        GridPane gridPane=new GridPane();
       Button bt1=new Button("All Rooms on/off");
       Button bt2=new Button(" Room 2 on/off");
       Button bt3=new Button("Room5 on/off");
       Button bt4=new Button("Room 1&2 on/off");
       Button bt5=new Button("Room 3 on/off");
       Button bt6=new Button(" Room 6 on/off");
       Button bt7=new Button("Room 1 on/off");
       Button bt8=new Button("Room 4 on/off");
       Button bt9=new Button(" Room 7 on/off");
       
       
gridPane.setConstraints((bt1),1,0);
Handlerbt1 handler1 = new Handlerbt1();
bt1.setOnAction(handler1);
gridPane.setConstraints((bt2),2,0);
gridPane.setConstraints((bt3),3,0);
gridPane.setConstraints((bt4),1,1);
gridPane.setConstraints((bt5),2,1);
gridPane.setConstraints((bt6),3,1);
gridPane.setConstraints((bt7),1,2);
gridPane.setConstraints((bt8),2,2);
gridPane.setConstraints((bt9),3,2);

      gridPane.setPadding(new Insets(100, 100, 30, 30));
       gridPane.setHgap(50);
gridPane.setVgap(30);
      /*  bt.add(new Button("All Rooms on/off"), 1, 0);
        bt.add(new Button(" Room 2 on/off"), 2, 0);
        bt.add(new Button("Room5 on/off"), 3, 0);
        bt.add(new Button("Room 1&2 on/off" ), 1, 2);
        bt.add(new Button(), 2, 2);
        bt.add(new Button(" Room 6 on/off"), 3, 2);
        bt.add(new Button("Room 1 on/off"), 1, 3);
         bt.add(new Button("Room 4 on/off"), 2, 3);
          bt.add(new Button(" Room 7 on/off"), 3, 3);
        return bt;*/
      gridPane.getChildren().addAll(bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9);
      return gridPane;
    }

    private Object heightProperty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     class Handlerbt1 implements  EventHandler<ActionEvent> {

       

        @Override
        public void handle(ActionEvent event) {
            System.out.println(Color.RED);
        }
    }
      
}
