import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;



public class BankAccountGUI extends Application {

    private TextField pinNum1;
    private TextField pinNum2;
    private TextField name;
    private double money = 0;
    private Text pinNumText1;
    private Text pinNumText2;
    private Text nameText;
    private String n;
    private int pin;


    @Override
    public void start(Stage stage) {

        Font font = new Font(11);

        nameText = new Text("Name");

        pinNumText1 = new Text("Pin Number");
        pinNumText2 = new Text("Pin Number");

        pinNum1 = new TextField();
        pinNum1.setFont(font);
        pinNum1.setPrefWidth(70);
        pinNum1.setAlignment(Pos.CENTER);
        pinNum1.setOnAction(this::processPin1);

        pinNum2 = new TextField();
        pinNum2.setFont(font);
        pinNum2.setPrefWidth(70);
        pinNum2.setAlignment(Pos.CENTER);
        pinNum2.setOnAction(this::processPin2);

        name = new TextField();
        name.setFont(font);
        name.setPrefWidth(70);
        name.setAlignment(Pos.CENTER);
        name.setOnAction(this::processName);

        Button create = new Button("Create Account");
        create.setOnAction(this::processMake);




        FlowPane pane = new FlowPane(nameText, pinNumText1, pinNumText2, pinNum2, name, pinNum, create);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: white");

        Scene scene = new Scene(pane,300, 100);

        stage.setTitle("Bank Account");
        stage.setScene(scene);
        stage.show();
    }

    public void processPin1(ActionEvent event1) {
        int pi1 = int.parseInt(pinNum.getText());
    }
    public void processPin1(ActionEvent event1) {
        int pi2 = int.parseInt(pinNum.getText());
    }

    public void processName(ActionEvent event3) {
        String na = String.parseString(name.getText());

    }

    public void processMake(ActionEvent event4){
        BankAccount b1 = new BankAccount(na, pi1);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
