import homelightsmartsystem.RoomsInterface;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

class Rooms extends StackPane implements RoomsInterface{
   private final Rectangle RoomONE;
    private final Rectangle RoomTWO;
    private final Rectangle RoomTHREE;
    private final Rectangle RoomFOUR;
    private final Rectangle RoomFIVE;
    private final Rectangle RoomSIX;
    private final Rectangle RoomSEVEN;
    Rooms(){
        HBox hBox = new HBox();
        Line line=new Line();
        RoomONE = new Rectangle(70, 70, 170, 220);
        RoomONE.setFill(Color.GREY);
        RoomONE.setStroke(Color.BLACK);
        RoomONE.setStroke(Color.BLACK);
        RoomONE.setStrokeWidth(2);
        Label label1 = new Label("Room 1");
        label1.setLayoutX(115);
        label1.setLayoutY(165);
         line.setStartX(150);
        line.setEndX(190);
        line.setStartY(290);
        line.setEndY(290);
        line.setStrokeWidth(3);

 Line line1=new Line();
        RoomTWO = new Rectangle(220, 200, 280, 160);
        RoomTWO.setFill(Color.GREY);
        RoomTWO.setStroke(Color.BLACK);
        RoomTWO.setStrokeWidth(2);
        Label label2 = new Label("Room 2");
        label2.setLayoutX(295);
        label2.setLayoutY(210);
        RoomTHREE = new Rectangle(220, 70, 120, 140);
        line1.setStartX(240);
        line1.setEndX(260);
        line1.setStartY(230);
        line1.setEndY(230);
        line1.setStrokeWidth(3);
       Line line2=new Line();
        RoomTHREE.setFill(Color.GREY);
        RoomTHREE.setStroke(Color.BLACK);
        RoomTHREE.setStrokeWidth(2);
        Label label3 = new Label("Room 3");
        label3.setLayoutX(250);
        label3.setLayoutY(140);
        line2.setStartX(220);
        line2.setEndX(220);
        line2.setStartY(215);
        line2.setEndY(225);
        line2.setStrokeWidth(3);
 Line line3=new Line();
        RoomFOUR = new Rectangle(320, 70, 120, 140);
        RoomFOUR.setFill(Color.GREY);
        RoomFOUR.setStroke(Color.BLACK);
        RoomFOUR.setStrokeWidth(2);
        Label label4 = new Label("Room 4");
        label4.setLayoutX(340);
        label4.setLayoutY(140);
        line3.setStartX(240);
        line3.setEndX(260);
        line3.setStartY(210);
        line3.setEndY(210);
        line3.setStrokeWidth(3);
       Line line4=new Line();


        RoomFIVE = new Rectangle(420, 70, 140, 180);
        RoomFIVE.setFill(Color.GREY);
        RoomFIVE.setStroke(Color.BLACK);
        RoomFIVE.setStrokeWidth(2);
        Label label5 = new Label("Room 5");
        label5.setLayoutX(460);
        label5.setLayoutY(140);
        line4.setStartX(360);
        line4.setEndX(380);
        line4.setStartY(210);
        line4.setEndY(210);
        line4.setStrokeWidth(3);

 Line line5=new Line();
        RoomSIX = new Rectangle(220, 230, 180, 170);
        RoomSIX.setFill(Color.GREY);
        RoomSIX.setStroke(Color.BLACK);
        Label label6 = new Label("Room 6");
        label6.setLayoutX(280);
        label6.setLayoutY(300);
        line5.setStartX(390);
        line5.setEndX(400);
        line5.setStartY(230);
        line5.setEndY(230);
        line5.setStrokeWidth(3);

Line line6=new Line();
        RoomSEVEN = new Rectangle(380, 230, 180, 170);
        RoomSEVEN.setFill(Color.GREY);
        RoomSEVEN.setStroke(Color.BLACK);
        RoomSEVEN.setStrokeWidth(2);
        Label label7 = new Label("Room 7");
        label7.setLayoutX(440);
        label7.setLayoutY(300);
line6.setStartX(420);
        line6.setEndX(420);
        line6.setStartY(215);
        line6.setEndY(225);
        line6.setStrokeWidth(3);
      Group  pane = new Group();
        pane.getChildren().addAll(RoomONE, label1, RoomTWO, label2, RoomTHREE, label3, RoomFOUR, 
        label4, RoomFIVE, label5, RoomSIX, label6, RoomSEVEN, label7,line,line1,line2,line3,line4,line5,line6);
        getChildren().addAll(hBox,pane);

    }
   @Override
    public void SwitchAll(){
        if(RoomONE.getFill() == Color.GREY || RoomTWO.getFill() == 
                Color.GREY || RoomTHREE.getFill() == Color.GREY|| 
                RoomFOUR.getFill() == Color.GREY|| RoomFIVE.getFill() == 
                Color.GREY|| RoomSIX.getFill() == 
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
   @Override
 public void SwitchTwoRooms(){
         if(RoomONE.getFill() == Color.GREY || RoomTWO.getFill() == Color.GREY) {
             RoomONE.setFill(Color.YELLOW);
             RoomTWO.setFill(Color.GREEN);
         }
         else {
             RoomONE.setFill(Color.GREY);
             RoomTWO.setFill(Color.GREY);
         }
    }
 @Override
    public void SwitchRoom1(){
        if(RoomONE.getFill() == Color.GREY) {
            RoomONE.setFill(Color.YELLOW);
        }
        else {
            RoomONE.setFill(Color.GREY);
        }
    }
   @Override
    public void SwitchRoom2(){
        if(RoomTWO.getFill() == Color.GREY) {
            RoomTWO.setFill(Color.GREEN);
        }
        else {
            RoomTWO.setFill(Color.GREY);
        }
    }
   @Override
    public void SwitchRoom3(){
        if(RoomTHREE.getFill() == Color.GREY) {
            RoomTHREE.setFill(Color.ORANGE);
        }
        else {
            RoomTHREE.setFill(Color.GREY);
        }
    }
    @Override
    public void SwitchRoom4(){
        if(RoomFOUR.getFill() == Color.GREY) {
            RoomFOUR.setFill(Color.ORANGE);
        }
        else {
            RoomFOUR.setFill(Color.GREY);
        }
    }
   @Override
    public void SwitchRoom5(){
        if(RoomFIVE.getFill() == Color.GREY) {
            RoomFIVE.setFill(Color.YELLOW);
        }
        else {
            RoomFIVE.setFill(Color.GREY);
        }
    }
   @Override
    public void SwitchRoom6(){
        if(RoomSIX.getFill() == Color.GREY) {
            RoomSIX.setFill(Color.RED);
        }
        else {
            RoomSIX.setFill(Color.GREY);
        }
    }
   @Override
    public void SwitchRoom7(){
        if(RoomSEVEN.getFill() == Color.GREY) {
            RoomSEVEN.setFill(Color.YELLOW);
        }
        else {
            RoomSEVEN.setFill(Color.GREY);
        }
    }
    
}
