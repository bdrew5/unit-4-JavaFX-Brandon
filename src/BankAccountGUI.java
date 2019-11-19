import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;


public class BankAccountGUI extends Application {

    private TextField pinNum;
    private TextField password;
    private TextField name;
    private double money = 0;

    @Override
    public void start (Stage primaryStage){

        Font font = new Font(18);

        pinNum = new TextField();
        pinNum.setFont(font);
        pinNum.setPrefWidth(70);
        pinNum.setAlignment(Pos.CENTER);
        pinNum.setOnAction(this::processPin);

        password = new TextField();
        password.setFont(font);
        password.setPrefWidth(70);
        password.setAlignment(Pos.CENTER);
        password.setOnAction(this::processPassword);

        name = new TextField();
        name.setFont(font);
        name.setPrefWidth(70);
        name.setAlignment(Pos.CENTER);
        name.setOnAction(this::processName);

        Button create = new Button("Create Account");
        create.setOnAction(this::processCreate);

    }

    public void processPin(ActionEvent event1) {
        double pi = Double.parseDouble(pinNum.getText());
        }

    public void processPassword(ActionEvent event2) {
            double pa = Double.parseDouble(pinNum.getText());
        }

    public void processName(ActionEvent event3) {
                double na = Double.parseDouble(pinNum.getText());
        }

    private void processIncrement(ActionEvent event4){
            return " ";
          }

        public static void main (String[]args){
            launch(args);
        }
    }
