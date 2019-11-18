import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;


public class BankAccountGUI extends Application {

    private TextField pinNum;


    public BankAccountGUI(){

        Font font = new Font(18);

        pinNum = new TextField();
        pinNum.setFont(font);
        pinNum.setPrefWidth(70);
        pinNum.setAlignment(Pos.CENTER);

    }



    @Override
    public void start(Stage primaryStage) {




    }
    public static void main(String[] args) {
        launch(args);
    }
}
