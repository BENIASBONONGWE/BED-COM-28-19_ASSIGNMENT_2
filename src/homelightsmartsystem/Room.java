import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

class Rooms extends StackPane {
   private Rectangle RoomONE;
    private Rectangle RoomTWO;
    private Rectangle RoomTHREE;
    private Rectangle RoomFOUR;
    private Rectangle RoomFIVE;
    private Rectangle RoomSIX;
    private Rectangle RoomSEVEN;
    Rooms(){

        HBox hBox = new HBox();
        RoomONE = new Rectangle(50, 50, 150, 200);
        RoomONE.setFill(Color.GREY);
        RoomONE.setStroke(Color.BLACK);
        Label label1 = new Label("Room 1");
        label1.setLayoutX(90);
        label1.setLayoutY(145);


        RoomTWO = new Rectangle(200, 170, 200, 40);
        RoomTWO.setFill(Color.GREY);
        RoomTWO.setStroke(Color.BLACK);
        Label label2 = new Label("Room 2");
        label2.setLayoutX(270);
        label2.setLayoutY(180);


        RoomTHREE = new Rectangle(200, 50, 100, 120);
        RoomTHREE.setFill(Color.GREY);
        RoomTHREE.setStroke(Color.BLACK);
        Label label3 = new Label("Room 3");
        label3.setLayoutX(230);
        label3.setLayoutY(95);


        RoomFOUR = new Rectangle(300, 50, 100, 120);
        RoomFOUR.setFill(Color.GREY);
        RoomFOUR.setStroke(Color.BLACK);
        Label label4 = new Label("Room 4");
        label4.setLayoutX(320);
        label4.setLayoutY(95);


        RoomFIVE = new Rectangle(400, 50, 120, 160);
        RoomFIVE.setFill(Color.GREY);
        RoomFIVE.setStroke(Color.BLACK);
        Label label5 = new Label("Room 5");
        label5.setLayoutX(440);
        label5.setLayoutY(120);


        RoomSIX = new Rectangle(200, 210, 160, 150);
        RoomSIX.setFill(Color.GREY);
        RoomSIX.setStroke(Color.BLACK);
        Label label6 = new Label("Room 6");
        label6.setLayoutX(260);
        label6.setLayoutY(270);


        RoomSEVEN = new Rectangle(360, 210, 160, 150);
        RoomSEVEN.setFill(Color.GREY);
        RoomSEVEN.setStroke(Color.BLACK);
        Label label7 = new Label("Room 7");
        label7.setLayoutX(430);
        label7.setLayoutY(270);

      Group  pane = new Group();
        pane.getChildren().addAll(RoomONE, label1, RoomTWO, label2, RoomTHREE, label3, RoomFOUR, 
        label4, RoomFIVE, label5, RoomSIX, label6, RoomSEVEN, label7);
        getChildren().addAll(hBox,pane);

    }
    void SwitchAll(){
        if(RoomONE.getFill() == Color.GREY || RoomTWO.getFill() == Color.GREY || RoomTHREE.getFill() == Color.GREY|| 
                RoomFOUR.getFill() == Color.GREY|| RoomFIVE.getFill() == Color.GREY|| RoomSIX.getFill() == 
                Color.GREY|| RoomSEVEN.getFill() == Color.GREY) {
            RoomONE.setFill(Color.YELLOW);
            RoomTWO.setFill(Color.GREEN);
            RoomTHREE.setFill(Color.ORANGE);
            RoomFOUR.setFill(Color.ORANGE);
            RoomFIVE.setFill(Color.YELLOW);
            RoomSIX.setFill(Color.RED);
            RoomSEVEN.setFill(Color.YELLOW);
        }
        else {
            RoomONE.setFill(Color.GREY);
            RoomTWO.setFill(Color.GREY);
            RoomTHREE.setFill(Color.GREY);
            RoomFOUR.setFill(Color.GREY);
            RoomFIVE.setFill(Color.GREY);
            RoomSIX.setFill(Color.GREY);
            RoomSEVEN.setFill(Color.GREY);
        }
    }
 void SwitchTwoRooms(){
         if(RoomONE.getFill() == Color.GREY || RoomTWO.getFill() == Color.GREY) {
             RoomONE.setFill(Color.YELLOW);
             RoomTWO.setFill(Color.GREEN);
         }
         else {
             RoomONE.setFill(Color.GREY);
             RoomTWO.setFill(Color.GREY);
         }
    }
    void SwitchRoom1(){
        if(RoomONE.getFill() == Color.GREY) {
            RoomONE.setFill(Color.YELLOW);
        }
        else {
            RoomONE.setFill(Color.GREY);
        }
    }
    void SwitchRoom2(){
        if(RoomTWO.getFill() == Color.GREY) {
            RoomTWO.setFill(Color.GREEN);
        }
        else {
            RoomTWO.setFill(Color.GREY);
        }
    }
    void SwitchRoom3(){
        if(RoomTHREE.getFill() == Color.GREY) {
            RoomTHREE.setFill(Color.ORANGE);
        }
        else {
            RoomTHREE.setFill(Color.GREY);
        }
    }
    void SwitchRoom4(){
        if(RoomFOUR.getFill() == Color.GREY) {
            RoomFOUR.setFill(Color.ORANGE);
        }
        else {
            RoomFOUR.setFill(Color.GREY);
        }
    }
    void SwitchRoom5(){
        if(RoomFIVE.getFill() == Color.GREY) {
            RoomFIVE.setFill(Color.YELLOW);
        }
        else {
            RoomFIVE.setFill(Color.GREY);
        }
    }
    void SwitchRoom6(){
        if(RoomSIX.getFill() == Color.GREY) {
            RoomSIX.setFill(Color.RED);
        }
        else {
            RoomSIX.setFill(Color.GREY);
        }
    }
    void SwitchRoom7(){
        if(RoomSEVEN.getFill() == Color.GREY) {
            RoomSEVEN.setFill(Color.YELLOW);
        }
        else {
            RoomSEVEN.setFill(Color.GREY);
        }
    }
    
}
