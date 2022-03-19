import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class TwoRooms implements EventHandler<ActionEvent> {
    private Rooms switchf;

    public TwoRooms(Rooms switchf) {
        this.switchf = switchf;
    }

    @Override
    public void handle(ActionEvent event) {
        switchf.SwitchTwoRooms();
    }
}

