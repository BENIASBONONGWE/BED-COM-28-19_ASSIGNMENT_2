import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Room1 implements EventHandler<ActionEvent> {
    private Rooms switchy;

    public Room1(Rooms switchy) {
        this.switchy = switchy;
    }

    @Override
    public void handle(ActionEvent event) {
      switchy.SwitchRoom1();
    }
}
