import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class Room5 implements EventHandler<ActionEvent> {
    private Rooms switchc;

    public Room5(Rooms switchc) {
        this.switchc = switchc;
    }

    @Override
    public void handle(ActionEvent event) {
        switchc.SwitchRoom5();
    }
}
