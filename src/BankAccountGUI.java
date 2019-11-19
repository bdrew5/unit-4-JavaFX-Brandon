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

    private TextField pinNum;
    private TextField name;
    private double money = 0;
    private Text pinNumText;
    private Text nameText;


    @Override
    public void start(Stage stage) {

        Font font = new Font(11);

        nameText = new Text("Name");

        pinNumText = new Text("Pin Number");

        pinNum = new TextField();
        pinNum.setFont(font);
        pinNum.setPrefWidth(70);
        pinNum.setAlignment(Pos.CENTER);
        pinNum.setOnAction(this::processPin);

        name = new TextField();
        name.setFont(font);
        name.setPrefWidth(70);
        name.setAlignment(Pos.CENTER);
        name.setOnAction(this::processName);

        Button create = new Button("Create Account");
        create.setOnAction(this::processMake);




        FlowPane pane = new FlowPane(nameText, pinNumText, name, pinNum, create);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: white");

        Scene scene = new Scene(pane,300, 100);

        stage.setTitle("Bank Account");
        stage.setScene(scene);
        stage.show();
    }

    public void processPin(ActionEvent event1) {
        double pi = Double.parseDouble(pinNum.getText());
        }

    public void processName(ActionEvent event3) {
            double na = Double.parseDouble(pinNum.getText());
        }

    public void processMake(ActionEvent event4){
        BankAccount b1 = new BankAccount(na, pi);
        }
    public static void main(String[] args) {
        launch(args);
    }
    }
