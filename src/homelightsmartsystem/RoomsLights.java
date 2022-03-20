import javafx.event.ActionEvent;
import javafx.event.EventHandler;


class RoomsLights implements EventHandler <ActionEvent> {
   private Rooms switcha;

    public RoomsLights(Rooms switcha) {
        this.switcha = switcha;
    }

    @Override
    public void handle(ActionEvent event) {
        switcha.SwitchAll();
    }
}