
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class Room6 implements EventHandler<ActionEvent> {
    private Rooms switchb;

    public Room6(Rooms switchb) {
        this.switchb = switchb;
    }

    @Override
    public void handle(ActionEvent event) {
        switchb.SwitchRoom6();
    }
}
