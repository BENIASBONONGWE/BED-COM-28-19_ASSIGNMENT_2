import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class Room2 implements EventHandler<ActionEvent> {
    private Rooms switchd;

    public Room2(Rooms switchd) {
        this.switchd = switchd;
    }

    @Override
    public void handle(ActionEvent event) {
        switchd.SwitchRoom2();
    }
}