import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class Room7 implements EventHandler<ActionEvent> {
    private Rooms switchb;

    public Room7(Rooms switchb) {
        this.switchb = switchb;
    }

    @Override
    public void handle(ActionEvent event) {
        switchb.SwitchRoom7();
    }
}
