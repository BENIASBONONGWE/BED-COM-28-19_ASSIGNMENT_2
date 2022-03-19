
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class Room4 implements EventHandler<ActionEvent> {
    private Rooms switchk;

    public Room4(Rooms switchk) {
        this.switchk = switchk;
    }

    @Override
    public void handle(ActionEvent event) {
        switchk.SwitchRoom4();
    }
}
