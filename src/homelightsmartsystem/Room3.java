
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class Room3 implements EventHandler<ActionEvent> {
    private Rooms switche;

    public Room3(Rooms switche) {
        this.switche = switche;
    }

    @Override
    public void handle(ActionEvent event) {
        switche.SwitchRoom3();
    }
}
