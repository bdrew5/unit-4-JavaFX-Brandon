
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.shape.*;


public class CircleRadius extends GridPane {

    private TextField radiusTextField;
    private double rad = 30;
    private Circle circle;

    public CircleRadius() {
        circle = new Circle(80, 80, rad);
        circle.setStroke(Color.WHITE);

        Font font = new Font(18);

        radiusTextField = new TextField();
        radiusTextField.setFont(font);
        radiusTextField.setPrefWidth(70);
        radiusTextField.setAlignment(Pos.CENTER);
        radiusTextField.setOnAction(this::processRadius);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: yellow");


        add(radiusTextField, 1,0);
        add(circle, 1,1);
    }

    public void processRadius(ActionEvent event) {
        double r = Double.parseDouble(radiusTextField.getText());

        circle.setRadius(r);
    }
}
/*
that presents an unlabeled text field in the center of the window surrounded by a circle.
When the user enters a radius value in the text field and presses return, redraw the circle accordingly
 */