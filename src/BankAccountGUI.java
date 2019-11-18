import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;


public class BankAccountGUI extends Application {

    private TextField pinNum;
    private double money = 0;

    @Override
    public void start (Stage primaryStage){

        Font font = new Font(18);

        pinNum = new TextField();
        pinNum.setFont(font);
        pinNum.setPrefWidth(70);
        pinNum.setAlignment(Pos.CENTER);
        pinNum.setOnAction(this::processPin);

    }

    public void processPin(ActionEvent event) {
        double r = Double.parseDouble(pinNum.getText());



        }
        public static void main (String[]args){
            launch(args);
        }
    }
