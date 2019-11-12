import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoButtons extends Application {

    private int count;
    private Text countText;

    @Override
    public void start(Stage stage) {
        count = 50;
        countText = new Text("Number: 50");

        Button incr = new Button("Increment");
        incr.setOnAction(this::processIncrement);

        Button decr = new Button("Decrement");
        decr.setOnAction(this::processDecrement);

        FlowPane pane = new FlowPane(incr, countText, decr);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: red");

        Scene scene = new Scene(pane, 300, 100);

        stage.setTitle("Increment Decrement");
        stage.setScene(scene);
        stage.show();

    }
    private void processIncrement(ActionEvent event1){
        count ++;
        countText.setText("Number: " + count);
    }
    private void processDecrement(ActionEvent event2){
        count --;
        countText.setText("Number: " +count);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
