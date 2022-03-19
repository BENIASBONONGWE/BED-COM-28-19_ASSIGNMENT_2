import javafx.event.ActionEvent;
import javafx.event.EventHandler;


class LightsOn implements EventHandler <ActionEvent> {
   private Rooms switcha;

    public LightsOn(Rooms switcha) {
        this.switcha = switcha;
    }

    @Override
    public void handle(ActionEvent event) {
        switcha.SwitchAll();
    }
}