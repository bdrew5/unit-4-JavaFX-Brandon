import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CircleRadiusClient extends Application {
    public void start(Stage stage) {
        Scene scene = new Scene(new CircleRadius(), 500, 500);

        stage.setTitle("Radius");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}